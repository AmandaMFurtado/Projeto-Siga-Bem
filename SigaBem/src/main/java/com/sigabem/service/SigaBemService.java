package com.sigabem.service;

import com.sigabem.service.dto.FreteRequisicaoDTO;
import com.sigabem.service.dto.FreteRespostaDTO;

/**
 * Interface que define o serviço Siga Bem para cálculo de frete.
 */
public interface SigaBemService {

	/**
	 * Calcula o valor do frete com base nas informações de requisição.
	 *
	 * @param freteRequisicaoDTO O DTO contendo as informações de requisição.
	 * @return Um DTO com as informações do frete calculado.
	 */
	FreteRespostaDTO calcularFrete(FreteRequisicaoDTO freteRequisicaoDTO);
	
}
