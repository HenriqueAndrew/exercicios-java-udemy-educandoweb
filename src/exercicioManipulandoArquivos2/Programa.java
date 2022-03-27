package exercicioManipulandoArquivos2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <Produto> produtos = new ArrayList<>();
		
		System.out.println("Informe o caminho do arquivo para leitura: ");
		String localizaArquivo = sc.nextLine();
		
		File caminhoArquivo = new File(localizaArquivo);
		String caminho = caminhoArquivo.getParent(); //pega somente o caminho raiz do arquivo
		
		boolean sucesso = new File(caminho + "\\out").mkdir(); //cria nova pasta no caminho indicado
		
		String novoArq = caminho + "\\out\\sumary.csv"; //cria novo arquivo no caminho indicado
		
		try(BufferedReader br = new BufferedReader(new FileReader(localizaArquivo))){
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] campos = itemCsv.split(",");
				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				int qtde = Integer.parseInt(campos[2]);
				
				produtos.add(new Produto(nome, preco, qtde));
				itemCsv = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(novoArq))){
				for(Produto item : produtos) {
					bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(novoArq + " Criado!");
			}catch(IOException e) {
				System.out.println("Erro ao gravar arquivo: " + e.getMessage());
			}
		}catch(IOException e){
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
			
		}
		
		sc.close();
		
	}

}
