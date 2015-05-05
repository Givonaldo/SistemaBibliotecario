package br.com.ifpb.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONES")
public class Telefone implements Serializable {

	@Id
	@Column(name = "ID_TELEFONE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "NUMERO_TELEFONE")
	private String telefone;

	@ManyToOne
	@JoinColumn(name = "PESSOA_TELEFONE", nullable = false)
	private Pessoa pessoa;

	public Telefone() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Cliente getCliente() {
		return pessoa;
	}

	public void setCliente(Cliente pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Telefone\nId: ");
		builder.append(id);
		builder.append("\nTelefone: ");
		builder.append(telefone);
		return builder.toString();
	}

}
