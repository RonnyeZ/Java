import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um valor dentre:");
        System.out.println("R$ 10,00"); // 60%
        System.out.println("R$ 25,00"); // 70%
        System.out.println("R$ 50,00"); // 80%
        System.out.println("R$ 100,00"); // 90%

        int valor = entrada.nextInt();

        switch (valor) {
            case 10: System.out.println(valor - (valor * 0.6));
             break;
            case 25: System.out.println(valor - (valor * 0.7));
             break;
            case 50: System.out.println(valor - (valor * 0.8));
             break;
            case 100: System.out.println(valor - (valor * 0.9));
             break;
            default: System.out.println("Valor não disponivel");
             break;
        }

        entrada.close();
    }
}
