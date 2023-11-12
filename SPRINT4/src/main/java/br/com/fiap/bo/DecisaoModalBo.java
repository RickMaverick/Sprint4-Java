package br.com.fiap.bo;

import java.sql.SQLException;

import br.com.fiap.beans.DecisaoModal;
import br.com.fiap.dao.DecisaoModalDAO;

public class DecisaoModalBo {

	//INSERIR DECISAOMODALBO
	public void inserirBo(DecisaoModal variaveis) throws ClassNotFoundException, SQLException {
		DecisaoModalDAO variaveisDAO = new DecisaoModalDAO();
		variaveisDAO.inserir(variaveis);
	}
	
	//DELETAR DECISAOMODALBO
	public void deletarBo(int id_veiculo) throws ClassNotFoundException, SQLException {
		DecisaoModalDAO variaveisDAO = new DecisaoModalDAO();
		variaveisDAO.deletar(id_veiculo);
	}
	
	//ATUALIZAR DECISAOMODALBO
	public void atualizarBo(DecisaoModal variaveis) throws ClassNotFoundException, SQLException {
		DecisaoModalDAO variaveisDAO = new DecisaoModalDAO();
		variaveisDAO.atualizar(variaveis);
	}
	
}
