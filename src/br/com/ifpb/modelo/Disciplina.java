package br.com.ifpb.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISCIPLINAS")
public class Disciplina {

	@Id
	@GeneratedValue
	@Column(name = "ID_DISCIPLINA")
	private long id;
	
	@Column(name = "NOME_DISCIPLINA")
	private String nome;
	
	public Disciplina(){}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
