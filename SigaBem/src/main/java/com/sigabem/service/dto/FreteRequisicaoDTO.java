package com.sigabem.service.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "FreteRequisicaoDTO")
@Schema(name = "FreteRequisicaoDTO", description = "Requisição de entrada")
public class FreteRequisicaoDTO {

	@NotBlank(message = "O valor do peso é obrigatorio!")
	@Schema(name = "peso", description = " Peso da carga", required = true)
	private Double peso;

	@NotBlank(message = "O CEP é obrigatorio !")
	@Size(max = 8)
	@Schema(name = "cepOrigem", description = " CEP  de origem", required = true)
	private String cepOrigem;

	@NotBlank(message = "O CEP é obrigatorio !")
	@Size(max = 8)
	@Schema(name = "cepDestino", description = "CEP de destino", required = true)
	private String cepDestino;

	@NotBlank(message = "O nome do destinatario é obrigatorio!")
	@Schema(name = "nomeDestinatario", description = "Nome do destinatario", required = true)
	private String nomeDestinatario;

	public String getCepOrigem() {
		return cepOrigem;
	}

	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}

	public String getCepDestino() {
		return cepDestino;
	}

	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

}
