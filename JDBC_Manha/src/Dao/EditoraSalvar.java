package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Editora;
import util.ConnectionFactory;

public class EditoraSalvar {
	
	private Connection conexao;
	PreparedStatement stmt; //Usa-se preparedStatement quando 
	
	public EditoraSalvar() {
		this.conexao = ConnectionFactory.createConnection();
	}
	
	public void salvar(Editora editora) {
		
		try {
			String sql = "Insert into editora(nome, email) values(?, ?)";
			
			stmt = conexao.prepareStatement(sql); //stmt se torna o codigo que vai ser enviado para o banco de dados
			stmt.setString(1,editora.getNome()); // Vai adiciona o GetNome no 1° espaço em branco
			stmt.setString(2,editora.getEmail()); // Vai adiciona o GetEmail no 2° espaço em branco
			stmt.execute(); //Manda o banco de dados executar o comando
			
			stmt.close(); //esse método retorna um
			
			conexao.close(); //Fecha a conexão para evitar sobrecargas
			
		} catch(SQLException e) {
			e.printStackTrace();
			
		}
		
	}
}
