import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Escreva um código que mostre um menu para o usuário com a operações matemáticas básicas (soma, subtração, multiplicação e divisão). Peça para o usuári escolher uma operação e informar 2 valores. Faça a operação de acordo com a escolha do usuário e exiba o resultado.

        System.out.println("Escolha uma operação entre +, -, * /");
        String simbolo = entrada.nextLine();

        System.out.println("Escolha o 1° valor.");
        double valor1 = entrada.nextDouble();

        System.out.println("Escolha o 2° valor.");
        double valor2 = entrada.nextDouble();

        if(simbolo.equals("+")) {
            double resposta = valor1 + valor2;
            System.out.println("A resposta é: " + resposta);

        } else if(simbolo.equals("-")) {
            double resposta = valor1 - valor2;
            System.out.println("A resposta é: " + resposta);

        } else if(simbolo.equals("*")) {
            double resposta = valor1 * valor2;
            System.out.println("A resposta é: " + resposta);

        } else if(simbolo.equals("/")) {
            double resposta = valor1 / valor2;
            System.out.println("A resposta é: " + resposta);
        }

        entrada.close();
    }
}
