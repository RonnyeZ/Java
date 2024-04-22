package bancoClasseObjeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Account conta;
		
		System.out.println("Informe o numero da conta: ");
		int numConta = entrada.nextInt();
		
		System.out.println("Informe o seu nome: ");
		entrada.nextLine();
		String nomeTitular = entrada.nextLine();
		
		System.out.println("Você deseja efetuar um deposito inicial? (y/n)");
		char respostaDeposito = entrada.next().toLowerCase().charAt(0); 
		// "toLowerCase()" serve para deminuir a letra para minuscola 
		//"charAt()" serve para pegar a letra da posição definida
		
		if (respostaDeposito == 'y') {
			
			System.out.println("Informe o valor de deposito:");
			double valorDeposito = entrada.nextDouble();
			conta = new Account(numConta, nomeTitular, valorDeposito);
			
		} else {
			
			conta = new Account(numConta, nomeTitular);
			
		}
		
		
		entrada.close();
	}

}
