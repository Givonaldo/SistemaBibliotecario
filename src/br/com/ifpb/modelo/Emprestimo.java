package br.com.ifpb.modelo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRESTIMOS")
public class Emprestimo implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "ID_EMPRESTIMO")
	private long id;
	
	@Column(name = "DATA_EMP_EMPRESTIMO")
	private Calendar dataEmprestimo;
	
	public Emprestimo() {}

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
	
	
}
