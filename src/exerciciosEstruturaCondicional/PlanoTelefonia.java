package exerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class PlanoTelefonia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minTel;
		double vlFranquia = 50.00, vlmin = 2.00, vlTotal;
		
		vlTotal = vlFranquia;
		System.out.println("Digite a quantidade de minutos que a pessoa consumiu: ");
		minTel = sc.nextInt();		
		
		if (minTel > 100) {
			vlTotal = vlFranquia + (minTel - 100) * vlmin;
		}
		
		System.out.printf("O valor da fatura é = R$%.2f%n", vlTotal);
		
		sc.close();

	}

}
