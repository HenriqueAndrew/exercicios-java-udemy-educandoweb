package exercicioGenericsValorMaximoProduto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Produto> produtos = new ArrayList<>();
		
		String caminho = "C:\\temp\\produtos.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				produtos.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			
			Produto x = CalculadoraMax.maximo(produtos);
			System.out.println("Mais caro: ");
			System.out.println(x);
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
