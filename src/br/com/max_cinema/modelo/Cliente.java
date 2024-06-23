package br.com.max_cinema.modelo;

public class Cliente {
	
	private static int ultimoCodigo = 1; 
	private int id_cliente; 
	private String nome; 
	private String email; 
	private Filme filme; 
	
	public Cliente() { 
		id_cliente = ultimoCodigo++; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	

}
