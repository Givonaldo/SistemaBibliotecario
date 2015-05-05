package br.com.ifpb.modelo.entidades.single_table;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name="SINGLE_PESSOAS")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn ( name="DISCRIMINADOR", discriminatorType= DiscriminatorType.STRING)
public abstract class Pessoa_SingleTable implements Serializable {
	
	@Id
	@Column(name= "ID_PESSOA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    @Column(name= "NOME_PESSOA")
	private String nome;
    @Column(name= "MATRICULA_PESSOA")
	private long matricula;
	
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
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
}
