package exercicioProgOrientObjetosProdutoPolimorfismo;

public class ProdutoImportado extends Produto{
	
	private Double taxaAlfand;

	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String nome, Double preco, Double taxaAlfand) {
		super(nome, preco);
		this.taxaAlfand = taxaAlfand;
	}

	public Double getTaxaAlfand() {
		return taxaAlfand;
	}

	public void setTaxaAlfand(Double taxaAlfand) {
		this.taxaAlfand = taxaAlfand;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaAlfand;
	}

	@Override
	public String etiquetaPreco() {
		return getNome() + " r$" + String.format("%.2f", precoTotal()) + "(Taxa alfândega: r$" + String.format("%.2f", getTaxaAlfand()) + ")";
	}
	
	
	

}
