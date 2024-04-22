package bancoClasseObjeto;

public class Account {
	private int numero;
	
	private String nome;
	
	private double saldo;
	

	public Account(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Account(int numero, String nome, double valorDeposito) {
		this.numero = numero;
		this.nome = nome;
		deposito(valorDeposito);
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double amount) {
		this.saldo += amount;
	}
	
	public void saque(double amount) {
		this.saldo -= amount;
	}

	@Override
	public String toString() {
		return  "Conta: " + this.numero + 
				" - Titular: " + this.nome + 
				" - Saldo Atual: R$ " + this.saldo;
	}
	
	
}
