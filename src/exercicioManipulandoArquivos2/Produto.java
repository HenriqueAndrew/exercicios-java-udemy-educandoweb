package exercicioManipulandoArquivos2;

public class Produto {
	
	private String nome;
	private Double precoUnit;
	private Integer qtde;
	
	public Produto () {
		
	}

	public Produto(String nome, Double precoUnit, Integer qtde) {
		this.nome = nome;
		this.precoUnit = precoUnit;
		this.qtde = qtde;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoUnit() {
		return precoUnit;
	}

	public void setPrecoUnit(Double precoUnit) {
		this.precoUnit = precoUnit;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}
	
	public double total() {
		return precoUnit * qtde;
	}	
	

}
