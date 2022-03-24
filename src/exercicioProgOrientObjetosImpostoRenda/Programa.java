package exercicioProgOrientObjetosImpostoRenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <Contribuinte> contribuintes = new ArrayList<>();
		
		System.out.println("Informe o número de contribuintes que deseja cadastrar: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Contribuinte #" + i + ": ");
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			
			if(c == 'f') {
				System.out.print("Despesas com saúde: ");
				double dSaude = sc.nextDouble();
				contribuintes.add(new PessoaFisica(nome, renda, dSaude));
			}else {
				System.out.print("Número de funcionários: ");
				int nFuncionarios = sc.nextInt();
				contribuintes.add(new PessoaJuridica(nome, renda, nFuncionarios));
			}
		}
		
		double sum = 0;
		System.out.println("\nIMPOSTO PAGO: ");
		for(Contribuinte c : contribuintes) {
			System.out.println(c.getNome() + ": r$" + String.format("%.2f", c.taxa()));
			sum += c.taxa();
		}
		
		System.out.println("Total de impostos: "  + sum);
		
		sc.close();
		

	}

}
