import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor de 1 a 12: ");
        int valor = entrada.nextInt();

        System.out.println("");

        switch (valor){
            case 1: System.out.println("O Mês setado é Janeiro");
                break;
            case 2: System.out.println("O Mês setado é Fevereiro");
                break;
            case 3: System.out.println("O Mês setado é Março");
                break;
            case 4: System.out.println("O Mês setado é Abril");
                break;
            case 5: System.out.println("O Mês setado é Maio");
                break;
            case 6: System.out.println("O Mês setado é Junho");
                break;
            case 7: System.out.println("O Mês setado é Julho");
                break;
            case 8: System.out.println("O Mês setado é Agosto");
                break;
            case 9: System.out.println("O Mês setado é Setembro");
                break;
            case 10: System.out.println("O Mês setado é Outubro");
                break;
            case 11: System.out.println("O Mês setado é Novembro");
                break;
            case 12: System.out.println("O Mês setado é Dezembro");
                break;
            default: System.out.println("Valor definido inválido");
                break;
        }

        entrada.close();
    }
}
