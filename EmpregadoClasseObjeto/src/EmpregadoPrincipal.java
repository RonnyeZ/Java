import java.util.Scanner;

public class EmpregadoPrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		
		// Informa��es
		System.out.print("Informe seu Nome: " );
		emp.nome = entrada.nextLine();
		
		System.out.print("Informe seu Sal�rio: " );
		emp.salario = entrada.nextDouble();
		
		System.out.print("Informe a Taxa: " );
		emp.taxa = entrada.nextDouble();
		
		System.out.println(""); // Espa�o
		
		// Salario Liquido
		System.out.println("Funcion�rio: " + emp);
		
		System.out.println(""); // Espa�o
		
		
		// Aumento
		System.out.print("Informe o percentual de incremento: ");
		double percentual = entrada.nextDouble();
		
		emp.salAumento(percentual);
		
		
		System.out.println(""); // Espa�o
		
		
		System.out.println("Dados Atualizados" + emp);
		
		
		entrada.close();
	}

}
