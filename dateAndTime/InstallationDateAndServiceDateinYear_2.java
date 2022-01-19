package core.java.dateAndTime;

import java.util.Calendar;

public class InstallationDateAndServiceDateinYear_2 {
	public static void main(String args[])
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("The installation Date is: " + cal.getTime());
		System.out.println("");
				
		for (int i = 1; i < 13; i++) {
			
			cal.add(Calendar.DATE, +30);
			System.out.println("The "+i+" service date is: "+cal.getTime());
		}
		
	}
}
