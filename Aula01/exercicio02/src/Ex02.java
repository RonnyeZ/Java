import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            /* 
            Escreva um código que receba 3 valores inteiro 
            (a, b e c). Utilize esses valores para encontrar o 
            valor de delta. Caso o valor de delta seja menor que zero, 
            informar que a equação não possui raízes reais.

            Se for maior ou igual a zero, encontre e informe os 
            valores de x1 e x2. Para raiz quadrada precisaremos 
            importar a biblioteca “math” e usar o comando math.sqrt().
            */
            System.out.println("Escrevas os valores de A, B e C");
            double a = entrada.nextDouble();
            double b = entrada.nextDouble();
            double c = entrada.nextDouble();

            double delta = ((b * b) - (4 * a * c));

            if (delta < 0){
                System.out.println("Nao tem raizes");
            } else {
                double x1 = ((b * (-1)) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((b * (-1)) - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);

            }


        entrada.close();
        }
}
