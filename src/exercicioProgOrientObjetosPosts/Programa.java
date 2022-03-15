package exercicioProgOrientObjetosPosts;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario ("Tenha uma boa viagem!");
		Comentario c2 = new Comentario ("Uau que incrível!");
		Publicacao p1 = new Publicacao (sdf.parse("21/06/2018 13:05:44"), "Viagem para Nova Zelândia", "Estou indo para visitar esse país maravilhoso", 12);
		
		p1.adicionaComentario(c1);
		p1.adicionaComentario(c2);
		
		System.out.println(p1);
		
		
		Comentario c3 = new Comentario ("Boa noite rapazes");
		Comentario c4 = new Comentario ("Que a força esteja com você");
		Publicacao p2 = new Publicacao (sdf.parse("28/07/2018 23:14:19"), "Boa noite", "Vejo você amanhã", 5);
		
		p2.adicionaComentario(c3);
		p2.adicionaComentario(c4);
		
		System.out.println(p2);
		

	}
	
	

}
