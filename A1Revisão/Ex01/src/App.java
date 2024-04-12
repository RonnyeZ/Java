import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Defina 2 numeros inteiros:");
        int x = entrada.nextInt();
        int y = entrada.nextInt();

        if((x % 2 == 0) && (y % 2 == 0)){

            System.out.println("Os dois valores são par, e seu resultado é: " + (x + y));
        
        } else if ((x % 2 != 0) && (y % 2 != 0)) {

            System.out.println("Os dois valores são impar, e seu resultado é: " + (x - y));
        
        } else {
            System.out.println("Ambos os valore são impar e par, então o resultado é: " + (x * y));
        }

        entrada.close();
    }
}
