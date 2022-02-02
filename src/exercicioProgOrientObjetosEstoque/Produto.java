package exercicioProgOrientObjetosEstoque;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	public double totalValorEmEstoque() {
		return preco * quantidade;
	}

	public void adicionaProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return "Nome: " + this.nome + "\nPreço Unitário: $ " + String.format("%.2f", this.preco) + "\nQuantidade em estoque: " + quantidade
				+ " unidades" + "\nValor Total: $ " + String.format("%.2f", this.totalValorEmEstoque());
	}

}
