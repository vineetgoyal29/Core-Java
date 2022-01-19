package collection.java;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorExample {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList ();
		 
		l.add(55);
		l.add(48);
		l.add(87);
		l.add(897);
		
		System.out.println(l);
		
		Iterator it  = l.iterator();
		
		while (it.hasNext()) {
	//		IteratorExample o = it.next ();
			System.out.println(it.next());		
		}
	}

}
