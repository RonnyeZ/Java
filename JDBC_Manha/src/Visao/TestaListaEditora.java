package Visao;

import java.util.List;
import Dao.EditoraListar;
import Model.Editora;

public class TestaListaEditora {

	public static void main(String[] args) {
		EditoraListar editoralistar = new EditoraListar();
		
		List<Editora> lista = editoralistar.listar();
		
		for(Editora e: lista) {
			System.out.println("Editora: " + 
				e.getIdEditora() + " - " + 
				e.getNome() + " - "  + 
				e.getEmail());
			System.out.println("-----------------------------------");
		}

	}

}
