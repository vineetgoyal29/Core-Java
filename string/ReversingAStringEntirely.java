package core.java.string;

public class ReversingAStringEntirely {
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer ("Vineet Goyal");
		System.out.println("String Length "+ name.length());
		System.out.println("The original string is "+ name);
		System.out.println("The reversed string is "+ name.reverse());
	}
}
