package Principal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class TestandoDatas {
	
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
	public static void main(String[] args) {
		Date dataSugerida = new Date("2000/01/01 00:00:01");
		
		System.out.println(dateFormat.format(dataSugerida));
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataSugerida);
		
		calendario.add(Calendar.DATE, 1);
		
		Date dataAdicionada = calendario.getTime();

        System.out.println(dateFormat.format(dataAdicionada));
		
				

	}

}
