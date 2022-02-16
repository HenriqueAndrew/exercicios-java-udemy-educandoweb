package exercicioDatasExemplo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //instanciando objeto da classe SimpleDateFormat com parametro simples, somente data
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //instanciando objeto da classe SimpleDateFormat com parametro alternativo acrescentando hrs
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); //traz a data e hora atual
		Date x2 = new Date(System.currentTimeMillis()); //alternativa para trazer data e hora atual
		Date x3 = new Date(0L); //data com 0 milissegundos, no java representa 0 horas de 01 de janeiro de 1970 (com 3 horas de atraso referente ao horario brasileiro)
		Date x4 = new Date(1000L * 60L * 60L * 5L); //para trazer 5 horas depois em milissegundos: 1000L milissegundos (1 segundo) * 60 seg (1 min) * 60 min (1 hr) * 5 horas
		Date y1 = sdf1.parse("25/06/2018"); //armazenando data txt na variavel convertendo para o formato definido no objeto sdf1;
		Date y2 = sdf2.parse("25/06/2018 15:42:07"); //armazenando data txt na variavel convertendo para o formato definido no objeto sdf2;
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //armazenando data txt na variavel utilizando do padrao ISO 8601;
		
		System.out.println("x1: " + x1); //imprimindo data sem formatação especifica
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-------------");
		System.out.println("x1: " + sdf2.format(x1)); //imprimindo data usando formatação do objeto sdf2
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-------------");
		System.out.println("x1: " + sdf3.format(x1)); //imprimindo data usando formatação do objeto sdf3 (qual foi convertido para a hora GMT (Greenwich Mean Time))
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

	}

}
