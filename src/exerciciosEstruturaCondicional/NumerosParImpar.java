package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class NumerosParImpar {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
	    x = sc.nextInt();
	    
	    if (x % 2 == 0) {
	    	System.out.println("NÚMERO PAR!");
	    }
	    else {
	    	System.out.println("NÚMERO ÍMPAR");
	    }
	    
	    sc.close();

	}

}
