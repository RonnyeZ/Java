import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        /* 
         Escreva um código que receba um valor de login e um valor de senha. Caso os valores estejam corretos, retornar ao usuário: “Você está logado”. Caso contrário, informar: “Login ou senha incorretos”.
         Defina um valor padrão para login e senha.
        */

        int chave = 123;
        String cadastro = "rony";

        System.out.println("Escreva aqui o seu Login:");
        String login = entrada.nextLine();

        System.out.println(""); //Espaço

        System.out.println("Escreva aqui a sua senha:");
        int senha = entrada.nextInt();

        // Se Login for igual a Cadastro e Senha for igual a Chave, você loga
        if ((cadastro.equals(login)) && (chave == senha)) {

            System.out.println(""); // Espaço

            System.out.println("Parabéns! Você está Logado.");

            System.out.println(""); // Espaço  

        // Se não você não consegue logar
        } else {

            System.out.println(""); // Espaço

            System.out.println("Sinto muito, porem parece que seu Login ou Senha estão incorretos");
            System.out.println("Tente novamente mais tarde!");

            System.out.println(""); // Espaço 
            
        }

        entrada.close();
    }
}
