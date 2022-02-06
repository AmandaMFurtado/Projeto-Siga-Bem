package com.sigabem.controller.api;

import org.springframework.http.ResponseEntity;

import com.sigabem.service.dto.FreteRequisicaoDTO;
import com.sigabem.service.dto.FreteRespostaDTO;


public interface SigaBemApiController {

	ResponseEntity<FreteRespostaDTO> postSigaBem(FreteRequisicaoDTO freteRequisicaoDTO);
}
