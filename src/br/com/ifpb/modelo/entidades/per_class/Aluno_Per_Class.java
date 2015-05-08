package br.com.ifpb.modelo.entidades.per_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.ifpb.modelo.entidades.Curso;
import br.com.ifpb.modelo.entidades.SituacaoAluno;

@Entity
@Table(name = "PER_CLASS_ALUNO")
public class Aluno_Per_Class extends Pessoa_Per_Class {

    @Column(name = "CURSO_ALUNO")
    private Curso curso;
          
    @Column(name="SITUACAO_ALUNO")
    @Enumerated(EnumType.STRING)
    private SituacaoAluno situacao;
        
    public Aluno_Per_Class() {  }

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nALUNO PER CLASS");
		builder.append(curso);
		builder.append("\n\tSituacao: ");
		builder.append(situacao);
		return builder.toString();
	}

}
