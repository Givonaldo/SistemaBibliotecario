package br.com.ifpb.modelo.entidades.single_table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@DiscriminatorValue ("P")
public class Professor_SingleTable extends Pessoa_SingleTable {

	@Column(name="DATA_ADMISSAO_PROFESSOR")
    @Temporal(TemporalType.DATE)	
	private Date dataAdmissao;
	
    @Column(name="AREA_ATUACAO_PROFESSOR")
	private String areaDeAtuacao;
	
	public Professor_SingleTable() { }

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
		builder.append("\tPROFESSOR SIBLE TABLE\n\tData Admissao: ");
		builder.append(dataAdmissao);
		builder.append("\n\tArea de Atuacao: ");
		builder.append(areaDeAtuacao);
		return builder.toString();
	}
	
}
