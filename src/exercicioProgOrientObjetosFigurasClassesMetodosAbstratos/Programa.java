package exercicioProgOrientObjetosFigurasClassesMetodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);		
		
		List<Forma> formas = new ArrayList<>();
		
		System.out.println("Informe quantas figuras deseja cadastrar: ");
		int f = sc.nextInt();
		
		for(int i = 1; i <= f; i++) {
			System.out.print("\nFigura #" + i + ": ");
			System.out.print("\nRetângulo ou Circulo (r/c)?");
			char x = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(sc.next());
			
			if(x == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				formas.add(new Retangulo(cor, altura, largura));
			}else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				formas.add(new Circulo(cor, raio));
			}
			
		}		
		
		System.out.println("\nAreas das figuras: ");
		for (Forma forma : formas) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		

		sc.close();

	}

}
