package br.com.ifpb.modelo.entidades.per_class;

import br.com.ifpb.modelo.entidades.Curso;
import br.com.ifpb.modelo.entidades.SituacaoAluno;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "PER_CLASS_ALUNO")
public class Aluno_Per_Class extends Pessoa_Per_Class implements Serializable {

    @Column(name = "CURSO_ALUNO")
    private Curso curso;
    
    @Column(name="SITUACAO_ALUNO")
    @Enumerated(EnumType.STRING)
    private SituacaoAluno situacao;

    public Aluno_Per_Class() {
    }

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
