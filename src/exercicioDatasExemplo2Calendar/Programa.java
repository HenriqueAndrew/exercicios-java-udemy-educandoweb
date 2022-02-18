package exercicioDatasExemplo2Calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//Instanciando um objeto data da classe 'SimpleDateFormat'
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //Instanciando uma objeto data da classe 'Date' padrão ISO
		
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();//instanciando um objeto caldendario da classe 'Calendar'
		cal.setTime(d); //definindo o objeto 'd' da classe 'Date' como a data do objeto 'cal' da classe 'Calendar'
		cal.add(Calendar.HOUR_OF_DAY, 4); //adicionando 4 horas do dia no objeto data usando um dos metodos da classe 'Calendar'
		d = cal.getTime(); //atualizando a data após adição supracitada
		
		int dia = cal.get(Calendar.DAY_OF_MONTH);//capturando o dia do mês da data para variavel criada 'dia'
		int mes = 1 + cal.get(Calendar.MONTH); //capturando o Mês da data para variavel criada 'mes'
		int ano = cal.get(Calendar.YEAR); //capturando o ano da data para variavel criada 'ano'
		int hora = cal.get(Calendar.HOUR); //capturando a hora da data para variavel criada 'hora'
		int minutos = cal.get(Calendar.MINUTE); //capturando os minutos da data para variavel criada 'minutos'
		int segundos = cal.get(Calendar.SECOND); //capturando os segundos da data para variavel criada 'segundos'
		
		
		System.out.println(d); //imprimindo data atualizada
		
		System.out.println("Dia: " + dia); //imprimindo o dia da data
		System.out.println("Mês: " + mes); //imprimindo o mes da data
		System.out.println("Ano: " + ano); //imprimindo o ano da data
		System.out.println("Hora: " + hora); //imprimindo a hora da data
		System.out.println("Minutos: " + minutos); //imprimindo os minutos da data
		System.out.println("Segundos: " + segundos); //imprimindo os segundos da data
		

	}

}
