package br.com.ifpb.modelo.entidades.single_table;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity
@DiscriminatorValue ("T")
public class TecnicoAdm_SingleTable extends Pessoa_SingleTable {
	
	@Column(name="DATA_ADMISSAO_TECNICO_ADM")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dataAdmissao;
        @Column(name="CARGO")
	private String cargo;
	
	public TecnicoAdm_SingleTable() { }
	
	public Date getDataAdmicao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}

