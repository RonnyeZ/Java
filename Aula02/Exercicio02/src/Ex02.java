import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        /*
         Escreva um código que receba um valor inteiro 
         e caso o valor informado seja par, imprimir os 
         valores pares de zero até o valor informado, 
         caso seja ímpar, informar os valores ímpares de 
         1 ao valor informado.
        */

        System.out.println("Defina um valor inteiro.");
        int valor = entrada.nextInt();

        System.out.println(""); //Espaço

        // Se valor for igual a Par
        if (valor % 2 == 0) {

            // Imprimir valores pares de 0 até o valor definido
            for (int i = 0; i <= valor; i = i+2) {

                System.out.println(i);
            }

        // Se valor não for igual a Par, ou seja, for Impar
        } else { 

            // Imprimir valores impares de 0 até o valor definido
            for (int i = 1; i <= valor; i = i+2) {

                System.out.println(i);
            }
        }

        entrada.close();
    }
}
