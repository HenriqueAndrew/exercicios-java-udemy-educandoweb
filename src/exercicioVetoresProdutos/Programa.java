package exercicioVetoresProdutos;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos que deseja cadastrar: ");
		int n = sc.nextInt();
		Produto [] produtos = new Produto[n];
		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println("Digite o nome do produto: ");
			String nome = sc.next();
			System.out.println("Digite o preço do produto: ");
			double preco = sc.nextDouble();
			produtos[i] = new Produto(nome, preco);
		}
		
		double sum = 0.0;
		for(int i = 0; i < produtos.length; i++) {
			sum += produtos[i].getPreco();
		}
		
		double media = sum / produtos.length;
		
		sc.close();
		
		System.out.printf("A média de preço dos produtos é de: %.2f%n", media);

	}

}
