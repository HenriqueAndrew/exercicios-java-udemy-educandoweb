package exercicioEnumeracoesPedidos2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date dataAtual;
	private StatusPedido status;
	
	private Cliente cliente;
	List<ItemPedido> itensPedido = new ArrayList<>();

	public Pedido() {
		
	}
	
	public Pedido(Date dataAtual, StatusPedido status, Cliente cliente) {
		this.dataAtual = dataAtual;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	
	public void adicionaItem (ItemPedido item) {
		itensPedido.add(item);
		
	}
	
	public void removeItem(ItemPedido item) {
		itensPedido.remove(item);
		
	}
	
	public double total() {
		double soma = 0.0;
		for(ItemPedido item : itensPedido) {
			soma += item.subTotal();			
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data da pedido: ");
		sb.append(sdf.format(dataAtual) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:\n");
		for (ItemPedido item : itensPedido) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: r$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}
	
	
	
}
