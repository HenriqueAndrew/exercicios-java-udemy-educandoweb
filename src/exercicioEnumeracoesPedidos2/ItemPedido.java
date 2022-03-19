package exercicioEnumeracoesPedidos2;

public class ItemPedido {
	
	private Integer quantidade;
	private Double preco;
	
	Produto produto;
	
	public ItemPedido() {
		
	}

	public ItemPedido(Produto produto, Integer quantidade, Double preco) {		
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProdutos() {
		return produto;
	}

	public void setProdutos(Produto produtos) {
		this.produto = produtos;
	}
	
	public double subTotal() {
		return preco * quantidade;
	}
	
	public String toString() {
		return produto.getNome() + ", r$" + String.format("%.2f", preco) + ", Quantidade: " + quantidade + ", Subtotal: r$" + String.format("%.2f", subTotal());
	}
	

}
