package exercicioLeituraArquivoComBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		String pasta = "c:\\temp\\clubes.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(pasta);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}			
		}
		catch (IOException e){
			System.out.println("Erro: " + e.getMessage());			
		}
		finally {
			try {
				if (br != null)
					br.close();
			    if (fr != null)
				    fr.close();
			}catch (IOException e) {
				e.printStackTrace();			
			}
		}

	}

}
