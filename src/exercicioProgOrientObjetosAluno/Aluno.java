package exercicioProgOrientObjetosAluno;

public class Aluno {
	
	String nome;
	double nota1, nota2, nota3, notaf;
	
	public double notafinal () {
		return nota1 + nota2 + nota3;		
	}
	
	public double resultadoFinal() {
		if (notafinal() < 60) {
			return 60 - notafinal();			
		}else {
			return 0.0;
		}
		
	}

}
