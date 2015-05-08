package br.com.ifpb.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Fone implements Serializable {
	
	@Column(name = "TELEFONE_FIXO")
	private String telefone;
	
	@Column(name = "TELEFONE_MOVEL")
	private String celular;
		
	public Fone() {	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tTelefone fixo: ");
		builder.append(telefone);
		builder.append("\n\tTelefone móvel: ");
		builder.append(celular);
		return builder.toString();
	}	
}
