package Visao;

import javax.swing.JOptionPane;

import Dao.EditoraSalvar;
import Model.Editora;

public class Principal {

	public static void main(String[] args) {
		
		Editora editora = new Editora();
		
		editora.setNome(
				JOptionPane.showInputDialog("Informe o Nome da Editora"));
		
		editora.setEmail(
				JOptionPane.showInputDialog("Informe o Email da Editora"));
		
		
		EditoraSalvar editorasalvar = new EditoraSalvar();
		
		editorasalvar.salvar(editora);
		
		JOptionPane.showMessageDialog(null, "Operação Realizada com Sucesso!!");		

	}

}