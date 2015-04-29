package br.com.ifpb.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GRUPOS")
public class Grupo implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "ID_GRUPO")
	private long id;
	
	@Column(name = "NOME_GRUPO")
	private String nome;
	
	@Column(name = "PRIVACIDADE_GRUPO")
	private String privacidade;	
	
	@Column(name = "ADM_GRUPO")
	@CollectionTable
	private Set<Cliente> administradores;
	
	
	public Grupo() {
		administradores = new HashSet<>();		
	}
	

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


	public String getPrivacidade() {
		return privacidade;
	}


	public void setPrivacidade(String privacidade) {
		this.privacidade = privacidade;
	}


	public Set<Cliente> getAdministradores() {
		return administradores;
	}


	public void setAdministradores(Cliente administrador) {
		this.administradores.add(administrador); 
	}
	
	
	
	
}
