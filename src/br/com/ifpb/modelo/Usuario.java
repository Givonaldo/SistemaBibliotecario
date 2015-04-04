package br.com.ifpb.modelo;

@Entity
@Table(name = "USUARIOS")
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_USUARIO")
	private long id;
	
	@Column(name = "LOGIN_USUARIO")
	private String login;
	
	@Column(name = "SENHA_USUARIO")
	private String senha;
	
	public Usuario() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}