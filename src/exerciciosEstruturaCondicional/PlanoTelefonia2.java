package exerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class PlanoTelefonia2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minTel;
		double vlTotal = 50.00, vlmin = 2.00;
		
		System.out.println("Digite a quantidade de minutos que a pessoa consumiu: ");
		minTel = sc.nextInt();		
		
		vlTotal = (minTel > 100) ? vlTotal + (minTel - 100) * vlmin : vlTotal;	
		
		System.out.printf("O valor da fatura é = R$%.2f%n", vlTotal);
		
		sc.close();

	}

}
