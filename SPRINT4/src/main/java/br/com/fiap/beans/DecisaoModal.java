package br.com.fiap.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DecisaoModal {
	
	private int id_veiculo;
	private int modificacao;
	private int modifComprimento;
	private double comprimentoVeiculo;
	private int carga;
	private double pesoBruto;
	private double pesoTara;
	private String inclinacao;
	private int tombado;
	private String tipoCarga;
	
	public DecisaoModal(int id_veiculo, int modificacao, int modifComprimento, double comprimentoVeiculo, int carga,
			double pesoBruto, double pesoTara, String inclinacao, int tombado, String tipoCarga) {
		super();
		this.id_veiculo = id_veiculo;
		this.modificacao = modificacao;
		this.modifComprimento = modifComprimento;
		this.comprimentoVeiculo = comprimentoVeiculo;
		this.carga = carga;
		this.pesoBruto = pesoBruto;
		this.pesoTara = pesoTara;
		this.inclinacao = inclinacao;
		this.tombado = tombado;
		this.tipoCarga = tipoCarga;
	}
	
	public DecisaoModal() {
		super();
	}
	
	public int getId_veiculo() {
		return id_veiculo;
	}
	public void setId_veiculo(int id_veiculo) {
		this.id_veiculo = id_veiculo;
	}
	public int getModificacao() {
		return modificacao;
	}
	public void setModificacao(int modificacao) {
		this.modificacao = modificacao;
	}
	public int getModifComprimento() {
		return modifComprimento;
	}
	public void setModifComprimento(int modifComprimento) {
		this.modifComprimento = modifComprimento;
	}
	public double getComprimentoVeiculo() {
		return comprimentoVeiculo;
	}
	public void setComprimentoVeiculo(double comprimentoVeiculo) {
		this.comprimentoVeiculo = comprimentoVeiculo;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public double getPesoBruto() {
		return pesoBruto;
	}
	public void setPesoBruto(double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	public double getPesoTara() {
		return pesoTara;
	}
	public void setPesoTara(double pesoTara) {
		this.pesoTara = pesoTara;
	}
	public String getInclinacao() {
		return inclinacao;
	}
	public void setInclinacao(String inclinacao) {
		this.inclinacao = inclinacao;
	}
	public String getTipoCarga() {
		return tipoCarga;
	}
	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	public int getTombado() {
		return tombado;
	}
	public void setTombado(int tombado) {
		this.tombado = tombado;
	}
	
	
}
