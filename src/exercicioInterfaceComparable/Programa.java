package exercicioInterfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = new ArrayList<>();
		String caminho = "c:\\temp\\in2.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String funcionarioCsv = br.readLine();
			while(funcionarioCsv != null) {
				String[] campos = funcionarioCsv.split(",");
				funcionarios.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionarioCsv = br.readLine();
			}
			Collections.sort(funcionarios);
			for (Funcionario f : funcionarios) {
				System.out.println(f.getNome() + ", " + String.format("%.2f", f.getSalario()));				
			}
		}catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
