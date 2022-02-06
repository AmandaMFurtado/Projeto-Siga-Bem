package com.sigabem.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sigabem.model.SigaBemModel;
import com.sigabem.repository.SigaBemRepository;
import com.sigabem.service.SigaBemService;
import com.sigabem.service.dto.FreteRequisicaoDTO;
import com.sigabem.service.dto.FreteRespostaDTO;
import com.sigabem.service.dto.ViaCepDTO;
import com.sigabem.service.feign.ViaCepService;

@Service
public class SigaBemServiceImpl implements SigaBemService {

	
	@Autowired
	private ViaCepService viaCepService;
	
	@Autowired
	private SigaBemRepository sigaBemRepository;
	
	@Value("${app.sigabem.valor.kilo}")
	private Double valorKilo;
	
	@Override
	@Transactional
	public FreteRespostaDTO calcularFrete(FreteRequisicaoDTO freteRequisicaoDTO) {

		// Obtendo o CEP Origem
		ViaCepDTO cepOrigem = viaCepService.buscarCep( freteRequisicaoDTO.getCepOrigem());

		// Obtendo o CEP Destino
		ViaCepDTO cepDestino = viaCepService.buscarCep( freteRequisicaoDTO.getCepDestino());
		
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
