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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIVROS")
public class Livro implements Serializable {
	
	@Id
	@Column(name = "ID_LIVRO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "TITULO_LIVRO")
	private String titulo;
	
	@Column(name = "ISBN_LIVRO")
	private String isbn;
	
	@Column(name = "ANO_LIVRO")
	private String ano;	
	
	@ManyToOne
	@JoinColumn(name = "EDITORA_LIVRO", nullable = false)
	private Editora editora;

	@ManyToOne
	@JoinColumn(name = "DISCIPLINA_LIVRO", nullable = false)
	private Disciplina disciplina;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="livro", targetEntity=Exemplar.class)
	private Set<Exemplar> exemplares;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "AUTORES_LIVRO",
				joinColumns = @JoinColumn(name = "ID_LIVRO"),
				inverseJoinColumns = @JoinColumn(name="ID_AUTOR"))
	private Set<Autor> autores;
		
	public Livro() {
		this.autores = new HashSet<>();
		this.exemplares = new HashSet<>();
	}

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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutor(Autor autor) {
		this.autores.add(autor);
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
		builder.append("Livro\nId: ");
		builder.append(id);
		builder.append("\nTitulo: ");
		builder.append(titulo);
		builder.append("\nIsbn: ");
		builder.append(isbn);
		builder.append("\nAno:");
		builder.append(ano);
		builder.append("\nEditora: ");
		builder.append(editora);
		builder.append("\nDisciplina: ");
		builder.append(disciplina);
		builder.append("\nAutores: ");
		builder.append(autores);
		builder.append("\nExemplares: ");
		builder.append(exemplares);
		return builder.toString();
	}

	
}
