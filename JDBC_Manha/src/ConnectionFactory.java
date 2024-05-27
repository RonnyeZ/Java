import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection conexao() {
		
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/livraria", "root", "");
			
			//System.out.println("Conexão OK");
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
			
			//System.out.println("Falha na Conexão!!");
		}
		
	}
		
}
