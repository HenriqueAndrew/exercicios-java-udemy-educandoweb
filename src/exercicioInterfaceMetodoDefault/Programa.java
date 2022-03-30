package exercicioInterfaceMetodoDefault;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		ServicoJuros sj = new ServicoJurosBrasil(2.0);
		double pagamento = sj.pagamento(valor, meses);
		
		System.out.print("Pagamento após " + meses + " meses: ");
		System.out.println(String.format("%.2f", pagamento));

	}

}
