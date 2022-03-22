package exercicioProgOrientObjetosContaBancaria2Heranca;

public class Conta {	
	
	private Integer numero;
	private String titular;
	protected Double balanco = 0.0;

	
	public Conta () {
		
	}
	
	public Conta(Integer numero, String titular, Double balanco) {
		this.numero = numero;
		this.titular = titular;
		this.balanco = balanco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getBalanco() {
		return balanco;
	}
	
	public void saque (Double valor) {
		balanco -= valor;
	}
	
	public void deposito (Double valor) {
		balanco += valor;
	}

}
