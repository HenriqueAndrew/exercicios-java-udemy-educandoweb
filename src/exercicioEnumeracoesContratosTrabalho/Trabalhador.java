package exercicioEnumeracoesContratosTrabalho;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	
	private String nome;
	private NivelCargo nivelCargo;
	private Double salarioBase;
	
	//associações 
	private Departamento departamento; //1 trabalho está em 1 departamento
    private List<ContratoHora> contratos = new ArrayList<>(); //1 trabalho pode ter vários contratos
		
	public Trabalhador(String nome, NivelCargo nivelCargo, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivelCargo = nivelCargo;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelCargo getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(NivelCargo nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public Double getBaseSalario() {
		return salarioBase;
	}

	public void setBaseSalario(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}	
	
	public void adicionaContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);		
	}
	
	public double valorGanho(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (ContratoHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
			soma += c.valorTotal();
			}
		}
		return soma;
	}

}
