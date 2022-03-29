package exercicioProgOrientObjetosInterfacesContrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do contrato: ");
		System.out.print("N° do contrato: ");
		int numContrato = sc.nextInt();
		System.out.print("Data do contrato (dd/MM/yyyy): ");
		Date dtContrato = sdf.parse(sc.next());
		System.out.println("Informe o valor do contrato: ");
		Double valorContrato = sc.nextDouble();
		Contrato contrato = new Contrato(numContrato, dtContrato, valorContrato);
		
		System.out.print("Informe o número de parcelas: ");
		int parcelas = sc.nextInt();
		ServicoDeContrato servicoContrato = new ServicoDeContrato(new ServicoPayPal());
		servicoContrato.processoContrato(contrato, parcelas);	
		
		System.out.println("PARCELAS: ");
		for(Parcelas p : contrato.getParcelas()) {
			System.out.println(p);
		}
		
		
		sc.close();
		

	}

}
