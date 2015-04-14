package br.com.ifpb.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTORES")
public class Autor {	

	@Id
	@GeneratedValue
	@Column(name = "ID_AUTORES")
	private Long id;
	
	@Column(name = "NOME_AUTOR")
	private String nome;

	public Autor(){ }
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
