package heranca;

public class Secretarias extends Funcionario {
	
	private int ramalNumber;
	
	
	public Secretarias() {
		
	}
	
	public Secretarias(int ramalNumber) {
		super();
		this.ramalNumber = ramalNumber;
		
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Número do Ramal: " + this.ramalNumber);
	}

	public int getRamalNumber() {
		return ramalNumber;
	}

	public void setRamalNumber(int ramalNumber) {
		this.ramalNumber = ramalNumber;
	}

}
