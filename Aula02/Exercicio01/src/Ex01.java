import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        /*
         Escreva um código que receba 2 valores do tipo inteiro, faça sua soma e informe se o resultado é par ou ímpar.
        */

        System.out.println("Defina dois valores inteiros:");
        int x1 = entrada.nextInt();
        int x2 = entrada.nextInt();

        int soma = x1 + x2;

        if (soma % 2 == 0) {
            System.out.println("A soma dos valores resulta num número par, sendo esse resultado" + valor);
        } else {
            System.out.println("A soma dos valores resulta num número ímpar, sendo esse resultado " + valor);
        }

        entrada.close();
    }
}
