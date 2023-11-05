package com.sigabem.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

/**
 * Classe que representa o modelo de dados para informações de frete no projeto Siga Bem.
 */
@Entity
@Table(name = "tb_sigabem")
public class SigaBemModel {	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "peso")
		private Double peso;
		
		@Column(name = "cep_origem")
		private String cepOrigem;
		
		@Column(name = "cep_destino")
		private String cepDestino;
		
		@Column(name = "nome_destinatario")
		private String nomeDestinatario;

		@Column(name = "vl_frete")
		private Double vlTotalFrete;		
		
		@Column(name = "data_prevista_entrega")
		private LocalDate dataPrevistaEntrega;
		
		@Column(name = "data_consulta")
		@UpdateTimestamp
		private LocalDateTime dataConsulta;

	/**
	 * Obtém o ID do registro.
	 *
	 * @return O ID do registro.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Define o ID do registro.
	 *
	 * @param id O ID do registro.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Obtém o peso do frete.
	 *
	 * @return O peso do frete.
	 */
	public Double getPeso() {
		return peso;
	}

	/**
	 * Define o peso do frete.
	 *
	 * @param peso O peso do frete.
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
	 * Obtém a data prevista de entrega.
	 *
	 * @return A data prevista de entrega.
	 */
	public LocalDate getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	/**
	 * Define a data prevista de entrega.
	 *
	 * @param dataPrevistaEntrega A data prevista de entrega.
	 */
	public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}

	/**
	 * Obtém a data da consulta.
	 *
	 * @return A data da consulta.
	 */
	public LocalDateTime getDataConsulta() {
		return dataConsulta;
	}

	/**
	 * Define a data da consulta.
	 *
	 * @param dataConsulta A data da consulta.
	 */
	public void setDataConsulta(LocalDateTime dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
}


