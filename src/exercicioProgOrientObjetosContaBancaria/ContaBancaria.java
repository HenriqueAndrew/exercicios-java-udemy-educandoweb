package exercicioProgOrientObjetosContaBancaria;

public class ContaBancaria {
		
	private int nrConta;
	private String nometitular;
	private double saldo;
	
	public ContaBancaria() {
		
	}	

	public ContaBancaria(int nrConta, String nometitular) {
		this.nrConta = nrConta;
		this.nometitular = nometitular;
	}

	public ContaBancaria(int nrConta, String nometitular, double depositoInicial) {
		super();
		this.nrConta = nrConta;
		this.nometitular = nometitular;
		deposito(depositoInicial); //encapsulamento regra do negocio (metodo de deposito inicial adicionado ao construtor)
	}

	public String getNometitular() {
		return nometitular;
	}

	public void setNometitular(String nometitular) {
		this.nometitular = nometitular;
	}

	public int getNrConta() {
		return nrConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double deposito(double valor) {
		saldo += valor;
		return saldo;
	}
	
	public double saque(double valor) {
		saldo -= valor + 5.0; 
		return saldo;
	}
	
	public String toString() {
		return "Número da conta: " + this.nrConta
				+ "\nTitular: " + this.nometitular
				+ "\nSaldo: " + String.format("%.2f", this.saldo);
	}

}
