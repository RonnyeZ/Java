import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            // Escreva um código que receba um valor inteiro e diga se ele é divisível por cinco.

            System.out.println("Defina um valor:");
            int valor = entrada.nextInt();

            if (valor % 5 == 0) {
                System.out.println("Esse valor é divisivel por 5");
            } else {
                System.out.println("Esse valor não é divisivel por 5");
            }

        entrada.close();
        }
}
