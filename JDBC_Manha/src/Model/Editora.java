package Model;

public class Editora {
	
	public Long idEditora;
	public String nome;
	public String email;
	
	
	public Editora() {
		
	}
	
	
	public Editora(Long idEditora, String nome, String email) {
		this.idEditora = idEditora;
		this.nome = nome;
		this.email = email;
	}
	
	public Long getIdEditora() {
		return idEditora;
	}
	public void setIdEditora(Long idEditora) {
		this.idEditora = idEditora;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
