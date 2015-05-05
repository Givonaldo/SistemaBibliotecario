package br.com.ifpb.modelo.entidades.joined;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import br.com.ifpb.modelo.entidades.comuns.Pessoa;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "JOINED_PESSOAS")
public abstract class Pessoa_Joined implements Serializable, Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PESSOA")
    private long id;
    @Column(name = "NOME_PESSOA")
    private String nome;
    @Column(name = "MATRICULA_PESSOA")
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
    
    @Override
    public String toString() {
    	StringBuilder builder = new StringBuilder();
    	builder.append("Pessoa_Joined \nId: ");
    	builder.append(id);
    	builder.append("\nNome: ");
    	builder.append(nome);
    	builder.append("\nMatricula: ");
    	builder.append(matricula);
    	return builder.toString();
    }
}
