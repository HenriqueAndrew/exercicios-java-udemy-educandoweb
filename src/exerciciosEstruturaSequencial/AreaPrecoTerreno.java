package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class AreaPrecoTerreno {

	public static void main(String[] args) {		
		
		double larg, comp, vlMetroQ, area, preco;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		larg = sc.nextDouble();
		System.out.println("\nDigite o comprimento do terreno ");
		comp = sc.nextDouble();
		System.out.println("\nDigite o valor do metro quadrado: ");
		vlMetroQ = sc.nextDouble();
		
		area = larg * comp;
		preco = area * vlMetroQ;		
		
		System.out.printf("Á área do terreno é de: %.2f", area);
		System.out.printf("\nO preço do terreno é de: %.2f", preco);		
		
		sc.close();		

	}

}
