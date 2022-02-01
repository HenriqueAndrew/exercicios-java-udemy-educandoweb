package exercicioProgOrientObjetosTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite o valor dos lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite o valor dos lados do trinagulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("A área do Triangulo X é: %.2f%n", areaX);
		System.out.printf("A área do Triangulo Y é: %.2f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("\nA área do Triangulo X é maior!");
		}
		else {
			System.out.println("\nA área do Triangulo Y é maior!");
		}

	}

}
