package collection.java;

import java.util.Comparator;

public class Employee implements Comparator <Employee>{
	private int salary;
	private String fname;
	private String lname;
	
	public Employee() {}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary() - o2.getSalary();
	}
	
	

}
