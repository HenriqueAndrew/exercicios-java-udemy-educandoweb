package exercicioEnumeracoesContratosTrabalho;

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
		
		System.out.println("Digite o nome do Departamento: ");
		String nomeDepartamento = sc.next();
		System.out.println("Digite o nome do Trabalhador: ");
		String nomeTrabalhador = sc.next();
		System.out.println("Digite o nível do Cargo: ");
		String nivelCargo = sc.next();
		System.out.println("Digite a base salarial: ");
		double baseSalario = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador (nomeTrabalhador, NivelCargo.valueOf(nivelCargo), baseSalario, new Departamento(nomeDepartamento));
		
		System.out.println("Quantos contratos o trabalhador terá?: ");
		int n = sc.nextInt();
		
		//adicionando os contratos
		for(int i = 1; i <=n; i++) {
			System.out.println("Digite o contrato #" + i + " :");
			System.out.println("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.println("Duração (Horas): ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);
			trabalhador.adicionaContrato(contrato);
		}
		
		System.out.println("Digite o mês e o Ano para calcular o valor ganho total (MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Ganho Total: " + mesAno + ": " +  String.format("%.2f", trabalhador.valorGanho(ano, mes)));
		
		sc.close();

	}

}
