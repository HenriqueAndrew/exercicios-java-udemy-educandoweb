package exercicioInterfaceListasEmpregado;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> empregados = new ArrayList<>();

		System.out.println("Digite a quantidade de funcionários que deseja cadastrar: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Empregado #" + i + ": ");

			System.out.println("Digite o ID do funcionário para cadastro: ");
			int id = sc.nextInt();
			while (validaID(empregados, id)) {
				System.out.println("ID já existente, porfavor digite o ID novamente que deseja cadastrar: ");
				id = sc.nextInt();
			}

			System.out.println("Digite o NOME do funcionário para cadastro: ");
			String nome = sc.next();

			System.out.println("Digite o SALÁRIO do funcionário para cadastro: ");
			double salario = sc.nextDouble();

			Empregado empregado = new Empregado(id, nome, salario);
			empregados.add(empregado);
		}

		for (Empregado x : empregados) {
			System.out.println("\nFuncionário: " + x);
		}

		System.out.println("\nQual funcionário que deseja aumentar o salário? Digite o ID: ");
		int id = sc.nextInt();
		Empregado emp = empregados.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse ID não existe");
		} else {
			System.out.println("Qual é a porcentagem que deseja aplicar de aumento?: ");
			double porcentagem = sc.nextDouble();
			emp.aumentoSalario(porcentagem);
		}
		
		System.out.println("\nLista dos empregados atualizada: \n");
		for(Empregado obj : empregados) {
			System.out.println(obj);
		}

		sc.close();

	}

	public static boolean validaID(List<Empregado> empregado, int id) {
		Empregado emp = empregado.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		return emp != null;
	}

}
