package polimorfismo;

public class ContaCorrente extends Conta {
	private int diaDoAniversario;

	
	public ContaCorrente(){
		
	}
	
	public ContaCorrente(double saldo, int diaDoAniversario) {
		super(saldo);
		this.diaDoAniversario = diaDoAniversario;
	}

	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(int diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}
	
	

}
