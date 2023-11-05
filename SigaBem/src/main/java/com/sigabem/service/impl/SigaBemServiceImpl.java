package com.sigabem.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import com.sigabem.model.SigaBemModel;
import com.sigabem.repository.SigaBemRepository;
import com.sigabem.service.SigaBemService;
import com.sigabem.service.dto.FreteRequisicaoDTO;
import com.sigabem.service.dto.FreteRespostaDTO;
import com.sigabem.service.dto.ViaCepDTO;
import com.sigabem.service.feign.ViaCepService;

/**
 * Implementação do serviço SigaBem para cálculo de frete.
 */
@Service
public class SigaBemServiceImpl implements SigaBemService {

	
	@Autowired
	private ViaCepService viaCepService;
	
	@Autowired
	private SigaBemRepository sigaBemRepository;
	
	@Value("${app.sigabem.valor.kilo}")
	private Double valorKilo;


	/**
	 * Calcula o valor do frete com base nas informações de requisição.
	 *
	 * @param freteRequisicaoDTO O DTO contendo as informações de requisição.
	 * @return Um DTO com as informações do frete calculado.
	 */
	@Override
	@Transactional
	public FreteRespostaDTO calcularFrete(FreteRequisicaoDTO freteRequisicaoDTO) {

		// Obtendo o CEP Origem
		ViaCepDTO cepOrigem = viaCepService.buscarCep( freteRequisicaoDTO.getCepOrigem());

		if (cepOrigem.getDdd() == null)  throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CEP de origem inexistente");
		
		// Obtendo o CEP Destino
		ViaCepDTO cepDestino = viaCepService.buscarCep( freteRequisicaoDTO.getCepDestino());

		if (cepDestino.getDdd() == null)  throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CEP de destino inexistente");
		
		Double valorFreteCalculado = freteRequisicaoDTO.getPeso() * valorKilo;
		Long diasEntrega = 10L;

		if( cepDestino.getDdd().equals( cepOrigem.getDdd())) {
			valorFreteCalculado -= ( valorFreteCalculado / 100 ) * 50;
			diasEntrega = 1L;
		}
		
		if( cepDestino.getUf().equals( cepOrigem.getUf() ) && !cepDestino.getDdd().equals( cepOrigem.getDdd())) {
			valorFreteCalculado -= ( valorFreteCalculado / 100 ) * 75;
			diasEntrega = 3L;
		}
		
		LocalDate dataPrevisaoEntrega =LocalDate.now().plusDays(diasEntrega);
		
		FreteRespostaDTO freteRespostaDTO = new FreteRespostaDTO();
		freteRespostaDTO.setCepDestino( freteRequisicaoDTO.getCepDestino() );
		freteRespostaDTO.setCepOrigem( freteRequisicaoDTO.getCepOrigem() );
		freteRespostaDTO.setDataPrevistaEntrega( dataPrevisaoEntrega );
		freteRespostaDTO.setVlTotalFrete( valorFreteCalculado );	
		
		// Gravar no banco
		gravarCaluloFrete(freteRequisicaoDTO,freteRespostaDTO);
		
		return freteRespostaDTO;
		
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	public class CepOrigemNaoEncontradoException extends RuntimeException {
		public CepOrigemNaoEncontradoException() {
			super("CEP de origem inexistente");
		}
	}


	/**
	 * Grava o cálculo do frete no banco de dados.
	 *
	 * @param freteRequisicaoDTO O DTO contendo as informações de requisição.
	 * @param freteRespostaDTO O DTO contendo as informações do frete calculado.
	 */
	private void gravarCaluloFrete( FreteRequisicaoDTO freteRequisicaoDTO , FreteRespostaDTO freteRespostaDTO ) {
		SigaBemModel sigaBemModel = new SigaBemModel();
		sigaBemModel.setCepDestino( freteRespostaDTO.getCepDestino() );
		sigaBemModel.setCepOrigem(freteRespostaDTO.getCepOrigem());
		sigaBemModel.setDataPrevistaEntrega(freteRespostaDTO.getDataPrevistaEntrega());
		sigaBemModel.setNomeDestinatario(freteRequisicaoDTO.getNomeDestinatario());
		sigaBemModel.setPeso(freteRequisicaoDTO.getPeso());
		sigaBemModel.setVlTotalFrete(freteRespostaDTO.getVlTotalFrete());
		sigaBemModel.setDataConsulta(LocalDateTime.now());
		sigaBemRepository.save(sigaBemModel);
	}

}
