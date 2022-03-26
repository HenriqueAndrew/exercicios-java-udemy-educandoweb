package exercicioInformacoesArquivos;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o caminho do arquivo: ");
		String strCaminho = sc.nextLine();
		
		File caminho = new File(strCaminho);
		
		System.out.println("Somente o nome do arquivo: " + caminho.getName());
		System.out.println("Somente caminho: " + caminho.getParent());
		System.out.println("Caminho e nome do arquivo: " + caminho.getPath());
		
		sc.close();

	}

}
