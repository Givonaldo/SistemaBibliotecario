package br.com.ifpb.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Curso implements Serializable {

	@Column(name = "NOME_CURSO")
	private String nome;

	public Curso() {
	}

	public String getDescricao() {
		return nome;
	}

	public void setDescricao(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tNome Curso: ");
		builder.append(nome);
		return builder.toString();
	}
}
