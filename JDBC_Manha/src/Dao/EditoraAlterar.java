package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Editora;
import util.ConnectionFactory;

public class EditoraAlterar {
	
	private Connection conexao;
	PreparedStatement stmt;
	
	
	public EditoraAlterar() {
		
		this.conexao = ConnectionFactory.createConnection();
	} 
	
	public void alterar(Editora editora) {
		
		try {
			
			String sql = "Update editora set nome = ?, email = ? where id = ?";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1,editora.getNome());
			stmt.setString(2,editora.getEmail());
			stmt.setLong(3,editora.getIdEditora());
			stmt.execute(); 
			
			stmt.close(); //Esse metodo retorna um boolean
			
			conexao.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
			
		}
		
	}

}
