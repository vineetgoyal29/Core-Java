package collection.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingAyyarList {

	public static void main(String[] args) {
		ArrayList l= new ArrayList ();
		l.add(52);
		l.add(87);
		l.add(59);
		l.add(17);
		
		 System.out.println(l);
		
		 Collections.sort(l);
		 
		 System.out.println(l);
	}
}
