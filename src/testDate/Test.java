package testDate;

import java.text.SimpleDateFormat;
//import java.time.ZonedDateTime;
import java.util.Date;

public class Test {
	
	public static void dateHeure() {
		Date d = new Date();
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat heur = new SimpleDateFormat("HH:mm");
		SimpleDateFormat dateHeur = new SimpleDateFormat();
		
		System.out.println(heur.format(d));
		System.out.println(date.format(d));
		System.out.println(dateHeur.format(d));
				
	} 
	
	
	public static void main(String[] args) {
		dateHeure();

	}

}
