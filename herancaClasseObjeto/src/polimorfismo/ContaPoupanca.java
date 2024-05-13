package polimorfismo;

public class ContaPoupanca extends Conta {
	
	private double limite;

	
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

	
}
