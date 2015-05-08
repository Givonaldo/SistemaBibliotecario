package br.com.ifpb.modelo.entidades.per_class;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import br.com.ifpb.modelo.entidades.Endereco;
import br.com.ifpb.modelo.entidades.Fone;

@Entity
@Table(name = "PER_CLASS_PESSOA")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa_Per_Class implements Serializable {

    @TableGenerator(name = "SEQUENCIA_PESSOA",
            table = "PER_CLASS_GERADOR_SEQUENCIAIS",
            pkColumnName = "PRIMARY_KEY",
            valueColumnName = "VALOR_SEQUENCIAL_COLUNA_PK")

    @Id
    @Column(name = "ID_PESSOA")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SEQUENCIA_PESSOA")
    private long id;
    
    @Column(name = "NOME_PESSOA")
    private String nome;
    
    @Column(name = "MATRICULA_PESSOA")
    private long matricula;
    
    @Column(name = "ENDERECO_PESSOA")
    private Endereco endereco;
    
    @Column(name = "TELEFONES_PESSOA")
    private Fone fone;

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Fone getFone() {
		return fone;
	}

	public void setFone(Fone fone) {
		this.fone = fone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PESSOA PER CLASS\n\tId: ");
		builder.append(id);
		builder.append("\n\tNome: ");
		builder.append(nome);
		builder.append("\n\tMatricula: ");
		builder.append(matricula);
		builder.append("\nEndereco: ");
		builder.append(endereco);
		builder.append("\nTelefones: ");
		builder.append(fone);
		return builder.toString();
	}

}
