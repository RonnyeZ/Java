import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        /* 
         Escreva um código que receba 6 valores do usuário, exiba a sua soma e a sua média. Fazer usando laços de repetição.
        */

        System.out.println("Informe 6 valores para recebe a soma e a media dentre eles.");

        // Declaração das variáveis
        
        double valor = 0;
        double soma = 0; 
        int contador = 0;

        // Laço de repetição para receber os 6 valores do usuário
        for (int i = 0; i < 6; i++) {

            System.out.println(""); // Espaço

            System.out.println("Digite um numero: ");
            valor = entrada.nextDouble();

            // Soma dos valores
            soma = soma + valor;

            // Incremento do contador para facilitar a media
            contador++;
        }

        double media = soma / contador;

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A media dos valores é: " + media);

        entrada.close();
    }
}
