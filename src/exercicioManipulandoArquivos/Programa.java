package exercicioManipulandoArquivos;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//leitura caminho da pasta que deseja visualizar
		System.out.println("Informa o arquivo que deseja visualizar: ");
		String strArquivo = sc.nextLine();
		
		File arquivo = new File(strArquivo);
		
		//trazer as pastas do caminho informado
		File[] pastas = arquivo.listFiles(File::isDirectory);
		System.out.println("PASTAS: ");
		for(File f : pastas) {
			System.out.println(f);
		}
		
		//trazer os arquivos do caminho informado
		File[] arquivos = arquivo.listFiles(File::isFile);
		System.out.println("ARQUIVOS: ");
		for (File f : arquivos) {
			System.out.println(f);
		}
		
		//criar subpasta
		boolean sucesso = new File(strArquivo + "\\subpasta").mkdir();
		System.out.println("Diretório criado com sucesso: " + sucesso);

		sc.close();
	}

}
