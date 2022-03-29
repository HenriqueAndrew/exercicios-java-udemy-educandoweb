package exercicioProgOrientObjetosInterfacesContrato;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numContrato;
	private Date dtContrato;
	private Double valorTotal;
	
	List<Parcelas> parcelas = new ArrayList<>();
	
	public Contrato() {
		
	}	

	public Contrato(Integer numContrato, Date dtContrato, Double valorTotal) {
		this.numContrato = numContrato;
		this.dtContrato = dtContrato;
		this.valorTotal = valorTotal;
	}

	public Integer getNumContrato() {
		return numContrato;
	}

	public void setNumContrato(Integer numContrato) {
		this.numContrato = numContrato;
	}

	public Date getDtContrato() {
		return dtContrato;
	}

	public void setDtContrato(Date dtContrato) {
		this.dtContrato = dtContrato;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}
	
	

}
