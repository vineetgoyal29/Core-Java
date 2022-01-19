package collection.java;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationExample {
	public static void main(String[] args) {
		
	
	 Vector l = new Vector ();
	  l.add("ONE");
	  l.add("TWO");
	  l.add("THREE");
	  l.add("FOUE");
	  
	  Enumeration en  = l.elements();
		  while (en.hasMoreElements()) {
			  String str = (String) en.nextElement();
			  System.out.println(str);
			 
			  
		  }
	  }
}
