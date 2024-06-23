package br.com.max_cinema.modelo;

import java.util.ArrayList;

public class Funcionario {
	
	private static int ultimoCodigo = 1;
	private int id_funcionario;
	private String nome;
	private String email; 
	private int cadastrado; 
	ArrayList <Filme> filme = new ArrayList<>(); 
	
	public Funcionario() { 
		id_funcionario = ultimoCodigo++; 
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

	public int getCadastrado() {
		return cadastrado;
	}

	public void setCadastrado(int cadastrado) {
		this.cadastrado = cadastrado;
	}
	
	public void addFilme(Filme f) { 
		filme.add(f); 
	}
	
	public void removeFilme(Filme f) { 
		filme.remove(f);
	}
	
	

}
