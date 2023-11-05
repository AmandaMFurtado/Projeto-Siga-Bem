package com.sigabem.service.dto;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Classe que representa uma resposta de saída para o cálculo de frete no projeto Siga Bem.
 */
@Tag(name = "FreteRespostaDTOO")
@Schema(name = "FreteRespostaDTO", description = "Resposta de saída")
public class FreteRespostaDTO {

	@Schema(name = "vlTotalFrete", description = "Valor total do frete", required = true)
	private Double vlTotalFrete;

	@Schema(name = "dataPrevistaEntrega", description = "Data prevista para entrega", required = true)
	private LocalDate dataPrevistaEntrega;

	@Schema(name = "cepOrigem", description = "CEP  de origem", required = true)
	private String cepOrigem;

	@Schema(name = "cepDestino", description = "CEP de destino", required = true)
	private String cepDestino;

	/**
	 * Obtém o valor total do frete.
	 *
	 * @return O valor total do frete.
	 */
	public Double getVlTotalFrete() {
		return vlTotalFrete;
	}

	/**
	 * Define o valor total do frete.
	 *
	 * @param vlTotalFrete O valor total do frete.
	 */
	public void setVlTotalFrete(Double vlTotalFrete) {
		this.vlTotalFrete = vlTotalFrete;
	}

	/**
	 * Obtém a data prevista para entrega.
	 *
	 * @return A data prevista para entrega.
	 */
	public LocalDate getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	/**
	 * Define a data prevista para entrega.
	 *
	 * @param dataPrevistaEntrega A data prevista para entrega.
	 */
	public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
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
}