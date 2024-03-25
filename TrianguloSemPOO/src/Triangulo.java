
public class Triangulo {
	
	double a1;
	double a2;
	double a3;
	
	//metodo para calcular P
	public double calculoP() {
		double p = (this.a1 + this.a2 + this.a3) / 2; // Sempre colocar "this." nas variaveis
		return p; //Sempre coloque o "return"
	}
	
	public double areaDoTriangulo() {
		double p = calculoP();
		double area = Math.sqrt(p * (p - this.a1) * (p - this.a2) * (p - this.a3));
		return area;
	}
	
	public void areaMaior (double x, double y) {
		if (x > y) {
			System.out.println("A área do 1° Triangulo é maior");
			
		} else {
			System.out.println("A área do 2° Triangulo é maior");
			
		}
		
	}
}
