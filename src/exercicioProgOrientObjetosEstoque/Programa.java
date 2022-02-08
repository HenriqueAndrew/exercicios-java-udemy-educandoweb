package exercicioProgOrientObjetosEstoque;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int operacao = 0;
		int qtAlterar;
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Preço");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		//int qt = sc.nextInt();
		Produto produto = new Produto(nome , preco);

		System.out.println("Dados do produto>>> \n" + produto);

		System.out.println(
				"\n\nInforme a operação que deseja realizar\n" + "1 - Adicionar quantidade do produto no estoque\n"
						+ "2 - Retirar quantidade do produto no estoque\n" + /*"3 - Corrigir o nome do Produto\n" +*/  "0 - Sair do sistema");

		operacao = sc.nextInt();

		if (operacao == 1) {
			System.out.println("\nDigite a quantidade do produto que deseja adicionar em estoque: ");
			qtAlterar = sc.nextInt();
			produto.adicionaProdutos(qtAlterar);
			System.out.println("Dados do produto>>> \n" + produto);
		} else if (operacao == 2) {
			System.out.println("\nDigite a quantidade do produto que deseja retirar do estoque: ");
			qtAlterar = sc.nextInt();
			produto.removerProdutos(qtAlterar);
			System.out.println("Dados do produto>>> \n" + produto);			
		} /*else if(operacao == 3){
			System.out.println("\nDigite o novo nome do produto: ");
			String n = sc.nextLine();
			produto.setNome(n);
			System.out.println("Dados do produto>>> \n" + produto);	
		}*/
		else {
			System.out.println("Programa finalizado!");
		}

		sc.close();

	}

}
