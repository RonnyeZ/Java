import java.util.Calendar;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

            // Escreva um código que receba a sua idade e retorne o ano do seu nascimento

            System.out.println("Quantos anos você possui ou vai fazer esse ano?");
            int idade = entrada.nextInt();

            int nascimento = cal.get(Calendar.YEAR) - idade;

            System.out.println("Você nasceu no ano de " + nascimento);

        entrada.close();
    }
}
