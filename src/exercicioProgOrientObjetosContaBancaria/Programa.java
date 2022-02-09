package exercicioProgOrientObjetosContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria contaBancaria;

		System.out.println("Digite o número da conta que será cadastrada: ");
		int conta = sc.nextInt();
		System.out.println("Digite o nome do Titular da conta que será cadastrada: ");
		String nome = sc.next();
		System.out.println("Terá valor de depósito inicial? (y/n): ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.println("Digite o valor que deseja depositar: ");
			double valor = sc.nextDouble();
			contaBancaria = new ContaBancaria(conta, nome, valor);
		}else {		
		contaBancaria = new ContaBancaria(conta, nome);
		}
		
		System.out.println("Dados da conta: " + contaBancaria);

		System.out.println("\n\nDigite 1 para realizar 'Depósito': \nDigite 2 para realizar 'Saque': ");
		int operacao = sc.nextInt();
		if (operacao == 1) {
			System.out.println("\nDigite o valor que deseja depositar: ");
			contaBancaria.deposito(sc.nextDouble());
			System.out.println("\n\nDados da conta com saldo atualizado após depósito\n" + contaBancaria);
			System.out.println("\nOperação realizada. Sistema finalizado!");
		} else if (operacao == 2) {
			System.out.println("\nDigite o valor que deseja sacar: ");
			contaBancaria.saque(sc.nextDouble());
			System.out.println("\n\nDados da conta com saldo atualizado após saque\n" + contaBancaria);
			System.out.println("\nSistema finalizado!");
		} else {
			System.out.println("\nOperação realizada. Sistema finalizado!");
		}		

		sc.close();

	}

}
