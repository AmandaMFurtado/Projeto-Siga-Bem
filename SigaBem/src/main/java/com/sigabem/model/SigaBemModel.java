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

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Double getPeso() {
			return peso;
		}

		public void setPeso(Double peso) {
			this.peso = peso;
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

		public String getNomeDestinatario() {
			return nomeDestinatario;
		}

		public void setNomeDestinatario(String nomeDestinatario) {
			this.nomeDestinatario = nomeDestinatario;
		}

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

		public LocalDateTime getDataConsulta() {
			return dataConsulta;
		}

		public void setDataConsulta(LocalDateTime dataConsulta) {
			this.dataConsulta = dataConsulta;
		}

		
}


