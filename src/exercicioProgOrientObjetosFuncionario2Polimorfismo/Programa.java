package exercicioProgOrientObjetosFuncionario2Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.println("Informe quantos funcionários deseja cadastrar: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Funcionário #" + i + " é terceirizado (s/n)?");
			char ch = sc.next().charAt(0);
			
			System.out.println("Digite os dados do funcionário #" + i + " : \n");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.println("\nHoras trabalhadas: ");
			int horas = sc.nextInt();
			System.out.println("\nValor/Hora: ");
			double valor = sc.nextDouble();
			
			if (ch == 's') {				
				System.out.println("\nDespesa adicional: ");
				double valoradd = sc.nextDouble();
				funcionarios.add(new FuncionarioTerceirizado(nome, horas, valor, valoradd));

			} else {				
				funcionarios.add(new Funcionario(nome, horas, valor));
			}			
			
			}
		
		System.out.println();
		System.out.println("PAGAMENTOS: \n");
		for (Funcionario f : funcionarios) {
			System.out.println(f.getNome() + " - r$: " + String.format("%.2f", f.pagamento()));

		}
		
		sc.close();

	}

}
