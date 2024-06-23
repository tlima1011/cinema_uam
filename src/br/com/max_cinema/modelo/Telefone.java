package br.com.max_cinema.modelo;

import br.com.max_cinema.enums.Tipo;

public class Telefone {
	
	private int id_telefone; 
	private String ddd; 
	private String numero; 
	private Tipo tipo;
	private Cinema cinema; 
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	} 
	
}
