import java.util.Scanner;

public class TrianguloSemPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os 3 lados do 1° triângulo:");
		double x1 = entrada.nextDouble();
		double x2 = entrada.nextDouble();
		double x3 = entrada.nextDouble();
		
		System.out.println("Informe os 3 lados do 2° triângulo:");
		double y1 = entrada.nextDouble();
		double y2 = entrada.nextDouble();
		double y3 = entrada.nextDouble();
		
		//Perímetro = (a + b + c) / 2
		
		double p1 = (x1 + x2 + x3)/2;
		double p2 = (y1 + y2 + y3)/2;
		
		//Área = Raiz Quadrada(p * (p-a) * (p-b) * (p-c))

		double a1 = Math.sqrt(p1*(p1-x1)*(p1-x2)*(p1-x3));
		double a2 = Math.sqrt(p2*(p2-y1)*(p2-y2)*(p2-y3));
		
		System.out.println("O perimetro do 1° triângulo é: " + p1);
		System.out.println("e sua área é: " + a1);
		System.out.println("");

		System.out.println("O perimetro do 2° triângulo é: " + p2);
		System.out.println("e sua área é: " + a2);
		System.out.println("");

		if (a1 > a2) {
			System.out.println("Ao final é conclusivel que o 1° triangulo é maior que o 2°.");
			
		} else if (a1 < a2) {
			System.out.println("Ao final é conclusivel que o 2° triangulo é maior que o 1°.");
			
		} else if(a1 == a2) {
			System.out.println("Ao final é conclusivel que os dois triangulos possuem suas áreas iguais.");
			
		}
		
		
		entrada.close();
	}

}
