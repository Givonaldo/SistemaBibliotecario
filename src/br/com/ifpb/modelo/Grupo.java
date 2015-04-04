package br.com.ifpb.modelo;

import java.util.Set;

@Entity
@Table(name = "GRUPOS")
public class Grupo {

	@Id
	@GeneratedValue
	@Column(name = "ID_GRUPO")
	private long id;
	
	@Column(name = "NOME_GRUPO")
	private String nome;
	
	@Column(name = "PRIVACIDADE_GRUPO")
	private String privacidade;	
	
	@Column(name = "ADM_GRUPO")
	@CollectionOfElements
	private Set<Cliente> administradores;
	
	
	public Grupo() {}


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


	public void setAdministradores(Set<Cliente> administradores) {
		this.administradores = administradores;
	}
	
	
	
	
}
