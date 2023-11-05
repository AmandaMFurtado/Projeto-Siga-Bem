package com.sigabem.service.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sigabem.service.dto.ViaCepDTO;

@FeignClient(name = "via-cep", url = "${app.sigabem.url.viacep}")
public interface ViaCepService {

	/**
	 * Realiza uma chamada ao serviço ViaCep para buscar informações de um CEP especificado.
	 *
	 * @param zip O CEP a ser consultado.
	 * @return Um objeto ViaCepDTO contendo as informações relacionadas ao CEP.
	 */
	@GetMapping( path = "/ws/{zip-code}/json/", consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE )
	ViaCepDTO buscarCep( @PathVariable("zip-code") String zip );
}
