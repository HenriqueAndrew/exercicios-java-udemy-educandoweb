package exercicioProgOrientObjetosFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Funcionário: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Salário Bruto: ");
		funcionario.salarioB = sc.nextDouble();
		System.out.println("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.println("=====================\n\nFuncionário terá aumento de quantos porcentos?: ");
		funcionario.taxa = sc.nextDouble();
		System.out.printf("Salário atualizado: %.2f%n", funcionario.aumentarSalario());
		
		sc.close();

	}

}
