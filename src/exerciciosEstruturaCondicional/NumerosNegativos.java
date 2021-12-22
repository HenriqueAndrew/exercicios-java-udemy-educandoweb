package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("NÚMERO NEGATIVO");
		}
		else {
			System.out.println("NÚMERO NÃO NEGATIVO");
		}
		
		sc.close();

	}

}
