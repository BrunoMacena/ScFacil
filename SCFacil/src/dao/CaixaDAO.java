package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Factory.ConnectionFactory;
import modelo.Caixa;
import modelo.Produto;
import modelo.Venda;
import to.CaixaTO;
import to.ProdutoTO;

public class CaixaDAO {
	
	public void cadastrar(Connection con, Caixa caixa, Venda venda, ProdutoTO produto) throws SQLException {
		PreparedStatement stmt = null;
		String sql = "INSERT INTO caixa (quantidade, cod_venda, cod_produto) values (?, ?, ?)";
		
		try {
			// Salva caixa (itens venda)
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, caixa.getQuantidade());
			stmt.setInt(2, caixa.getVenda().getCodVenda());
			stmt.setInt(3, caixa.getProduto().getCod_produto());
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			con.rollback();
		}
	}

	public CaixaTO carregar(Venda venda) {
		// TODO Auto-generated method stub
		return null;
	}

	public void incluir(CaixaTO to) {
		// TODO Auto-generated method stub
		
	}

	public void atualizar(CaixaTO to) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(CaixaTO to) {
		// TODO Auto-generated method stub
		
	}

}
