package exercicioEscritaArquivoComBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		String [] linhas = new String[] {"Flamengo", "Fluminense", "Vasco", "Botafogo"};
		
		String pasta = "C:\\temp\\Clubes.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pasta, true))){
			for(String linha : linhas) {
				bw.write(linha);
				System.out.println(linha);
				bw.newLine();				
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}		

	}

}
