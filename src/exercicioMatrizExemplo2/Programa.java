package exercicioMatrizExemplo2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o número de linhas que deseja para matriz: ");
		int m = sc.nextInt();
		System.out.println("Informe o número de colunas que deseja para matriz: ");
		int n = sc.nextInt();
		
		int [][] matriz = new int [m][n];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Número: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe o número que deseja fazer a consulta: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Posição: " + i + "," + j + ":");
					if(j > 0) {
					System.out.println("Número da esquerda: " + matriz[i][j-1]);
					}
					if(i > 0) {
					System.out.println("Número de cima: " + matriz[i-1][j]);
					}
					if(j < matriz[i].length-1) {
					System.out.println("Número da direita: " + matriz[i][j+1]);					
					}
					if(i < matriz.length-1) {
					System.out.println("Número de baixo: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}
