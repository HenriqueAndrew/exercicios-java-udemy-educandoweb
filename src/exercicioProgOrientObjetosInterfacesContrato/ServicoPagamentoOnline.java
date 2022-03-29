package exercicioProgOrientObjetosInterfacesContrato;

public interface ServicoPagamentoOnline {
	
	public double taxaPagamento(Double valor);
	
	public double jurosMensal(Double valor, Integer meses);

}
