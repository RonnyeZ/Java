import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        /* 
         Escreva um código que receba um valor inteiro de 0 a 10. Exiba a tabuada de 0 a 10 do valor informado.
        */

        System.out.println("Digite um numero:");
        int valor = entrada.nextInt();
        int contador = 0;

        System.out.println(""); // Espaço
        for (int i = 0; i <= 10; i++) {
            System.out.println(valor * contador);
            contador++;
        }

        entrada.close();
    }
}
