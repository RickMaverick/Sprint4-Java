package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.DecisaoModal;
import br.com.fiap.dao.DecisaoModalDAO;

public class InsertVariaveisDecisaoModal {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DecisaoModal variaveis = new DecisaoModal();
		
		DecisaoModalDAO dao = new DecisaoModalDAO();
		
		variaveis.setModificacao(inteiro("MODIFICACAO: "));
		variaveis.setModifComprimento(inteiro("MODIF COMPRIMENTO: "));
		variaveis.setComprimentoVeiculo(real("NOVO COMPRIMENTO: "));
		variaveis.setCarga(inteiro("CARGA: "));
		variaveis.setPesoBruto(real("PESO BRUTO: "));
		variaveis.setPesoTara(real("PESO TARA: "));
		variaveis.setInclinacao(texto("INCLINACAO: "));
		variaveis.setTombado(inteiro("TOMABADO: "));
		variaveis.setTipoCarga(texto("TIPO CARGA: "));
		
		System.out.println(dao.inserir(variaveis));
		
	}

}
