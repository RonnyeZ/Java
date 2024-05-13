package polimorfismo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class GeradorDeExtrato {
	
	public void imprimeExtratoBasico(Conta c) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		
		System.out.println("Data: " + sdf.format(agora));
		System.out.println("Saldo: " + c.getSaldo());
		
	}

}
