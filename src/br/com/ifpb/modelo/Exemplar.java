package br.com.ifpb.modelo;

@Entity
@Table(name = "EXEMPLARES")
public class Exemplar {


	@Id
	@GeneratedValue
	@Column(name = "ID_EXEMPLAR")
	private long id;
	
	@Column(name = "QUANT_EXEMPLAR")
	private int quantidade;
	
	public Exemplar() {	}

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
	
	
}