package exerciciosInterfaceListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeiroExemplo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Henrique");
		list.add("Nayanna");
		list.add("Adriano");
		list.add(2, "Hilda"); // adicionando elemento na posição 2 da lista

		System.out.println("Tamanho da lista: " + list.size());// imprimir tamanho da lista

		// para cada string x presente em minha lista
		for (String x : list) { 
			System.out.println(x);
		}

		System.out.println("\n------------------------------\n");

		// removendo elemento da lista na posição 3 da lista
		list.remove(3); 
		list.removeIf(x -> x.charAt(0) == 'A'); // usando função lambda 'Predicado' - Remover todo string 'x' tal que na primeira posição da palavra seja igual a 'A'												

		for (String x : list) { // para cada string x presente em minha lista
			System.out.println(x);
		}

		System.out.println("\n------------------------------\n");

		System.out.println("Indice do Henrique: " + list.indexOf("Henrique")); // trazer indice da lista conforme dado existente
																				
		System.out.println("Indice do Osvaldo: " + list.indexOf("Osvaldo")); // exemplo de quando não ha o dado na lista

		System.out.println("\n------------------------------\n");

		// convertendo lista para stream, faz operação lambda, e converte novamente para
		// lista
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList()); //Filtrando elementos que comecem com a letra 'H'
		for (String x : resultado) {
			System.out.println(x);
		}
		
		System.out.println("\n-------------------------------\n");
		String nome = list.stream().filter(x -> x.charAt(0) == 'N').findFirst().orElse(null); //retorna o primeiro elemento da lista que começa com a letra 'N'
		System.out.println(nome);

	}

}
