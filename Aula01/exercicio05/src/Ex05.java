import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            /*
            Uma empresa possui três cargos e seus respectivos salários, sendo eles:
                Gerente - R$ 8.500,00
                Analista - R$ 5.000,00
                Suporte - R$ 3.000,00
            Será dado um reajuste de 12% nos salários do Gerente e Analista, e 15% no salário do Suporte.
            
            Escreva um código que faça o reajuste e exiba os novos valores. 
            */

            double gerente = 8500 * 1.12;
            double analista = 5000 * 1.12;
            double suporte = 3000 * 1.15;

            System.out.println("Novo salario do gerente é:" + gerente);
            System.out.println("Novo salario do analista é:" + analista);
            System.out.println("Novo salario do suporte é:" + suporte);

        entrada.close();
        }
}
