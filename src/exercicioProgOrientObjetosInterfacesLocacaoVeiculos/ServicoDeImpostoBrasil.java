package exercicioProgOrientObjetosInterfacesLocacaoVeiculos;

public class ServicoDeImpostoBrasil implements ServicoDeImposto {

	@Override
	public double taxa(double valor) {
		if (valor <= 100.0) {
		return valor * 0.2;
		}else {
			return valor *0.15;
		}
		
	}	

}
