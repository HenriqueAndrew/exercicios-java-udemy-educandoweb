package exercicioInterfaceMetodoDefault;

import java.security.InvalidParameterException;

public interface ServicoJuros {
	
	double getTaxaJuros();
	
	default double pagamento(double valor, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("N° de meses deve maior do que zero!");
		}
		return valor * Math.pow(1.0 + getTaxaJuros() / 100.0, meses);
	}

}
