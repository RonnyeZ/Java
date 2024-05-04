import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Defina um numero inteiro:");
        int valor = entrada.nextInt();

        if (valor % 2 == 0){

            for (int i = 2; i <= valor; i += 2){
                
                System.out.println(i);
            }

        } else {

            for (int i = 1; i <= valor; i += 2){

                System.out.println(i);
            }

        }

        entrada.close();
    }
}
