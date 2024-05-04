import java.util.Scanner;

public class EmpregadoPrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		
		// Informações
		System.out.print("Informe seu Nome: " );
		emp.nome = entrada.nextLine();
		
		System.out.print("Informe seu Salário: " );
		emp.salario = entrada.nextDouble();
		
		System.out.print("Informe a Taxa: " );
		emp.taxa = entrada.nextDouble();
		
		System.out.println(""); // Espaço
		
		// Salario Liquido
		System.out.println("Funcionário: " + emp);
		
		System.out.println(""); // Espaço
		
		
		// Aumento
		System.out.print("Informe o percentual de incremento: ");
		double percentual = entrada.nextDouble();
		
		emp.salAumento(percentual);
		
		
		System.out.println(""); // Espaço
		
		
		System.out.println("Dados Atualizados" + emp);
		
		
		entrada.close();
	}

}
