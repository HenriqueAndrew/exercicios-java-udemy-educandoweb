package exercicioProgOrientObjetosInterfacesContrato;

public class ServicoPayPal implements ServicoPagamentoOnline {
	
	private static final double TAXA_JUROS = 0.02;
	private static final double JUROS_MENSAL = 0.01;

	
	@Override
	public double taxaPagamento(Double valor) {		
		return valor * TAXA_JUROS;
	}

	@Override
	public double jurosMensal(Double valor, Integer meses) {
		return valor * meses * JUROS_MENSAL;
	}
	
	

}
