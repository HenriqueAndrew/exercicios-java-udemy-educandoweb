package exercicioProgOrientObjetosEstoque;

public class Produto {

	//Encapsulamento: atributos privados na classe, podem serem acessados ou alterados por outras classes apenas pelos métodos públicos getters e setters
	private String nome; 
	private double preco;
	private int quantidade;
	
	public Produto() {
	}
	
	//Construtores diferentes = sobrecarga de construtores
	public Produto(String nome, double preco, int quantidade) { 
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

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
		return "Nome: " + this.nome 
				+ "\nPreço Unitário: $ " 
				+ String.format("%.2f", this.preco) 
				+ "\nQuantidade em estoque: " + quantidade
				+ " unidades" + "\nValor Total: $ " 
				+ String.format("%.2f", this.totalValorEmEstoque());
	}

}
