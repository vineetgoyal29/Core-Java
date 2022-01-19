package collection.java;

import java.util.Comparator;

public class SortByFname  implements Comparator <Marksheet1>{

	@Override
	public   int compare(Marksheet1 o1, Marksheet1 o2) {
		
		return o1.getFname().compareTo(o2.getFname());
	}
	
	

}
