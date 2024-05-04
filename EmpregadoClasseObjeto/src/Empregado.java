
public class Empregado {
	
	String nome;
	
	double salario;
	
	double taxa;
	
	public double salLiquido() {
		return this.salario - this.taxa;
		
	}
	
	public void salAumento(double porcentagem) {
		this.salario += (this.salario * (porcentagem/100));
		
				// this.salario = salarioNovo;
		
				// (valor = valor + x;) é a mesma coisa que (valor += x;)
		
	}

	@Override
	public String toString() {
		return this.nome + ", $" + this.salLiquido();
	}
	
	
	
}
