import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
 		int sorteado = (int) ((10 * Math.random()) + 1);
		int valor = 0;
		
		System.out.println("O numero sorteado é: " + sorteado);
		System.out.println("");
		
		while (valor != sorteado) {
			
            System.out.println("Escolha um numero");
            valor += entrada.nextInt();
            
            if (valor == sorteado) {
                System.out.println("Você acertou!");
            
            } else {
                System.out.println("Você errou!");
                valor = 0; 
            }
        }
        
		entrada.close();
	}

}
