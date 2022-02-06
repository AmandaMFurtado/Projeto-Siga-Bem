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


@Controller
@RequestMapping("/sigabem")
@CrossOrigin(origins="*", allowedHeaders = "*")
@Tag(name = "SigaBemController", description = "Calcular Frete")
public class SigaBemController implements SigaBemApiController {
	
	@Autowired
	private SigaBemService sigaBemService ;
	
	@Operation(summary = "Calcula o valor do frete", description = "Calculo do Frete")
	@PostMapping
	public ResponseEntity<FreteRespostaDTO> postSigaBem(@Valid @RequestBody FreteRequisicaoDTO freteRequisicaoDTO){
		FreteRespostaDTO freteRespostaDTO = sigaBemService.calcularFrete(freteRequisicaoDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(freteRespostaDTO);
	}
	
}