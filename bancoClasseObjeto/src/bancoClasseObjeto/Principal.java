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
		
		System.out.print("Você deseja efetuar um deposito inicial? (y/n): ");
		char respostaDeposito = entrada.next().toLowerCase().charAt(0); 
		//"toLowerCase()" serve para deminuir a letra para minuscula 
		//"charAt(x)" serve para pegar a letra da posição X
		
		if (respostaDeposito == 'y') {
			
			System.out.print("Informe o valor de deposito:");
			double valorDeposito = entrada.nextDouble();
			conta = new Account(numConta, nomeTitular, valorDeposito);
			
		} else {
			
			conta = new Account(numConta, nomeTitular);
		}
		
		System.out.println(""); //Espaço
		
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		
		System.out.println(""); //Espaço
		
		System.out.print("Informe o valor de deposito: ");
		double valorDoDeposito = entrada.nextDouble();
		conta.deposito(valorDoDeposito);
		
		System.out.println(""); //Espaço
		
		System.out.println("Atualização dos dados da conta: ");
		System.out.println(conta);
		
		System.out.println(""); //Espaço
		
		System.out.print("Informe o valor de saque: ");
		double valorDeSaque = entrada.nextDouble();
		conta.saque(valorDeSaque);
		
		System.out.println(""); //Espaço
		
		System.out.println("Atualização dos dados da conta: ");
		System.out.println(conta);
		
		
		/*
		System.out.println("Você deseja atualizar seu saldo? (y/n)");
		char condicao = entrada.next().toLowerCase().charAt(0);
		
		while (condicao == 'y') {
			
			System.out.println(""); //Espaço
			
			System.out.println("Escolha seu procedimento:");
			System.out.println("1 - Deposito");
			System.out.println("2 - Saque");
			
			int escolha = entrada.nextInt();
			
			if (escolha == 1) {
				
				System.out.println(""); //Espaço
				
				System.out.print("Informe o valor de deposito: ");
				double vdd = entrada.nextDouble();
				conta.deposito(vdd);
				
			} else if (escolha == 2) {
				
				System.out.println(""); //Espaço
				
				System.out.print("Informe o valor de saque: ");
				double vds = entrada.nextDouble();
				conta.saque(vds);
				
			}
			
			System.out.println(""); //Espaço
			
			System.out.println("Atualização dos dados da conta: ");
			System.out.println(conta);
			
			System.out.println(""); //Espaço
			
			System.out.println("Você deseja prosseguir?");
			escolha = condicao = entrada.next().toLowerCase().charAt(0);
			
		}*/
		
		
		entrada.close();
	}

}
