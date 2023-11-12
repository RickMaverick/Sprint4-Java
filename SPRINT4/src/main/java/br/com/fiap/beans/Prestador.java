package br.com.fiap.beans;

public class Prestador {

	private String nomePrestador;
	private String localPrestador;
	private Guincho guincho;
	
	public Prestador() {
		super();
	}
	
	public Prestador(String nomePrestador, String localPrestador, Guincho guincho) {
		super();
		this.nomePrestador = nomePrestador;
		this.localPrestador = localPrestador;
		this.guincho = guincho;
	}

	public String getNomePrestador() {
		return nomePrestador;
	}

	public void setNomePrestador(String nomePrestador) {
		this.nomePrestador = nomePrestador;
	}

	public String getLocalPrestador() {
		return localPrestador;
	}

	public void setLocalPrestador(String localPrestador) {
		this.localPrestador = localPrestador;
	}

	public Guincho getGuincho() {
		return guincho;
	}

	public void setGuincho(Guincho guincho) {
		this.guincho = guincho;
	}
	
	
}
