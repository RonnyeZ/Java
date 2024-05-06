package heranca;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Gerente g = new Gerente();
		
		Secretarias s = new Secretarias();
		
		Telefonistas t = new Telefonistas();
		
		g.setNome("Escrever");
		g.setSalario(3000);
		g.setUsername("Escrever");
		g.setPassword("Escrever");
		
		t.setNome("Escrever");
		t.setSalario(2000);
		t.setCode(00);
		
		s.setNome("Escrever");
		s.setSalario(1000);
		s.setRamalNumber(00);
		
		System.out.println("GERENTE");
		System.out.println("Nome: " + g.getNome());
		System.out.println("Salario: " + g.getSalario());
		System.out.println("Usuário: " + g.getUsername());
		System.out.println("Senha: " + g.getPassword());
		
		System.out.println("");
		
		System.out.println("TELEFONISTA");
		System.out.println("Nome: " + t.getNome());
		System.out.println("Salario: " + t.getSalario());
		System.out.println("Estação de Trabalho: " + t.getCode());
		
		System.out.println("");
		
		System.out.println("SECRETARIA");
		System.out.println("Nome: " + s.getNome());
		System.out.println("Salario: " + s.getSalario());
		System.out.println("Numero do Ramal: " + s.getRamalNumber());	
		
		
		entrada.close();
	}

}
