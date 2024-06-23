package br.com.max_cinema.modelo;

import java.util.ArrayList;

public class Departamento {
	
	private static int ultimoCodigo = 1; 
	private int id_departamento; 
	private String nome; 
	ArrayList <Funcionario> funcionario = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	public void addFuncionario(Funcionario f) { 
		funcionario.add(f); 
	}
	
	public void removeFuncionario(Funcionario f) { 
		funcionario.remove(f); 
	}
	
}
