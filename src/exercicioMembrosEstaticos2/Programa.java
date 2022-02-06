package exercicioMembrosEstaticos2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculadora.circunferencia(raio);
		double v = Calculadora.volume(raio);			
		
		System.out.printf("Raio: %.2f%n", raio);
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculadora.PI);
		
		sc.close();

	}

}
