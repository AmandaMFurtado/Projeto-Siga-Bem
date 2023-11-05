package com.sigabem.controller.api;

import org.springframework.http.ResponseEntity;

import com.sigabem.service.dto.FreteRequisicaoDTO;
import com.sigabem.service.dto.FreteRespostaDTO;

/**
 * Interface que define a API do controlador para cálculo de frete no projeto Siga Bem.
 */
public interface SigaBemApiController {

	/**
	 * Método que lida com a requisição POST para calcular o valor do frete.
	 *
	 * @param freteRequisicaoDTO Objeto de requisição que contém informações para o cálculo de frete.
	 * @return ResponseEntity contendo a resposta do cálculo de frete.
	 */
	ResponseEntity<FreteRespostaDTO> postSigaBem(FreteRequisicaoDTO freteRequisicaoDTO);
}
