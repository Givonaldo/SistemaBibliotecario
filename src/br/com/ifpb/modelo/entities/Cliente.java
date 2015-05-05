package br.com.ifpb.modelo.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CLIENTES")
public class Cliente implements Serializable {

	@Id
	@Column(name = "ID_CLIENTE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "NOME_CLIENTE", nullable = false)
	private String nome;
	
	@Column(name = "CPF_CLIENTE")
	private String cpf;
	
	@Column(name = "DATA_NASC_CLIENTE")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Column(name = "EMAIL_CLIENTE")
	private String eMail;
		
	@OneToMany(fetch = FetchType.EAGER, mappedBy="cliente", targetEntity=Telefone.class)
	private Set<Telefone> telefones;
	
	public Cliente(){
		telefones = new HashSet<>();
	}

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

	public Set<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
	
}
