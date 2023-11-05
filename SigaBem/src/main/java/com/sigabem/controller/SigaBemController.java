package com.sigabem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sigabem.controller.api.SigaBemApiController;
import com.sigabem.service.SigaBemService;
import com.sigabem.service.dto.FreteRequisicaoDTO;
import com.sigabem.service.dto.FreteRespostaDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Classe que representa o controlador para o cálculo de frete no projeto Siga Bem.
 */
@Controller
@RequestMapping("/sigabem")
@CrossOrigin(origins="*", allowedHeaders = "*")
@Tag(name = "SigaBemController", description = "Calcular Frete")
public class SigaBemController implements SigaBemApiController {
	
	@Autowired
	private SigaBemService sigaBemService ;

	/**
	 * Método que lida com a requisição POST para calcular o valor do frete.
	 *
	 * @param freteRequisicaoDTO Objeto de requisição que contém informações para o cálculo de frete.
	 * @return ResponseEntity contendo a resposta do cálculo de frete.
	 */
	@Operation(summary = "Calcula o valor do frete", description = "Calculo do Frete")
	@PostMapping
	public ResponseEntity<FreteRespostaDTO> postSigaBem(@Valid @RequestBody FreteRequisicaoDTO freteRequisicaoDTO){
		FreteRespostaDTO freteRespostaDTO = sigaBemService.calcularFrete(freteRequisicaoDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(freteRespostaDTO);
	}
	
}