package exercicioProgOrientObjetosInterfacesLocacaoVeiculos;

public class Fatura {
	
	private Double pgBasico;
	private Double taxa;
	
	public Fatura() {
		
	}

	public Fatura(Double pgBasico, Double taxa) {
		this.pgBasico = pgBasico;
		this.taxa = taxa;
	}

	public Double getPgBasico() {
		return pgBasico;
	}

	public void setPgBasico(Double pgBasico) {
		this.pgBasico = pgBasico;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double getTotalPagamentos() {
		return getPgBasico() + getTaxa();
	}
}
