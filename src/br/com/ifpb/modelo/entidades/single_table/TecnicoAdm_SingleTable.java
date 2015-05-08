package br.com.ifpb.modelo.entidades.single_table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("T")
public class TecnicoAdm_SingleTable extends Pessoa_SingleTable {

	@Column(name = "DATA_ADMISSAO_TECNICO_ADM")
	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;

	@Column(name = "CARGO")
	private String cargo;

	public TecnicoAdm_SingleTable() {
	}

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nTECNICO_ADM SIGLE TABLE\n\tDataAdmissao: ");
		builder.append(dataAdmissao);
		builder.append("\n\tCargo: ");
		builder.append(cargo);
		return builder.toString();
	}

}
