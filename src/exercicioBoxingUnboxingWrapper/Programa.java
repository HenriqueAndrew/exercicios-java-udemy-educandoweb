package exercicioBoxingUnboxingWrapper;

public class Programa {

	public static void main(String[] args) {
		
		int x = 20;
		Object objeto = x; //boxing (transformar tipo primitivo em objeto)
		System.out.println(objeto);
		
		int y = (int) objeto; //unboxing (transformar objeto em tipo primitivo, necessário uso do 'cast' neste caso)
		System.out.println(y);
		
		Integer obj = y; //utilizado da classe wrapper 'Integer', classe equivalente ao tipo primitivo int
		System.out.println(obj);
		
		int z = obj; //tipo primitivo recebendo objeto da classe wrapper, neste caso não foi necessário o uso do 'cast')
		System.out.println(z);

	}

}
