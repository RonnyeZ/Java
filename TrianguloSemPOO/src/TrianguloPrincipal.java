import java.util.Scanner;

public class TrianguloPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		
		Triangulo t2 = new Triangulo();
		
		// Lados do 1° Triangulo
		System.out.println("Defina o primerio lado do Triangulo 1");
		t1.a1 = entrada.nextDouble();
		
		System.out.println("Defina o segundo lado do Triangulo 1");
		t1.a2 = entrada.nextDouble();
		
		System.out.println("Defina o terceiro lado do Triangulo 1");
		t1.a3 = entrada.nextDouble();
		
		//Lados do 2° Triangulo
		System.out.println("Defina o primerio lado do Triangulo 2");
		t2.a1 = entrada.nextDouble();
		
		System.out.println("Defina o segundo lado do Triangulo 2");
		t2.a2 = entrada.nextDouble();
		
		System.out.println("Defina o terceiro lado do Triangulo 2");
		t2.a3 = entrada.nextDouble();
		
		
		double p1 = (t1.a1 + t1.a2 + t1.a3) / 2; 
		double p2 = (t2.a1 + t2.a2 + t2.a3) / 2;
		
		double a1 = Math.sqrt(p1 * (p1 - t1.a1) * (p1 - t1.a2) * (p1 - t1.a3));
		double a2 = Math.sqrt(p2 * (p2 - t2.a1) * (p2 - t2.a2) * (p2 - t2.a3));
		
		System.out.println("A area do triangulo 1 é:" + a1);
		System.out.println("");
		System.out.println("A area do triangulo 2 é:" + a2);
		
		entrada.close();
	}

}
