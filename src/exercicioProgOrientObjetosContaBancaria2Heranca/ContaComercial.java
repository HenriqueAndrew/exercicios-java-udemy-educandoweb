package exercicioProgOrientObjetosContaBancaria2Heranca;

public class ContaComercial extends Conta{
	
	private Double limiteEmprestimo;
	
	public ContaComercial() {
		super();
	}

	public ContaComercial(Integer numero, String titular, Double balanco, Double limiteEmprestimo) {
		super(numero, titular, balanco);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo (Double valor) {
		if (valor <= limiteEmprestimo) {
		balanco += valor - 10.0;
		}
	}

}
