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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EDITORAS")
public class Editora implements Serializable {
	
	@Id
	@Column(name = "ID_EDITORA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "NOME_EDITORA")
	private String nome;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="editora", targetEntity=Livro.class)
	private Set<Livro> livros;

	public Editora(){
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

	public Set<Livro> getLivros() {
		return livros;
	}

	public void setLivros(Livro livro) {
		this.livros.add(livro);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Editora\nId: ");
		builder.append(id);
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nLivros: ");
		builder.append(livros);
		return builder.toString();
	}
	
	
	
}
