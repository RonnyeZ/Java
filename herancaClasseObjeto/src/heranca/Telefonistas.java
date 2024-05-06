package heranca;

public class Telefonistas extends Funcionario {
	
	private int code;
	
	public Telefonistas() {
		
	}
	
	public Telefonistas(int code) {
		super();
		this.code = code;
		
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Estação de Trabalho: " + this.code);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	

}
