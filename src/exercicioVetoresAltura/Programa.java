package exercicioVetoresAltura;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de altura que deseja calcular a média: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
				
		for(int i = 0; i < n; i++) {
			System.out.println("Digite a próxima altura: ");
			vect[i] = sc.nextDouble();			
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double media = sum / n;
		
		System.out.printf("Média de altura %.2f%n", media);

		sc.close();
	}

}
