package exercicioProgOrientObjetosImpostoRenda;

public class PessoaJuridica extends Contribuinte{
	
	private Integer numEmpregados;
	
	public PessoaJuridica() {
		super();		
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numEmpregados) {
		super(nome, rendaAnual);
		this.numEmpregados = numEmpregados;
	}

	public Integer getNumEmpregados() {
		return numEmpregados;
	}

	public void setNumEmpregados(Integer numEmpregados) {
		this.numEmpregados = numEmpregados;
	}

	@Override
	public Double taxa() {
		if(numEmpregados <= 10) {
			return getRendaAnual() * 0.16;
		}else {
			return getRendaAnual() * 0.14;
		}
		
	}
	
	

}
