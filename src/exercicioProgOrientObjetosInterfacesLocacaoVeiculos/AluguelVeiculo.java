package exercicioProgOrientObjetosInterfacesLocacaoVeiculos;

import java.util.Date;

public class AluguelVeiculo {
	
	private Date dtInicio;
	private Date dtFinal;
	
	private Veiculos veiculo;
	private Fatura  fatura;
	
	public AluguelVeiculo() {
		
	}

	public AluguelVeiculo(Date dtInicio, Date dtFinal, Veiculos veiculo) {
		this.dtInicio = dtInicio;
		this.dtFinal = dtFinal;
		this.veiculo = veiculo;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFinal() {
		return dtFinal;
	}

	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}	

}
