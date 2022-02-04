package classe.modelo;

public class Pessoa {

	private String nome;
	private long celular;
	private String email;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, long celular, String email) {
		this.nome = nome;
		this.celular = celular;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
