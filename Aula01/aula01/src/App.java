import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe aqui");
        String x1 = entrada.nextLine();
        System.out.println("Esse é seu nome é " + x1);

        entrada.close();
    }
}
