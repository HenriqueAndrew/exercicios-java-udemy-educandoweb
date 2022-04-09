package exercicioGenericsServicoImpressao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ServicoImpressao<Integer> si = new ServicoImpressao<>();
		
		System.out.println("Informe a quantidade de valores que deseja inserir: ");
		int n = sc.nextInt();		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i+1) + "° valor: ");
			Integer valor = sc.nextInt();
			si.adicionaValor(valor);
		}
		
		si.imprimir();
		Integer x = si.primeiroValor();
		System.out.println("Primeiro valor: " + x);
		
		sc.close();

	}

}
