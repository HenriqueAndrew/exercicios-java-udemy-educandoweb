package exercicioProgOrientObjetosContaBancaria2Heranca;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta1 = new Conta(01, "Alex", 0.0);
		ContaComercial conta2 = new ContaComercial(02, "Maria", 5.0, 500.0);
		
		//UPCASTING
		Conta conta3 = conta2; //convertendo contaComercial (classe filha) em Conta (classe pai)
		System.out.println(conta3.getBalanco());
		Conta conta4 = new ContaPoupanca(03, "Joao", 3.0, 0.01);
		System.out.println(conta4.getBalanco());
		
		//DOWNCASTING
		ContaComercial conta5 = (ContaComercial)conta3; //convertendo conta (classe pai) em contaComercial (classe filha)
		conta5.emprestimo(100.0);
		System.out.println(conta5.getBalanco());
		
		//Não é possível converter classe filha (contaPoupança) para outra classe filha (ContaComercial) 
		if(conta4 instanceof ContaComercial) { //não passará pq a conta4 é instancia de ContaPoupanca
			ContaComercial conta6 = (ContaComercial)conta4;
			conta6.emprestimo(200.0);
			System.out.println("emprestimo realizado");			
		}
		
		if (conta4 instanceof ContaPoupanca) { //passará pq a conta4 é instancia de ContaPoupança
			ContaPoupanca conta6 = (ContaPoupanca)conta4;
			conta6.atualizaBalanco();
			System.out.println("balanço atualizada");
		}
		
		//----------------------------------------------
		
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
