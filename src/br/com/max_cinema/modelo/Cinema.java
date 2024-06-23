package br.com.max_cinema.modelo;

import java.util.ArrayList;

public class Cinema {
	
	private static int ultimoCodigo = 1; 
	private int id_cinema; 
	private String nome; 
	private int quantidade_salas; 
	private int capacidade;
	ArrayList <Sessao> sessao = new ArrayList<>();
	ArrayList <Endereco> endereco =  new ArrayList<>();
	ArrayList <Telefone> telefone = new ArrayList<>(); 
	//private Sessao sessao;
	
	public Cinema() {
		id_cinema = ultimoCodigo++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade_salas() {
		return quantidade_salas;
	}
	public void setQuantidade_salas(int quantidade_salas) {
		this.quantidade_salas = quantidade_salas;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	} 
	
	public void addSessao(Sessao s) { 
		sessao.add(s);
	}
	
	public void removeSessao(Sessao s) { 
		sessao.remove(s);
	}
	
	public void addEndereco(Endereco e) { 
		endereco.add(e); 
	}
	
	public void removeEndereco(Endereco e) { 
		endereco.remove(e); 
	}
	
	public void addTelefone(Telefone t) { 
		telefone.add(t); 
	}
	
	public void removeTelefone(Telefone t) { 
		telefone.remove(t);
	}

}
