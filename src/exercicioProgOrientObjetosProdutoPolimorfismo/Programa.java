package exercicioProgOrientObjetosProdutoPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> produtos = new ArrayList<>();

		System.out.println("Quantos produtos deseja cadastrar: ");
		int p = sc.nextInt();		

		for (int i = 1; i <= p; i++) {
			System.out.println("\nDados do Produto #" + i + ": ");
			System.out.println("Produto comum, usado ou importado (c/u/i)?");
			char tp = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.println("Preço: ");
			double preco = sc.nextDouble();

			if (tp == 'i') {
				System.out.print("Taxa alfândega: ");
				double taxa = sc.nextDouble();
				produtos.add(new ProdutoImportado(nome, preco, taxa));
			} else if (tp == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.next());
				produtos.add(new ProdutoUsado(nome, preco, data));
			} else {
				produtos.add(new Produto(nome, preco));
			}

		}
		
		sc.close();
		
		System.out.println();
		System.out.println("Preço - Etiquetas: ");
		for(Produto prod : produtos) {
			System.out.println(prod.etiquetaPreco());
		}

	}

}
