package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection createConnection() {
		
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/livraria", "root", "");
			
			//System.out.println("Conex�o OK");
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
			
			//System.out.println("Falha na Conex�o!!");
		}
		
	}
	
}