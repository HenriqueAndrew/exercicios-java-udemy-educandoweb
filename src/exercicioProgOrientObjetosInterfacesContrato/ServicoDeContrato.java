package exercicioProgOrientObjetosInterfacesContrato;

import java.util.Calendar;
import java.util.Date;

public class ServicoDeContrato {

	private ServicoPagamentoOnline servicoPgtoOnline;

	public ServicoDeContrato(ServicoPagamentoOnline servicoPgtoOnline) {
		this.servicoPgtoOnline = servicoPgtoOnline;
	}

	public void processoContrato(Contrato contrato, int meses) {
		double cotaBasica = contrato.getValorTotal() / meses;
		for (int i = 1; i <= meses; i++) {
			Date data = adicionaMeses(contrato.getDtContrato(), i);
			double atualizaCota = cotaBasica + servicoPgtoOnline.jurosMensal(cotaBasica, i);
			double cotaCheia = atualizaCota + servicoPgtoOnline.taxaPagamento(atualizaCota);
			contrato.getParcelas().add(new Parcelas(data, cotaCheia));

		}
	}

	private Date adicionaMeses(Date data, int n) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(Calendar.MONTH, n);
		return calendario.getTime();
	}

}
