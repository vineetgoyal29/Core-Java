package collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet1 {
	public static void main(String[] args) {
		Marksheet1 m1 = new Marksheet1();
		m1.setRollNo("3");
		m1.setFname("Raja");
		m1.setLname("verma");
		m1.setChemistry(58);
		m1.setPhysics(59);
		m1.setMaths(85);
		 
		
		Marksheet1 m2 = new Marksheet1();
		m2.setRollNo("4");
		m2.setFname("Raj");
		m2.setLname("goyel");
		m2.setChemistry(87);
		m2.setPhysics(98);
		m2.setMaths(68);
		
		Marksheet1 m3 = new Marksheet1();
		m3.setRollNo("2");
		m3.setFname("Rohan");
		m3.setLname("Malik");
		m3.setChemistry(77);
		m3.setPhysics(98);
		m3.setMaths(74);
		
		Marksheet1 m4 = new Marksheet1();
		m4.setRollNo("1");
		m4.setFname("Rohit");
		m4.setLname("gupta");
		m4.setChemistry(55);
		m4.setPhysics(66);
		m4.setMaths(77);
		
		ArrayList l = new ArrayList ();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		
		Collections.sort(l);
		
		Iterator it = l.iterator();
		
		while 
			(it.hasNext()) {
			Marksheet1 m = (Marksheet1) it.next();
			
			System.out.println(m.getRollNo() + " " + m.getFname() + " "+ m.getLname() + " " +m.getPhysics() + " "+ m.getChemistry() + " "+ m.getMaths() );
		}
		}

}
