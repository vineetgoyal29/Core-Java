package inheritence;

public class Rectangle extends GetSet {
 private int length;
 private int breadth;
 
 public Rectangle(int length, int breadth) {
	 this.length=length;
	 this.breadth=breadth;
 }
 
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
 public double area () {
	 double ar = length*breadth ;
	 System.out.println("area of Rectangle "+ar);
	 return ar;
 }
 
 
}
