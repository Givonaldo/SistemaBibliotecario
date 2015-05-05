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
	
	@ManyToMany(mappedBy = "disciplinas")
	private Set<Grupo> grupos;
	
	
	public Disciplina(){
		this.livros = new HashSet<>();
		this.grupos = new HashSet<>();
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

	public void setLivros(Set<Livro> livros) {
		this.livros = livros;
	}

	public void setLivros(Livro livro){
		this.livros.add(livro);		
	}
	
	public Set<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(Set<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public void SetGrupos(Grupo grupo){
		this.grupos.add(grupo);
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
		builder.append("\nGrupos: ");
		builder.append(grupos);		
		return builder.toString();
	}	
}
