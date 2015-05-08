package br.com.ifpb.modelo.entidades.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.ifpb.modelo.entidades.Curso;
import br.com.ifpb.modelo.entidades.SituacaoAluno;

@Entity
@Table(name = "JOINED_ALUNOS")
@PrimaryKeyJoinColumn(name = "ID_PESSOA")
public class Aluno_Joined extends Pessoa_Joined {
	
	@Column(name = "CURSO_ALUNO")
    private Curso curso;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "SITUACAO")
    private SituacaoAluno situacao;

    public Aluno_Joined() {
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nALUNO JOINED");
		builder.append(curso);
		builder.append("\n\tSituação: ");
		builder.append(situacao);
		return builder.toString();
	}
    
    
}

