package retanguloClasseObjeto;

public class Retangulo {
	double a;
	double b;
	
	public double retanguloArea() {
		double area = (this.a * this.b);
		return area;
		
	}
	
	public double retanguloP() {
		double perimetro = ((this.a * 2) + (this.b * 2));
		return perimetro;
	}
	
	public double retanguloDiagonal() {
		double diagonal = Math.sqrt((this.a * this.a) + (this.b * this.b));
		return diagonal;
	}
	
	// Area do Retangulo = Altura * Comprimento
	
	// Perímetro do Retângulo = (Altura*2) + (Comprimento*2)
	
	// Diagonal do Retângulo = Raiz quadrada de ((A*A) + (B*B))

}
