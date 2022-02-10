package exerciciosEstruturaRepeticao;

public class Programa {

	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vetor.length; i++) { //for
		System.out.println(vetor[i]);
		}
		
		for (String obj : vetor) { //for each 
			System.out.println(obj);
		}

	}

}
