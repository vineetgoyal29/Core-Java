package collection.java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetIterator {
	public static void main(String[] args) {
		
		LinkedHashSet s = new LinkedHashSet();
		s.add("Rahul");
		s.add("Mayank");
		s.add("Virat");
		s.add("Rishabh");
		
		Iterator it = s.iterator() ;
			while (it.hasNext()) {
				String str = (String) it.next();
				System.out.println(str);
				
				//s.add("Sachin");
				//s.remove("Rahul");
			//	System.out.println(s);
				
		}
		
		
	}

}
