package br.com.ifpb.modelo.entidades.joined;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "JOINED_TECNICOS_ADM")
@PrimaryKeyJoinColumn(name = "ID_PESSOA")
public class TecnicoAdm_Joined extends Pessoa_Joined {

    @Column(name = "DATA_TECNICO_ADM")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAdmissao;
    
    @Column(name = "CARGO_TECNICO_ADM")
    private String cargo;

    public TecnicoAdm_Joined() {
    }

    public Date getDataAdmissao() {
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
		builder.append("TecnicoAdm_Joined \nData Admissao: ");
		builder.append(dataAdmissao);
		builder.append("\nCargo: ");
		builder.append(cargo);
		return builder.toString();
	}

}
