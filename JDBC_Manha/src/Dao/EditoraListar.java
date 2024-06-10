package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Editora;
import util.ConnectionFactory;

public class EditoraListar {
	private Connection conexao; //Cria a conexao com o banco de dados
	PreparedStatement stmt; //Prepara/executar comando no banco de dados
	ResultSet resultado; // Traz resultado do banco de dados
	
	
	public EditoraListar() {
		
		this.conexao = ConnectionFactory.createConnection();
	}
	
	public List<Editora> listar(){
		
		List<Editora> lista = new ArrayList<Editora>(); //ArrayList vai aumentar a lista conforme recebe dados
		
		try {
			stmt = conexao.prepareStatement("Select * from Editora");
			
			resultado = stmt.executeQuery(); //Executa dois comandos, "executeQuery" executa o comando e em seguida retorna no "resultado" a tabela do banco
			
			while (resultado.next()) {
				Editora editora = new Editora();
				
				editora.setIdEditora(resultado.getLong(1));
				editora.setNome(resultado.getString(2));
				editora.setEmail(resultado.getString(3));
				
				lista.add(editora);
			}
			
			stmt.close();
			resultado.close();
			conexao.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
			
			}
		return lista;
		
		}

}
