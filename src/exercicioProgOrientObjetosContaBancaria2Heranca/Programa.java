package exercicioProgOrientObjetosContaBancaria2Heranca;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaComercial conta = new ContaComercial();
		
		System.out.println("Digite o número da conta: ");
		conta.setNumero(sc.nextInt());		
		System.out.println("Digite o nome do titular da conta: ");
		conta.setTitular(sc.next());
		System.out.println("Qual operação deseja realizar?\n1 - Depósito\n2 - Saque");		
		int operacao = 0;
		operacao = sc.nextInt();
		
		if (operacao == 1) {		
		System.out.println("Digite o valor do depósito: ");
		conta.deposito(sc.nextDouble());
		}
		else if (operacao == 2) {
		System.out.println("Digite o valor do saque: ");
		conta.saque(sc.nextDouble());
		}
		else {
		System.out.println("Operação inválida!");	
		}
		
		System.out.printf("Balanço: %.2f%n", conta.getBalanco());

		sc.close();
	}
		

}
