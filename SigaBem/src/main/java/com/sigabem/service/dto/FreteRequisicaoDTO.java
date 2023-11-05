package com.sigabem.service.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;


/**
 * Classe que representa uma requisição de entrada para cálculo de frete no projeto Siga Bem.
 */
@Tag(name = "FreteRequisicaoDTO")
@Schema(name = "FreteRequisicaoDTO", description = "Requisição de entrada")
public class FreteRequisicaoDTO {

	@NotNull
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

	/**
	 * Obtém o peso da carga.
	 *
	 * @return O peso da carga.
	 */
	public Double getPeso() {
		return peso;
	}

	/**
	 * Define o peso da carga.
	 *
	 * @param peso O peso da carga.
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	/**
	 * Obtém o CEP de origem.
	 *
	 * @return O CEP de origem.
	 */
	public String getCepOrigem() {
		return cepOrigem;
	}

	/**
	 * Define o CEP de origem.
	 *
	 * @param cepOrigem O CEP de origem.
	 */
	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}

	/**
	 * Obtém o CEP de destino.
	 *
	 * @return O CEP de destino.
	 */
	public String getCepDestino() {
		return cepDestino;
	}

	/**
	 * Define o CEP de destino.
	 *
	 * @param cepDestino O CEP de destino.
	 */
	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}

	/**
	 * Obtém o nome do destinatário.
	 *
	 * @return O nome do destinatário.
	 */
	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	/**
	 * Define o nome do destinatário.
	 *
	 * @param nomeDestinatario O nome do destinatário.
	 */
	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
}