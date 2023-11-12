package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.com.fiap.beans.DecisaoModal;
import br.com.fiap.conections.ConexaoFactory;

public class DecisaoModalDAO {

	public Connection minhaConexao;
	
	public DecisaoModalDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
//	int modificacao, int modifComprimento, double comprimentoVeiculo, int carga, double pesoBruto, double pesoTara, String inclinacao, int tombado, String tipoCarga
	
	//INSERT
	public String inserir(DecisaoModal decisaoModal) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO T_DECISAO_MODAL VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		stmt.setInt(1, decisaoModal.getId_veiculo());
		stmt.setInt(2, decisaoModal.getModificacao());
		stmt.setInt(3, decisaoModal.getModifComprimento());
		stmt.setDouble(4, decisaoModal.getComprimentoVeiculo());
		stmt.setInt(5, decisaoModal.getCarga());
		stmt.setDouble(6, decisaoModal.getPesoBruto());
		stmt.setDouble(7, decisaoModal.getPesoTara());
		stmt.setString(8, decisaoModal.getInclinacao());
		stmt.setInt(9, decisaoModal.getTombado());
		stmt.setString(10, decisaoModal.getTipoCarga());
		stmt.execute();
		stmt.close();
		
		return "Variaveis salvas no banco de dados";
	}
	
	public String deletar(int id_veiculo) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM T_DECISAO_MODAL WHERE id_veiculo = ?");
		stmt.setInt(1, id_veiculo);
		stmt.execute();
		stmt.close();
		return "Variaveis deletadas";
	}
	
	public String atualizar(DecisaoModal decisaoModal) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("UPDATE T_DECISAO_MODAL SET modificacao = ?, modif_comprimento = ?,"
				+ "comprimento_veiculo = ?, carga = ?, peso_bruto = ?, peso_tara = ?, inclinacao = ?, tombado = ?, tipoCarga = ? WHERE id_veiculo = ?");
		stmt.setInt(1, decisaoModal.getModificacao());
		stmt.setDouble(2, decisaoModal.getModifComprimento());
		stmt.setDouble(3, decisaoModal.getComprimentoVeiculo());
		stmt.setInt(4, decisaoModal.getCarga());
		stmt.setDouble(5, decisaoModal.getPesoBruto());
		stmt.setDouble(6, decisaoModal.getPesoTara());
		stmt.setString(7, decisaoModal.getInclinacao());
		stmt.setInt(8, decisaoModal.getTombado());
		stmt.setString(9, decisaoModal.getTipoCarga());
		stmt.setInt(10, decisaoModal.getId_veiculo());
		stmt.executeUpdate();
		stmt.close();
		return "Cadastro atualizado";
	}
	
	
}
