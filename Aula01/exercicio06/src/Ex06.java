import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            // Escreva um código que receba 3 números inteiro e os exiba em ordem crescente

            System.out.println("Defina 3 valores:");
            int x1 = entrada.nextInt();
            int x2 = entrada.nextInt();
            int x3 = entrada.nextInt();

            if ((x1 > x2) && (x1 > x3)){
                System.out.println(x1 + " " + x2 + "" + x3);
            } else {
                System.out.println(x1 + " " + x3 + "" + x2);

            } else if ((x2 > x1) && (x2 > x3)){
                System.out.println(x2 + " " + x1 + "" + x3);
            } else {
                System.out.println(x2 + " " + x3 + "" + x1);  
                
            } else if ((x3 > x1) && (x3 > x2)){
                System.out.println(x3 + " " + x1 + "" + x2);
            } else {
                System.out.println(x3 + " " + x2 + "" + x1);
            }

        entrada.close();
        }
}
