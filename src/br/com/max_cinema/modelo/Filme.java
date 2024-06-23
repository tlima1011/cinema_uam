package br.com.max_cinema.modelo;

import java.util.ArrayList;

public class Filme {
	
	private int ultimoCodigo = 1; 
	private int id_filme; 
	private String titulo; 
	private String genero;
	private String classificacao_etaria; 
	private int duracao; 
	private String pais; 
	ArrayList <Sessao> sessao = new ArrayList<>(); 
	ArrayList <Cliente> cliente = new ArrayList<>(); 
	ArrayList <Endereco> endereco = new ArrayList<>();
	private Funcionario funcionario; 
	
	public Filme() { 
		id_filme = ultimoCodigo++;
	}

	public int getId_filme() {
		return id_filme;
	}

	public void setId_filme(int id_filme) {
		this.id_filme = id_filme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClassificacao_etaria() {
		return classificacao_etaria;
	}

	public void setClassificacao_etaria(String classificacao_etaria) {
		this.classificacao_etaria = classificacao_etaria;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void addSessao(Sessao s) { 
		addSessao(s); 
	}
	
	public void removeSessao(Sessao s) {
		removeSessao(s); 
	}
	
	public void addCliente(Cliente c) { 
		addCliente(c); 
	}
	
	public void removeCliente(Cliente c) {
		removeCliente(c); 
	}
	
	public void addEndereco(Endereco e) { 
		addEndereco(e); 
	}
	
	public void removeEndereco(Endereco e) { 
		removeEndereco(e); 
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
