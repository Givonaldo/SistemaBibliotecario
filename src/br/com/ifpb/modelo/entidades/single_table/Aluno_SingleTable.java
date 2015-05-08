package br.com.ifpb.modelo.entidades.single_table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.ifpb.modelo.entidades.Curso;
import br.com.ifpb.modelo.entidades.SituacaoAluno;

@Entity
@DiscriminatorValue("A")
public class Aluno_SingleTable extends Pessoa_SingleTable {

	@Column(name = "CURSO_ALUNO")
	private Curso curso;

	@Column(name = "SITUACAO_ALUNO")
	@Enumerated(EnumType.STRING)
	private SituacaoAluno situacao;

	public Aluno_SingleTable() {
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
		builder.append("\nALUNO SIGLE TABLE");
		builder.append(curso);
		builder.append("\n\tSituacao: ");
		builder.append(situacao);
		return builder.toString();
	}

}
