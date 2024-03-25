import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        /*
         Escreva um código que exiba um menu para o usuário com duas opções (1 - continuar, 2 - sair). Exiba o menu até que o usuário digite 2. Caso o usuário informe outro valor diferente de 1 e 2, retornar que o valor é inválido.
        */

        System.out.println("Qual serviço você deseja agora?");
        System.out.println("1 - Continuar");
        System.out.println("2 - Sair");

        int opcao = entrada.nextInt();

        if (opcao != 1 && opcao != 2){

            System.out.println("Sinto muito, porém o valor inserido é inválido.");

        } else {
            while (opcao == 1) { 

                System.out.println("");

                System.out.println("Qual serviço você deseja agora?");
                System.out.println("1 - Continuar");
                System.out.println("2 - Sair"); 
                opcao = entrada.nextInt(); 

                System.out.println("");   
            }

            System.out.println("Obrigado por usar nosso sistema!");
        }

        entrada.close();
    }
}
