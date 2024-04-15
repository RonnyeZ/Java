package bancoClasseObjeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Account conta = new Account();
		
		System.out.println("Informe o numero da conta: ");
		conta.setNumero(entrada.nextInt());
		
		System.out.println("Informe o seu nome: ");
		conta.setNome(entrada.next());
		
		System.out.println("Informe um valor de deposito: ");
		conta.setSaldo(entrada.nextDouble());
		
		System.out.println("Seu Numero é: " + conta.getNumero());
		System.out.println("Seu Nome é: " + conta.getNome());
		System.out.println("Seu Saldo é: " + conta.getSaldo());
		
		entrada.close();
	}

}
