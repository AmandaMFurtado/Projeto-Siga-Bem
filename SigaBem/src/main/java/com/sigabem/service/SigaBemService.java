package com.sigabem.service;

import com.sigabem.service.dto.FreteRequisicaoDTO;
import com.sigabem.service.dto.FreteRespostaDTO;

public interface SigaBemService {

	FreteRespostaDTO calcularFrete(FreteRequisicaoDTO freteRequisicaoDTO);
	
}
