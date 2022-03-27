package exercicioProgOrientObjetosInterfacesLocacaoVeiculos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		
		System.out.println("Informe os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Data início do aluguel (dd/MM/yyyy HH:mm): ");
		Date dataInicio = sdf.parse(sc.nextLine());
		System.out.print("Data final do aluguel (dd/MM/yyyy HH:mm): ");
		Date dataFinal = sdf.parse(sc.nextLine());

		AluguelVeiculo veiculoalugado = new AluguelVeiculo( dataInicio, dataFinal, new Veiculos(modelo));
		
		System.out.println("Informe o preço por hora: ");
		double precoHora = sc.nextDouble(); 
		System.out.println("Informe o preço por dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoDia, precoHora, new ServicoDeImpostoBrasil());
		servicoDeAluguel.processoAluguel(veiculoalugado);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento Básico: " + String.format("%.2f", veiculoalugado.getFatura().getPgBasico()));
		System.out.println("Imposto: " + String.format("%.2f", veiculoalugado.getFatura().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", veiculoalugado.getFatura().getTotalPagamentos()));
		
		sc.close();
	}

}
