import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Defina um valor inicial");
        int x = entrada.nextInt();
        
        System.out.println("Defina um valor final");
        int y = entrada.nextInt();

        System.out.println("");

        if (y - x <= 1){
            System.out.println(0);

        } else {
            
            for (int i = x+1; i < y; i++) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}
