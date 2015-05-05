package br.com.ifpb.modelo.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name = "GRUPOS")
public class Grupo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRUPO")
	private long id;
	
	@Column(name = "NOME_GRUPO")
	private String nome;
	
	@Column(name = "PRIVACIDADE_GRUPO")
	private String privacidade;	
	
	@Column(name = "ADM_GRUPO")
	@CollectionOfElements(fetch = FetchType.EAGER)
	private Set<Pessoa> administradores;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "AUTORES_LIVRO",joinColumns = @JoinColumn(name = "ID_LIVRO"),
				inverseJoinColumns = @JoinColumn(name="ID_AUTOR"))
	private Set<Disciplina> disciplinas;
	
	public Grupo() {
		this.administradores = new HashSet<>();
		this.disciplinas = new HashSet<>();
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

	public Set<Pessoa> getAdministradores() {
		return administradores;
	}

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setAdministradores(Pessoa administrador) {
		this.administradores.add(administrador); 
	}

	public void setAdministradores(Set<Pessoa> administradores) {
		this.administradores = administradores;
	}

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void setDisciplinas(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Grupo\nId: ");
		builder.append(id);
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append("\nPrivacidade: ");
		builder.append(privacidade);
		builder.append("\nAdministradores: ");
		builder.append(administradores);
		builder.append("\nDisciplinas: ");
		builder.append(disciplinas);
		return builder.toString();
	}	
}
