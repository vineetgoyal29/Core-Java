package core.java.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomatting {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String dt = sdf.format(d);
		System.out.println(dt);
	}
}
