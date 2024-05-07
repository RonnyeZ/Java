import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe 10 valores");
        
        int contador = 1;
        int atual = entrada.nextInt();
        int resultado = atual;

        while (contador < 10){
            
            int proximo = entrada.nextInt();
            
            if (atual % 2 == 0){
                resultado += proximo;

            } else {
                resultado -= proximo;

            }

            atual = proximo;

            contador++;
            //5 2 8 1 5 6 4 4 6 5
        }

        System.out.println(resultado);

        entrada.close();
    }
}
