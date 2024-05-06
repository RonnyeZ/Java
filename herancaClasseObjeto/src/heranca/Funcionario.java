package heranca;

public class Funcionario {
	
	private int codigo;
	private String nome;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int codigo, String nome, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: R$" + this.salario);
		System.out.println("Bonificação: R$" + this.calculoBonificacao());
	}
	
	public double calculoBonificacao() {
		return this.salario * 0.10;
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
