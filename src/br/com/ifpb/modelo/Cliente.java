package br.com.ifpb.modelo;

import java.util.Calendar;
import java.util.Set;

@Entity
@Table(name = "CLIENTES")
public class Cliente {

	@Id
	@GeneratedValue
	@Column(name = "ID_CLIENTE")
	private long id;
	
	@Column(name = "NOME_CLIENTE")
	private String nome;
	
	@Column(name = "CPF_CLIENTE")
	private String cpf;
	
	@Column(name = "DATA_NASC_CLIENTE")
	private Calendar dataNascimento;
	
	@Column(name = "EMAIL_CLIENTE")
	private String eMail;
	
	@Column(name = "TELEFONES_CLIENTE")
	@CollectionOfElements
	private Set<String> telefones;
	
	public Cliente(){}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
	
	
	
}