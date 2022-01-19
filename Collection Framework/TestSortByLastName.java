package collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSortByLastName {
	
	public static void main(String[] args) {
		Marksheet1 m1 = new Marksheet1();
		m1.setRollNo("3");
		m1.setFname("Raj");
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
		m3.setFname("Rahul");
		m3.setLname("malik");
		m3.setChemistry(77);
		m3.setPhysics(98);
		m3.setMaths(74);
		
		Marksheet1 m4 = new Marksheet1();
		m4.setRollNo("1");
		m4.setFname("Rohan");
		m4.setLname("gupta");
		m4.setChemistry(35);
		m4.setPhysics(96);
		m4.setMaths(97);
		

		Marksheet1 m5 = new Marksheet1();
		m5.setRollNo("6");
		m5.setFname("Rohan");
		m5.setLname("lumba");
		m5.setChemistry(50);
		m5.setPhysics(60);
		m5.setMaths(70);
		 

		Marksheet1 m6 = new Marksheet1();
		m6.setRollNo("5");
		m6.setFname("Rohan");
		m6.setLname("kumar");
		m6.setChemistry(53);
		m6.setPhysics(63);
		m6.setMaths(74);
		

		Marksheet1 m7= new Marksheet1();
		m7.setRollNo("8");
		m7.setFname("Rohan");
		m7.setLname("agrawal");
		m7.setChemistry(51);
		m7.setPhysics(61);
		m7.setMaths(71);

		Marksheet1 m8 = new Marksheet1();
		m8.setRollNo("7");
		m8.setFname("Vivek");
		m8.setLname("sharma");
		m8.setChemistry(58);
		m8.setPhysics(68);
		m8.setMaths(78);
		
		
		
		ArrayList l = new ArrayList ();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		l.add(m6);
		l.add(m7);
		l.add(m8);
		
		Collections.sort(l, new SortByLname());
		//Collections.sort(l, new SortByFname());
		
		Iterator it = l.iterator();
		
		while 
			(it.hasNext()) {
			Marksheet1 m = (Marksheet1) it.next();
			
			System.out.println(m.getRollNo() + " " + m.getFname() + " "+ m.getLname() + " " +m.getPhysics() + " "+ m.getChemistry() + " "+ m.getMaths() );
		}
		}

}





