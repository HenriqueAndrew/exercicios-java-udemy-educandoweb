package exercicioGenericsServicoImpressao;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressao<T> {
	
	private List<T> list = new ArrayList<>();
	
	public void adicionaValor(T valor) {
		list.add(valor);
	}
	
	public T primeiroValor() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista está vazia!");
		}
		return list.get(0);
	}
	
	public void imprimir() {
		System.out.print("Valores: [");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));			
		}
		for(int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
		
	}
			

}
