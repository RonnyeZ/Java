package projetoPessoa;

public class Pessoa {

    String nome;
    String sobreNome;
    int anoNascimento;
    
    public String juntaNome() {
        String nomeCompleto = this.nome + " " + this.sobreNome;
        return nomeCompleto;
    }

    public void informaIdade() {
        int idade = 2024 - this.anoNascimento;
        System.out.println("Sua Idade é " + idade);
    }
}