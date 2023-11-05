package com.sigabem.service.dto;

/**
 * Classe que representa os dados obtidos a partir de uma consulta ao serviço ViaCep.
 */
public class ViaCepDTO {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;

	/**
	 * Obtém o CEP.
	 *
	 * @return O CEP.
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Define o CEP.
	 *
	 * @param cep O CEP a ser definido.
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * Obtém o logradouro.
	 *
	 * @return O logradouro.
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * Define o logradouro.
	 *
	 * @param logradouro O logradouro a ser definido.
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * Obtém o complemento.
	 *
	 * @return O complemento.
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * Define o complemento.
	 *
	 * @param complemento O complemento a ser definido.
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * Obtém o bairro.
	 *
	 * @return O bairro.
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Define o bairro.
	 *
	 * @param bairro O bairro a ser definido.
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Obtém a localidade.
	 *
	 * @return A localidade.
	 */
	public String getLocalidade() {
		return localidade;
	}

	/**
	 * Define a localidade.
	 *
	 * @param localidade A localidade a ser definida.
	 */
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	/**
	 * Obtém a UF (Unidade Federativa).
	 *
	 * @return A UF.
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * Define a UF.
	 *
	 * @param uf A UF a ser definida.
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * Obtém o código IBGE.
	 *
	 * @return O código IBGE.
	 */
	public String getIbge() {
		return ibge;
	}

	/**
	 * Define o código IBGE.
	 *
	 * @param ibge O código IBGE a ser definido.
	 */
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	/**
	 * Obtém o GIA (Guia de Informação e Apuração).
	 *
	 * @return O GIA.
	 */
	public String getGia() {
		return gia;
	}

	/**
	 * Define o GIA.
	 *
	 * @param gia O GIA a ser definido.
	 */
	public void setGia(String gia) {
		this.gia = gia;
	}

	/**
	 * Obtém o DDD (Código de Discagem Direta).
	 *
	 * @return O DDD.
	 */
	public String getDdd() {
		return ddd;
	}

	/**
	 * Define o DDD.
	 *
	 * @param ddd O DDD a ser definido.
	 */
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	/**
	 * Obtém o código SIAFI (Sistema de Administração Financeira).
	 *
	 * @return O código SIAFI.
	 */
	public String getSiafi() {
		return siafi;
	}

	/**
	 * Define o código SIAFI.
	 *
	 * @param siafi O código SIAFI a ser definido.
	 */
	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}
}