package br.com.fiap.beans;

public class Acionamento {

	private String data;
	private String horario;
	private String localizacao;
	private Segurado segurado;
	
	public Acionamento(String data, String horario, String localizacao) {
		super();
		this.data = data;
		this.horario = horario;
		this.localizacao = localizacao;
	}
	
	public Acionamento() {
		super();
	}

	public Acionamento(String data, String horario, String localizacao, Segurado segurado) {
		super();
		this.data = data;
		this.horario = horario;
		this.localizacao = localizacao;
		this.segurado = segurado;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public Segurado getSegurado() {
		return segurado;
	}
	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}
	
	
	
}
