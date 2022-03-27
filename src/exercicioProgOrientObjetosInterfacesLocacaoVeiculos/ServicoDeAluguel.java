package exercicioProgOrientObjetosInterfacesLocacaoVeiculos;

public class ServicoDeAluguel {
	
	private Double precoDia;
	private double precoHora;
	
	private ServicoDeImposto servicoImposto;

	public ServicoDeAluguel(Double precoDia, double precoHora, ServicoDeImposto servicoImposto) {
		this.precoDia = precoDia;
		this.precoHora = precoHora;
		this.servicoImposto = servicoImposto;
	}

	public void processoAluguel(AluguelVeiculo aluguelVeiculo) {
		long t1 = aluguelVeiculo.getDtInicio().getTime();
		long t2 = aluguelVeiculo.getDtFinal().getTime();
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double pgBasico;
		if(horas <= 12.0) {
			pgBasico = precoHora * Math.ceil(horas);
		}
		else {
			pgBasico = precoDia * Math.ceil(horas / 24);
		}
		
		double taxa = servicoImposto.taxa(pgBasico);
		aluguelVeiculo.setFatura(new Fatura(pgBasico, taxa));
	}
	
	

}
