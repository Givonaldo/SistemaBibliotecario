package br.com.ifpb.modelo.entidades.single_table;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.ifpb.modelo.entidades.Curso;
import br.com.ifpb.modelo.entidades.SituacaoAluno;

import javax.persistence.Column;

@Entity
@DiscriminatorValue ("A")
public class Aluno_SingleTable extends Pessoa_SingleTable implements Serializable {
	
    @Column(name="CURSO_ALUNO")
	private Curso curso;	
	
    @Column(name="SITUACAO_ALUNO")
    @Enumerated(EnumType.STRING)
	private SituacaoAluno situacao;

	public Aluno_SingleTable() { }
        
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public SituacaoAluno getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoAluno situacao) {
		this.situacao = situacao;
	}
}
