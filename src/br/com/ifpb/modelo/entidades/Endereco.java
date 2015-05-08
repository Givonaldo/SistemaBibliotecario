package br.com.ifpb.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco implements Serializable {
	
	@Column(name = "RUA_ENDERECO")
	private String rua;
	
	@Column(name = "NUMERO_ENDERECO")
	private String numero;
	
	@Column(name = "BAIRRO_ENDERECO")
	private String bairro;
	
	@Column(name = "CEP_ENDERECO")
	private String cep;
	
	@Column(name = "CIDADE_ENDERECO")
	private String cidade;
	
	@Column(name = "ESTADO_ENDERECO")
	private String uf;
	
	public Endereco() {	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tRua: ");
		builder.append(rua);
		builder.append("\n\tNumero: ");
		builder.append(numero);
		builder.append("\n\tBairro: ");
		builder.append(bairro);
		builder.append("\n\tCep: ");
		builder.append(cep);
		builder.append("\n\tCidade: ");
		builder.append(cidade);
		builder.append("\n\tUF: ");
		builder.append(uf);
		return builder.toString();
	}

}
