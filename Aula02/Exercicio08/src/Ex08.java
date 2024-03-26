import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        Scanner entrada= new Scanner(System.in);
        /* 
         Escreva um programa que receba a idade de n pessoas 
         e ao final informe a quantidade de pessoas com idade 
         entre 0 e 25 anos, 26 e 60 anos e maior que 60 anos. 
         Continue recebendo idades até que o usuário informe que 
         não quer mais receber idades.
        */

        String controle = "s";

        int menor26 = 0;
        int menor61 = 0;
        int maior60 = 0;

        while(controle.equals("s")) {

            System.out.print("Informe a idade: ");
            int idade = entrada.nextInt();

            if (idade < 26) {
                menor26++;

            } else if (idade < 61) {
                menor61++;

            } else {
                maior60++;

            }
            System.out.println("Informar mais idades?");
            controle = entrada.next();
        }
        System.out.println("Idade de 0 a 25: " + menor26);
        System.out.println("Idade de 26 a 60: " + menor61);
        System.out.println("Idade de maior que 60: " + maior60);


        entrada.close();
    }
}
