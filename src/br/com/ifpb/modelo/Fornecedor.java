package br.com.ifpb.modelo;

@Entity
@Table(name = "FORNECEDORAS")
public class Fornecedor {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_FORNECEDORA")
	private long id;	

	@Column(name = "NOME_FORNECEDORA")
	private String nome;
	
	public Fornecedor() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
