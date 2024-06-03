package util;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		ConnectionFactory.createConnection();
		JOptionPane.showMessageDialog(null, "Conexão Realizada!!");

	}

}