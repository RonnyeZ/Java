import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            //Escreva um código que receba o valor do raio de uma circunferência e retorne a área desta circunferência.
            
            System.out.println("Escreva o raio do círculo:");
            double raio = entrada.nextDouble();

            double area = Math.PI * Math.pow(raio, 2);

            System.out.println("A área do círculo é: " + area);

        entrada.close();
        }
}
