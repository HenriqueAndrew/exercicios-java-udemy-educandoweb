package exercicioProgOrientObjetosContaBancaria2Heranca;

public class ContaPoupanca extends Conta{
	
	private Double taxaJuros;
	
	public ContaPoupanca () {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double balanco, Double taxaJuros) {
		super(numero, titular, balanco);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxa() {
		return taxaJuros;
	}

	public void setTaxa(Double taxa) {
		this.taxaJuros = taxa;
	}
	
	public void atualizaBalanco() {
		balanco += balanco * taxaJuros;
	}

	@Override
	public void saque(Double valor) {
		balanco -= valor;
	}	
	

}
