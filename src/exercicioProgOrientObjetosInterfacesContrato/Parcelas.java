package exercicioProgOrientObjetosInterfacesContrato;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	
	private Date dtVencimento;
	private Double valor;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcelas() {
		
	}

	public Parcelas(Date dtVencimento, Double valor) {
		this.dtVencimento = dtVencimento;
		this.valor = valor;
	}

	public Date getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return sdf.format(dtVencimento) + " - " + String.format("%.2f", valor);
	}
	
	
	

}
