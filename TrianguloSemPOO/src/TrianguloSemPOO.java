import java.util.Scanner;

public class TrianguloSemPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os 3 lados do 1� tri�ngulo:");
		double x1 = entrada.nextDouble();
		double x2 = entrada.nextDouble();
		double x3 = entrada.nextDouble();
		
		System.out.println("Informe os 3 lados do 2� tri�ngulo:");
		double y1 = entrada.nextDouble();
		double y2 = entrada.nextDouble();
		double y3 = entrada.nextDouble();
		
		//Per�metro = (a + b + c) / 2
		
		double p1 = (x1 + x2 + x3)/2;
		double p2 = (y1 + y2 + y3)/2;
		
		//�rea = Raiz Quadrada(p * (p-a) * (p-b) * (p-c))

		double a1 = Math.sqrt(p1*(p1-x1)*(p1-x2)*(p1-x3));
		double a2 = Math.sqrt(p2*(p2-y1)*(p2-y2)*(p2-y3));
		
		System.out.println("O perimetro do 1� tri�ngulo �: " + p1);
		System.out.println("e sua �rea �: " + a1);
		System.out.println("");

		System.out.println("O perimetro do 2� tri�ngulo �: " + p2);
		System.out.println("e sua �rea �: " + a2);
		System.out.println("");

		if (a1 > a2) {
			System.out.println("Ao final � conclusivel que o 1� triangulo � maior que o 2�.");
			
		} else if (a1 < a2) {
			System.out.println("Ao final � conclusivel que o 2� triangulo � maior que o 1�.");
			
		} else if(a1 == a2) {
			System.out.println("Ao final � conclusivel que os dois triangulos possuem suas �reas iguais.");
			
		}
		
		
		entrada.close();
	}

}
