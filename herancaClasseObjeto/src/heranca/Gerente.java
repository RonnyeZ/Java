package heranca;

public class Gerente extends Funcionario {
	
	private String username;
	private String password;
	
	
	public Gerente() {
		
	}
	
	public Gerente(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
	}
	
	public double calculoBonificacao() {
		return this.getSalario() * 0.20 + 100;
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Usuario: " + this.username);
		System.out.println("Senha: " + this.password);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
