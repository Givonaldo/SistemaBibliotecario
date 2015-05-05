package br.com.ifpb.modelo.entidades.joined;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "JOINED_PROFESSORES")
@PrimaryKeyJoinColumn(name = "ID_PESSOA")
public class Professor_Joined extends Pessoa_Joined {

    @Column(name = "DATA_PROFESSOR")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAdmissao;
    
    @Column(name = "AREA_ATUACAO_PROFESSOR")
    private String areaDeAtuacao;

    public Professor_Joined() {
    }

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
		builder.append("Professor_Joined \nData Admissao: ");
		builder.append(dataAdmissao);
		builder.append("\nArea de Atuacao: ");
		builder.append(areaDeAtuacao);
		return builder.toString();
	}

}
