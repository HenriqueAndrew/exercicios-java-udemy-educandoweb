package exercicioProgOrientObjetosConversaoDolar;

public class ConversaoMoeda {
	
	public static final double IOF = 0.06;
	
	public static double conversaoReal (double dolar, double qt) {
		return dolar * qt * (1.0 + IOF);		
	}
	

}
