import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static void main(String[] args) {
		
		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/livraria", "root", "");
			System.out.println("Conexão OK");
			
		} catch (SQLException e) {
			System.out.println("Falha na Conexão!!");
			
		}

	}

}
