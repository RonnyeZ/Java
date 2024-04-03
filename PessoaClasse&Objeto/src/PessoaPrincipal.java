import java.util.Scanner;

public class PessoaPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.println("informe seu nome :");
        p.nome = entrada.next();

        System.out.println("informe seu Sobrenome :");
        p.sobreNome = entrada.next();

        System.out.println("informe seu Ano de Nasc :");
        p.anoNascimento = entrada.nextInt();

        String nomeCompleto = p.juntaNome();
        System.out.println("Nome Completo : " + nomeCompleto);
        
        p.informaIdade();

        entrada.close;
        }

}
