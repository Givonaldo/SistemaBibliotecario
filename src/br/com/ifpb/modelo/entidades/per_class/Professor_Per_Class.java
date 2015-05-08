package br.com.ifpb.modelo.entidades.per_class;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PER_CLASS_PROFESSOR")
public class Professor_Per_Class extends Pessoa_Per_Class {

	@Column(name="DATA_ADMISSAO_PROFESSOR")
    @Temporal(TemporalType.DATE)
	private Date dataAdmissao;
	
    @Column(name="AREA_ATUACAO_PROFESSOR")
	private String areaDeAtuacao;
	
	public Professor_Per_Class() { }

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nPROFESSOR PER CLASS\n\tData Admissao: ");
		builder.append(dataAdmissao);
		builder.append("\n\tArea de Atuacao: ");
		builder.append(areaDeAtuacao);
		return builder.toString();
	}
	
	
	
}
