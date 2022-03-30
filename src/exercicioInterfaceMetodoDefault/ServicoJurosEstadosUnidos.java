package exercicioInterfaceMetodoDefault;

public class ServicoJurosEstadosUnidos implements ServicoJuros {
	
	private double taxaJuros;

	public ServicoJurosEstadosUnidos(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}
	
	

}
