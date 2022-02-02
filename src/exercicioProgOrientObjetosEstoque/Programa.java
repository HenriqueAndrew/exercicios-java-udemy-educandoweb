package exercicioProgOrientObjetosEstoque;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int operacao = 0;
		int quantidade;

		Produto produto = new Produto();
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome:");
		produto.nome = sc.nextLine();
		System.out.print("Preço");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();

		System.out.println("Dados do produto>>> \n" + produto);

		System.out.println(
				"\n\nInforme a operação que deseja realizar\n" + "1 - Adicionar quantidade do produto no estoque\n"
						+ "2 - Retirar quantidade do produto no estoque\n" + "0 - Sair do sistema");

		operacao = sc.nextInt();

		if (operacao == 1) {
			System.out.println("\nDigite a quantidade do produto que deseja adicionar em estoque: ");
			quantidade = sc.nextInt();
			produto.adicionaProdutos(quantidade);
			System.out.println("Dados do produto>>> \n" + produto);
		} else if (operacao == 2) {
			System.out.println("\nDigite a quantidade do produto que deseja retirar do estoque: ");
			quantidade = sc.nextInt();
			produto.removerProdutos(quantidade);

			System.out.println("Dados do produto>>> \n" + produto);
		} else {
			System.out.println("Programa finalizado!");
		}

		sc.close();

	}

}
