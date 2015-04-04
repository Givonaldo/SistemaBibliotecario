package br.com.ifpb.modelo;

@Entity
@Table(name = "EDITORAS")
public class Editora {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_EDITORA")
	private long id;
	
	@Column(name = "NOME_EDITORA")
	private String nome;

	public Editora(){}

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
