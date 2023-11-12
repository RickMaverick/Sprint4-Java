package br.com.fiap.beans;

public class Segurado {

	private String documentoSegurado;
	private String nomeSegurado;
	private String tipoSegurado;
	private Veiculo veiculo;
	
	public Segurado() {
		super();
	}
	
	public Segurado(String documentoSegurado, String nomeSegurado, String tipoSegurado) {
		super();
		this.documentoSegurado = documentoSegurado;
		this.nomeSegurado = nomeSegurado;
		this.tipoSegurado = tipoSegurado;
	}
	
	public Segurado(String documentoSegurado, String nomeSegurado, String tipoSegurado, Veiculo veiculo) {
		super();
		this.documentoSegurado = documentoSegurado;
		this.nomeSegurado = nomeSegurado;
		this.tipoSegurado = tipoSegurado;
		this.veiculo = veiculo;
	}
	
	
	public String getDocumentoSegurado() {
		return documentoSegurado;
	}
	public void setDocumentoSegurado(String documentoSegurado) {
		this.documentoSegurado = documentoSegurado;
	}
	public String getNomeSegurado() {
		return nomeSegurado;
	}
	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}
	public String getTipoSegurado() {
		return tipoSegurado;
	}
	public void setTipoSegurado(String tipoSegurado) {
		this.tipoSegurado = tipoSegurado;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
}
