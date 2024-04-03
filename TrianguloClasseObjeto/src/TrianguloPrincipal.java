import java.util.Scanner;

public class TrianguloPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		
		Triangulo t2 = new Triangulo();
		
		// Lados do 1° Triangulo
		System.out.println("Defina os lados do 1° Triangulo");
		t1.a1 = entrada.nextDouble();
		t1.a2 = entrada.nextDouble();
		t1.a3 = entrada.nextDouble();
		
		//Lados do 2° Triangulo
		System.out.println("Defina os lados do 2° Triangulo");
		t2.a1 = entrada.nextDouble();
		t2.a2 = entrada.nextDouble();
		t2.a3 = entrada.nextDouble();
		
		//Valor dos Perimetros
		double p1 = t1.calculoP();
		System.out.println("Valor do Perimetro do 1° Triangulo: " + p1);
		
		double p2 = t1.calculoP();
		System.out.println("Valor do Perimetro do 2° Triangulo: " + p2);
		
		System.out.println("");
		
		// Valor das Areas
		double area1 = t1.areaDoTriangulo();
		System.out.println("Valor da Área do 1° Triangulo: " + area1);

		double area2 = t2.areaDoTriangulo();
		System.out.println("Valor da Área do 2° Triangulo: " + area2);
		
		System.out.println("");

		//Resultado Final
		t1.areaMaior(area1,area2);
		
		
		/*
		double p1 = (t1.a1 + t1.a2 + t1.a3) / 2; 
		double p2 = (t2.a1 + t2.a2 + t2.a3) / 2;
		
		double a1 = Math.sqrt(p1 * (p1 - t1.a1) * (p1 - t1.a2) * (p1 - t1.a3));
		double a2 = Math.sqrt(p2 * (p2 - t2.a1) * (p2 - t2.a2) * (p2 - t2.a3));
		ath.sq
		System.out.println("A area do triangulo 1 é:" + a1);
		System.out.println("");
		System.out.println("A area do triangulo 2 é:" + a2);
		*/
		
		entrada.close();
	}

}
