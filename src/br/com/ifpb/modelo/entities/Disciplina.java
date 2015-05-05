package br.com.ifpb.modelo.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DISCIPLINAS")
public class Disciplina implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DISCIPLINA")
	private long id;
	
	@Column(name = "NOME_DISCIPLINA")
	private String nome;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="disciplina", targetEntity=Livro.class)
	private Set<Livro> livros;
	
	public Disciplina(){
		this.livros = new HashSet<>();
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina\nId: ");
		builder.append(id);
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nLivros: ");
		builder.append(livros);
		return builder.toString();
	}
	
	
	
}
