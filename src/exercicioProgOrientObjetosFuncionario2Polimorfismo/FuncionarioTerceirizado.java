package exercicioProgOrientObjetosFuncionario2Polimorfismo;

public class FuncionarioTerceirizado extends Funcionario{
	
	private Double despesaAdic;
	
	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horasTrab, Double valorHora, Double despesaAdic) {
		super(nome, horasTrab, valorHora);
		this.despesaAdic = despesaAdic;
	}

	public Double getDespesaAdic() {
		return despesaAdic;
	}

	public void setDespesaAdic(Double despesaAdic) {
		this.despesaAdic = despesaAdic;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + despesaAdic * 1.1;
		
	}	

}
