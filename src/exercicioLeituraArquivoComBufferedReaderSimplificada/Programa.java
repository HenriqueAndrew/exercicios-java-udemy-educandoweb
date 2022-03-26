package exercicioLeituraArquivoComBufferedReaderSimplificada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		String pasta = "C:\\temp\\clubes.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(pasta))){
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
