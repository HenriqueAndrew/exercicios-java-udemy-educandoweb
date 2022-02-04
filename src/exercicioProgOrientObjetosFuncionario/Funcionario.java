package exercicioProgOrientObjetosFuncionario;

public class Funcionario {
	
	String nome;
	double salarioB, taxa;
	
	public double salarioLiquido() {
		return salarioB - salarioB * (taxa / 100);
	}
	
	public double aumentarSalario() {
		return salarioB + salarioB * (taxa / 100);
	}
	
	public String toString() {
		return "Funcionário: " + nome + "\nSalário Bruto: " +  String.format("%.2f%n", salarioB) + "\nSalário Líquido: " + String.format("%.2f%n", salarioLiquido()); 
	}

}
