import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            // Escreva um código que receba a sua idade e retorne o ano do seu nascimento

            System.out.println("Digite sua idade:");
            int idade = entrada.nextInt();


            int ano = idade;

            System.out.println("Você nasceu no ano de " + ano);

        entrada.close();
    }
}
