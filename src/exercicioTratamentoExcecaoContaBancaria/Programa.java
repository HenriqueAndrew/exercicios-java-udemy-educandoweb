package exercicioTratamentoExcecaoContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Conta conta = new Conta();
		
		try {
		System.out.println("Informe os dados da conta: ");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		String nome = sc.next();
		System.out.print("Saldo inicial: ");
		Double sInicial = sc.nextDouble();
		System.out.print("Valor limite para saque: ");
		Double vlLimite = sc.nextDouble();
		
		conta = new Conta(numero, nome, sInicial, vlLimite);
		
		System.out.println("\nInforme o valor que deseja sacar: ");
		Double vlSaque = sc.nextDouble();
		conta.saque(vlSaque);
		System.out.println("Saldo atualizado: R$" + String.format("%.2f", conta.getBalanco()));
		}
		catch(SaqueExcecao e){
			System.out.println(e.getMessage());
			
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		
		sc.close();

	}

}
