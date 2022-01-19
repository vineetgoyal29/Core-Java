package collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setSalary(55555);
		e1.setFname("Raj");
		e1.setLname("Verma");

		Employee e2 = new Employee();
		e2.setSalary(28597);
		e2.setFname("Rahul");
		e2.setLname("Lekhar");
		
		Employee e3 = new Employee();
		e3.setSalary(15400);
		e3.setFname("Vishal");
		e3.setLname("Dixit");
		
		ArrayList l = new ArrayList ();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		
		Collections.sort(l);
		
		Iterator it = l.iterator();
		
		while 
			(it.hasNext()) {
			Employee  e= (Employee) it.next();
			
			System.out.println(l);
}

	}
}