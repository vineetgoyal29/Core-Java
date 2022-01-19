package core.java.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;


//	static void calculateAge()

public class Test {
		public static void main(String[] args) {
			Date d1 = new Date();
			System.out.println(d1);
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			String dt1 = sdf1.format(d1);
			System.out.println(dt1);
			
			Date d2 = new Date();
			System.out.println(d2);
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
			String dt2 = sdf2.format(d2);
			System.out.println(dt2);
		}
	}
