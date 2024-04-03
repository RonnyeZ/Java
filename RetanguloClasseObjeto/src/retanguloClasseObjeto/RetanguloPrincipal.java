package retanguloClasseObjeto;

import java.util.Scanner;

public class RetanguloPrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Retangulo r1 = new Retangulo();
		
		System.out.println("Defina os lados do triangulo.");
		
		//Entrada da Altura
		System.out.print("Altura: ");
		r1.a = entrada.nextDouble();
		
		//Entrada do Comprimento
		System.out.print("Comprimento: ");
		r1.b = entrada.nextDouble();
		
		System.out.println(""); //Espaço
		
		//Valor da Área
		double area = r1.retanguloArea();
		System.out.println("Valor da Área: " + area);
		
		//Valor do Perímetro
		double p = r1.retanguloP();
		System.out.println("Valor do Perímetro: " + p);
		
		//Valor da Diagonal
		double diagonal = r1.retanguloDiagonal();
		System.out.println("Valor da Diagonal: " + diagonal);
		
		
		entrada.close();
	}

}
