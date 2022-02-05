package exercicioProgOrientObjetosAluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a nota do primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a nota do segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a nota do trimestre trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("A nota final do aluno é: %.2f%n", aluno.notafinal());

		if(aluno.notafinal() < 60) {
			System.out.println("Aluno reprovado!");
			System.out.println("Faltou " + aluno.resultadoFinal() + " pontos.");
		}else {
			System.out.println("Aluno aprovado!");
		}
			

	}

}
