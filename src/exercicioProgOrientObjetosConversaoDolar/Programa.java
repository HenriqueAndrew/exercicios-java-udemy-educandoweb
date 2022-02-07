package exercicioProgOrientObjetosConversaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);		
		System.out.println("Digite a cotação atual do Dólar: ");
		double dolar = sc.nextDouble();
		System.out.println("Digite o valor em dólares que deseja comprar: ");
		double qt = sc.nextDouble();
		
		double r = ConversaoMoeda.conversaoReal(dolar, qt);
		
		System.out.printf("O valor em real a ser pago pelo dólar é de: %.2f%n", r);
		
		sc.close();

	}

}
