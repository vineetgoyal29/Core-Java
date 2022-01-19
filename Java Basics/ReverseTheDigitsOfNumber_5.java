package core.java.java.basics;

public class ReverseTheDigitsOfNumber_5 {
	public static void main(String[] args) {
		StringBuffer number = new StringBuffer ("15768547486");
		System.out.println("The number has "+ number.length()+" digits.");
		System.out.println("The original number is: "+ number);
		System.out.println("The reverse number is: "+ number.reverse());
	}
}
