package exercicioEnumeracoesPedidos2;

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

		System.out.println("Digite os dados do cliente");
		System.out.println("Nome: ");
		String nomeCliente = sc.next();
		System.out.println("Email: ");
		String email = sc.next();		
		System.out.println("Data de Aniversário: ");
		Date aniversario = sdf.parse(sc.next());
		Cliente cliente = new Cliente (nomeCliente, email, aniversario);
		
		System.out.println("Digite os dados do pedido");
		System.out.println("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		System.out.println("Quantos itens terá o pedido: ");
		int nrItens = sc.nextInt();
		Date dataAtual = new Date();
		Pedido pedido = new Pedido(dataAtual, status, cliente);
		
		for(int i = 1; i <= nrItens; i++) {
			System.out.println("Digite os dados do #" + i + ":" );
			System.out.println("Nome do produto: ");
			String nomeProduto = sc.next();
			System.out.println("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.println("Quantidade: ");
			int qtde = sc.nextInt();
			
			Produto produto = new Produto (nomeProduto, precoProduto); //instanciando produto com os dados de entrada do produto
			ItemPedido itempedido = new ItemPedido(produto, qtde, precoProduto); //instanciando item do pedido e adicionando o produto ao item do pedido
			pedido.adicionaItem(itempedido); //instanciando pedido e adicionando o item do pedido
		}
		
		
		System.out.println("Resumo do Pedido: ");
		System.out.println(pedido);
		/*
		System.out.println("Status do pedido: " + pedido.getStatus());
		System.out.println("Cliente: " + cliente.getNome() + " (" + cliente.getDataAniversario() + ") " + " - " + cliente.getEmail());		
		System.out.println("Itens do pedido: " + pedido.itensPedido);	
		*/	
		
		sc.close();		
	}

}
