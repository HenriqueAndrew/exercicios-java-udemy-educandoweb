package exercicioVetoresPensionato;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Aluguel[] aluguel = new Aluguel[10];
		
		System.out.println("Quantos quartos serão alugados: ");
		int n = sc.nextInt();
				
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome da pessoa que alugará o quarto: ");
			String nome = sc.next();
			System.out.println("Digite o e-mail da pessoa que alugará o quarto: ");
			String email = sc.next();
			System.out.println("Digite o número do quarto que será alugado: ");
			int nQuarto = sc.nextInt();
			aluguel[nQuarto] = new Aluguel(nome, email);
		}
		
		System.out.println("\nQuartos alugados: ");
		for (int i = 0; i < aluguel.length; i++) {
			if(aluguel[i] != null) {
				System.out.println("\nQuarto " + i  + aluguel[i]);
			}
		}
		
		sc.close();

	}

}
