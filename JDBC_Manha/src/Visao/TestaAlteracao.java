package Visao;

import javax.swing.JOptionPane;
import Dao.EditoraAlterar;
import Model.Editora;

public class TestaAlteracao {

	public static void main(String[] args) {
		Editora editora = new Editora();
		
		EditoraAlterar edAlterar = new EditoraAlterar();
		
		editora.setIdEditora(Long.parseLong(
				(JOptionPane.showInputDialog("Informe o Id da Editora"))));
		
		editora.setNome(
				(JOptionPane.showInputDialog("Informe o Nome da Editora")));
		
		editora.setEmail(
				(JOptionPane.showInputDialog("Informe o Nome da Editora")));
		
		edAlterar.alterar(editora);
	}

}
