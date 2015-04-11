package br.com.ifpb.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIVROS")
public class Livro {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_LIVRO")
	private long id;
	
	@Column(name = "TITULO_LIVRO")
	private String titulo;
	
	@Column(name = "ISBN_LIVRO")
	private String isbn;
	
	@Column(name = "ANO_LIVRO")
	private String ano;

	public Livro() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
}
