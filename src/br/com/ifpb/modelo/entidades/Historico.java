package br.com.ifpb.modelo.entidades;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "HISTORICOS")
public class Historico implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HISTORICO")
	private long id;
	
	@Column(name = "DATA_EMP_HISTORICO")
	private Calendar dataEmprestimo;

	@Column(name = "DATA_DEV_HISTORICO")
	private Calendar dataDevolucao;
	
	@Column(name = "MULTA_HISTORICO")
	private double multa;

	public Historico() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	
}
