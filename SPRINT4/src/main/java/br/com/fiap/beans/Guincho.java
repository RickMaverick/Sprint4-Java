package br.com.fiap.beans;

public class Guincho {

	private String placaGuincho;
	private String modeloGuincho;
	private String tipoGuincho;
	private double capacidade;
	
	public Guincho(String placaGuincho, String modeloGuincho, String tipoGuincho, double capacidade) {
		super();
		this.placaGuincho = placaGuincho;
		this.modeloGuincho = modeloGuincho;
		this.tipoGuincho = tipoGuincho;
		this.capacidade = capacidade;
	}
	
	public Guincho() {
		super();
	}
	
	public String getPlacaGuincho() {
		return placaGuincho;
	}
	public void setPlacaGuincho(String placaGuincho) {
		this.placaGuincho = placaGuincho;
	}
	public String getModeloGuincho() {
		return modeloGuincho;
	}
	public void setModeloGuincho(String modeloGuincho) {
		this.modeloGuincho = modeloGuincho;
	}
	public String getTipoGuincho() {
		return tipoGuincho;
	}
	public void setTipoGuincho(String tipoGuincho) {
		this.tipoGuincho = tipoGuincho;
	}
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
}
