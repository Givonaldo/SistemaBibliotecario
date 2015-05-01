package br.com.ifpb.modelo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIVROS")
public class Livro implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LIVRO")
	private long id;
	
	@Column(name = "TITULO_LIVRO")
	private String titulo;
	
	@Column(name = "ISBN_LIVRO")
	private String isbn;
	
	@Column(name = "ANO_LIVRO")
	private String ano;	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EDITORA_LIVRO", nullable = false)
	private Editora editora;

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

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro\nId: ");
		builder.append(id);
		builder.append("\nTitulo: ");
		builder.append(titulo);
		builder.append("\nIsbn: ");
		builder.append(isbn);
		builder.append("\nAno: ");
		builder.append(ano);
		builder.append("\n\n");
		return builder.toString();
	}
	
}
