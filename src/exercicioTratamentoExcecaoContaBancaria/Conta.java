package exercicioTratamentoExcecaoContaBancaria;

public class Conta {

	private Integer nconta;
	private String titular;
	private Double balanco;
	private Double limiteSaque;

	public Conta() {

	}

	public Conta(Integer nconta, String titular, Double balanco, Double limiteSaque) {
		this.nconta = nconta;
		this.titular = titular;
		this.balanco = balanco;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNconta() {
		return nconta;
	}

	public void setNconta(Integer nconta) {
		this.nconta = nconta;
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

	public void setBalanco(Double balanco) {
		this.balanco = balanco;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(Double valor) {
		balanco += valor;
	}

	public void saque(Double valor) throws SaqueExcecao {
		if (balanco < valor) {
			throw new SaqueExcecao("Operação inválida. Valor do saque maior do que o saldo na conta.");
		} else if (limiteSaque < valor) {
			throw new SaqueExcecao("Operação inválida. Valor do saque maior do que o limite permitido");
		} else {
			balanco -= valor;
		}
	}

}
