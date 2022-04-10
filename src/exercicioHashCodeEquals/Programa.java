package exercicioHashCodeEquals;

public class Programa {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Alex", "alex@gmail.com");
		Cliente c3 = new Cliente("Alex", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3)); //true porque os objetos c2 e c3 tem os nomes e e-mails iguais

	}

}
