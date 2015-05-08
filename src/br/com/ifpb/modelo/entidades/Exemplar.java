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
@Table(name = "EXEMPLARES")
public class Exemplar implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EXEMPLAR")
	private long id;

	@Column(name = "QUANT_EXEMPLAR")
	private int quantidade;

	@ManyToOne
	@JoinColumn(name = "ID_LIVRO_EXEMPLAR", nullable = false)
	private Livro livro;

	@ManyToOne
	@JoinColumn(name = "ID_FORNECEDOR_EXEMPLAR", nullable = false)
	private Fornecedor fornecedor;

	public Exemplar() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Exemplar\nId: ");
		builder.append(id);
		builder.append("\nQuantidade: ");
		builder.append(quantidade);
		builder.append("\nLivro: ");
		builder.append(livro);
		builder.append("\nFornecedor: ");
		builder.append(fornecedor);
		return builder.toString();
	}
}
