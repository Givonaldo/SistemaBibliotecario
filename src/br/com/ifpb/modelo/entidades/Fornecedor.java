package br.com.ifpb.modelo.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FORNECEDORES")
public class Fornecedor implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FORNECEDOR")
	private long id;	

	@Column(name = "NOME_FORNECEDOR")
	private String nome;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="fornecedor", targetEntity=Exemplar.class)
	private Set<Exemplar> exemplares;
	
	public Fornecedor() {
		this.exemplares = new HashSet<>();
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
	public Set<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(Set<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fornecedor\nId: ");
		builder.append(id);
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nExemplares: ");
		builder.append(exemplares);
		return builder.toString();
	}
	
}
