package exercicioSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Programa {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); //rápido porém não garante a ordem
		Set<String> set2 = new TreeSet<>(); //garante a ordem (Alfabetica) mas é mais demorado
		Set<String> set3 = new LinkedHashSet<>(); // garante a ordem que foi adicionado, tempo de demora médio		
		
		//Adicionar
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set2.add("Impressora");
		set2.add("Teclado");
		set2.add("Mouse");
		
		set3.add("BTV box 11");
		set3.add("Mesa");
		set3.add("Cadeira");
		
		System.out.println(set.contains("Notebook"));
		System.out.println(set2.contains("Impressora"));

		
		for(String p : set) {
			System.out.println(p);
		}
		System.out.println();
		
		for(String p : set2) {
			System.out.println(p);
		}
		System.out.println();
		
		for(String p : set3) {
			System.out.println(p);
		}
		
		System.out.println("\n\n");
		
		//Remover
		set.remove("Tablet"); //remover o elemento conforme descrição indicada
		set2.removeIf(x -> x.length() >=3);//remover todo elemento x tal que x.lenght (tamanho da palavra) seja igual ou maior a 3 letras
		set3.removeIf(x -> x.charAt(0) == 'T'); //remover elementos que tenham como primeira letra, a letra "T";
		
		for(String p : set) {
			System.out.println(p);
		}
		System.out.println();
		
		for(String p : set2) {
			System.out.println(p);
		}
		System.out.println();
		
		for(String p : set3) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//União - junção dos elementos que existem no conjunto 'a' com os elementos que existem no conjunto 'b'
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		System.out.println();
		
		//Intersecção - junção dos elementos que existem obrigatoriamente nos dois conjuntos 'a' e 'b'
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		System.out.println();
		
		//Diferença - junção dos elementos que existem no conjunto 'a' e que não existem no conjunto 'b'
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
	}

}
