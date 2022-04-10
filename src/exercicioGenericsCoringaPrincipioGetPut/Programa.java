package exercicioGenericsCoringaPrincipioGetPut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(1, 2, 3, 4);
		List<Double> doubs = Arrays.asList(3.14, 6.18);
		List<Object> objs = new ArrayList<Object>();
		
		copia(ints, objs);
		printList(objs);
		copia(doubs, objs);
		printList(objs);
		
	}
		
		public static void copia(List<? extends Number> origem, List<? super Number> destino) {
			for(Number numero : origem) {
				destino.add(numero);
			}
		}
		
		public static void printList(List<?> list) {
			for (Object obj : list) {
				System.out.println(obj + " ");
			}
			System.out.println();
		}
	

}
