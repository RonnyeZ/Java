package conversao;

import javax.swing.JOptionPane;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome:");
		
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade"));
		
		

	}

}
