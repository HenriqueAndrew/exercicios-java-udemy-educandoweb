package exercicioGenericsValorMaximoProduto;

import java.util.List;

public class CalculadoraMax {
	
	public static <T extends Comparable<T>> T maximo(List<T> produtos) {
		if (produtos.isEmpty()) {
			throw new IllegalStateException("Lista não pode estar vazia!");			
		}
		T maximo = produtos.get(0);
		for (T item : produtos) {
			if (item.compareTo(maximo) > 0) {
				maximo = item;
			}
		}
		return maximo;
	}
	
}
