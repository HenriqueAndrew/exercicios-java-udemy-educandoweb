package exercicioProgOrientObjetosTriangulo2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Triangulo triangulo = new Triangulo();
		System.out.println("Digite a largura do Triângulo: ");		
		triangulo.largura = sc.nextDouble();
		System.out.println("Digite a altura do Triângulo: ");
		triangulo.altura = sc.nextDouble();
				
		System.out.printf("AREA: %.2f%n", triangulo.area());
		System.out.printf("PERIMETRO: %.2f%n", triangulo.perimetro());
		System.out.printf("DIAGONAL: %.2f%n", triangulo.diagonal());
		
		sc.close();

	}

}
