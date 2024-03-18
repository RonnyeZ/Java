import java.util.Scanner;

public class TrianguloPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		
		Triangulo t2 = new Triangulo();
		
		System.out.println("----------");
		t1.a1 = entrada.nextDouble();
		
		System.out.println("----------");
		t1.a2 = entrada.nextDouble();
		
		System.out.println("----------");
		t1.a3 = entrada.nextDouble();
		
		
		System.out.println("----------");
		t2.a1 = entrada.nextDouble();
		
		System.out.println("----------");
		t2.a2 = entrada.nextDouble();
		
		System.out.println("----------");
		t2.a3 = entrada.nextDouble();
		
		
		entrada.close();
	}

}
