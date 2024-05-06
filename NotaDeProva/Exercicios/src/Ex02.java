import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe 10 valores");
        
        int contador = 0;
        int resultado = 0;

        while (contador < 10){
            int valor = entrada.nextInt();

            if (valor % 2 == 0){
                resultado += valor;

            } else {
                resultado -= valor;

            }

            contador++;
        }

        System.out.println(resultado);

        entrada.close();
    }
}
