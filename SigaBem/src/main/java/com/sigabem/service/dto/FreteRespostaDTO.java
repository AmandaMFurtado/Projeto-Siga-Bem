package com.sigabem.service.dto;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "FreteRespostaDTOO")
@Schema(name = "FFreteRespostaDTO", description = "Resposta de saída")
public class FreteRespostaDTO {

	@Schema(name = "vlTotalFrete", description = "Valor total do frete", required = true)
	private Double vlTotalFrete;

	@Schema(name = "dataPrevistaEntrega", description = "Data prevista para entrega", required = true)
	private LocalDate dataPrevistaEntrega;

	@Schema(name = "cepOrigem", description = "CEP  de origem", required = true)
	private String cepOrigem;

	@Schema(name = "cepDestino", description = "CEP de destino", required = true)
	private String cepDestino;

	public Double getVlTotalFrete() {
		return vlTotalFrete;
	}

	public void setVlTotalFrete(Double vlTotalFrete) {
		this.vlTotalFrete = vlTotalFrete;
	}

	public LocalDate getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}

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

}
