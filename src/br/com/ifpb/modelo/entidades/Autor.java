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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUTORES")
public class Autor implements Serializable {	

	@Id
	@Column(name = "ID_AUTOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOME_AUTOR")
	private String nome;
	
	@ManyToMany(mappedBy = "autores")
	private Set<Livro> livros;

	public Autor(){
		this.livros = new HashSet<>();
	}

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

	public Set<Livro> getLivros() {
		return livros;
	}

	public void setLivros(Set<Livro> livros) {
		this.livros = livros;
	}
	
	public void setLivros(Livro livro) {
		this.livros.add(livro);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor\nId: ");
		builder.append(id);
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nLivros");
		builder.append(livros);
		return builder.toString();
	}		
}
