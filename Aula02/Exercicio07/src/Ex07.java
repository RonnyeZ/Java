import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        /* 
        Escreva um código que escreva a sequência Fibonacci até 
        o valor informado pelo usuário.
         
            Ex.: Caso o usuário informe o valor 100, o resultado será:
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

        Pesquisem sobre a sequência Fibonacci.
        */

        System.out.println("Defina os valores");
        int valor = entrada.nextInt();
        int atual = 0;
        int proximo = 1;

        for(int i = 0; atual <= valor; i++) {
            atual = atual + proximo;
            proximo = atual - proximo;
            System.out.println(proximo);
        }

        entrada.close();
    }
}
