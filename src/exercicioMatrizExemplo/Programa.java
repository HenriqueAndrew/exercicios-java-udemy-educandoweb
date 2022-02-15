package exercicioMatrizExemplo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de linhas/colunas que deseja para matriz: ");
		int n = sc.nextInt();
		
		int [][] matriz = new int[n][n]; //criando matriz de inteiros, com o número de linhas/colunas definidas pelo usuário
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();	
			}				
		}
		
		System.out.println("Números da diagonal principal: ");
		for(int i = 0; i < matriz.length; i++) {
				System.out.println(matriz [i][i] + " ");			
		}
		
		System.out.println();
		
		int count = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println("Números negativos: " + count);
		
		sc.close();
		

	}

}
