package collection.java;

public class Marksheet1 implements Comparable<Marksheet1> {
	public String rollNo;
	public String fname;
	public String lname;
	public int physics;
	public int chemistry;
	public int maths;
	
	public Marksheet1() {}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
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

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int compareTo(Marksheet1 m) {
		
		return this.rollNo.compareTo(m.rollNo);
	}

	
	}	
	
	
	

	
	
	
