package exercicioGenericsCoringaListaFiguras;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Figuras> figuras = new ArrayList<>();
		figuras.add(new Retangulo(3.0, 2.0));
		figuras.add(new Circulo(2.0));
		
		List<Circulo> circulos = new ArrayList<>();
		circulos.add(new Circulo (3.0));
		circulos.add(new Circulo (4.0));
		
		System.out.println("Total area da lista de figuras: " + totalArea(figuras));
		System.out.println("Total area da lista de circulos: " + totalArea(circulos));		
		
		

	}
	
	public static double totalArea(List<? extends Figuras> lista) {
		double soma = 0.0;
		for (Figuras f : lista) {
			soma += f.area();
		}
		return soma;
	}

}
