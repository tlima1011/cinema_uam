package br.com.max_cinema.modelo;

import java.util.Date;

import br.com.max_cinema.enums.Audio;

public class Sessao {
	
	
	private static int ultimoCodigo = 1; 
	private int codigo_sessao; 
	private String sala; 
	private Date data_hora;
	private Audio audio;
	private double valor; 
	private int quantidade;
	private Cinema cinema;
	
	public Sessao() { 
		codigo_sessao = ultimoCodigo++;
	}
	
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public Date getData_hora() {
		return data_hora;
	}
	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	public Audio getAudio() {
		return audio;
	}
	public void setAudio(Audio audio) {
		this.audio = audio;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Sessao(Cinema cinema) {
		this.cinema = cinema;
	} 
	
	
}
