package heranca;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Gerente g = new Gerente();
		
		Secretarias s = new Secretarias();
		
		Telefonistas t = new Telefonistas();
		
		//Definir dados da classe Gerente
		g.setNome("Ronyéllison");
		g.setSalario(1000);
		g.setUsername("Rony");
		g.setPassword("12345");
		
		//Definir dados da classe Telefonistas
		t.setNome("Danielle");
		t.setSalario(1000);
		t.setCode(73);
		
		//Definir dados da classe Secretarias
		s.setNome("Matheus");
		s.setSalario(1000);
		s.setRamalNumber(37);
		
		
		System.out.println("GERENTE");
		g.mostrarDados();
		
			System.out.println(""); //Espaçamento
		
		System.out.println("TELEFONISTA");
		t.mostrarDados();
		
			System.out.println(""); //Espaçamento
		
		System.out.println("SECRETARIO");
		s.mostrarDados();
		
		
		
		/* ------OBSOLETO-------
		System.out.println("GERENTE");
		System.out.println("Nome: " + g.getNome());
		System.out.println("Salario: R$" + g.getSalario());
		System.out.println("Bonificação: R$" + g.calculoBonificacao());
		System.out.println("Usuário: " + g.getUsername());
		System.out.println("Senha: " + g.getPassword());
		
		System.out.println("");
		
		System.out.println("TELEFONISTA");
		System.out.println("Nome: " + t.getNome());
		System.out.println("Salario: R$" + t.getSalario());
		System.out.println("Bonificação: R$" + t.calculoBonificacao());
		System.out.println("Estação de Trabalho: " + t.getCode());
		
		System.out.println("");
		
		System.out.println("SECRETARIA");
		System.out.println("Nome: " + s.getNome());
		System.out.println("Salario: R$" + s.getSalario());
		System.out.println("Bonificação: R$" + s.calculoBonificacao());
		System.out.println("Numero do Ramal: " + s.getRamalNumber());	
		*/
		
		entrada.close();
	}

}
