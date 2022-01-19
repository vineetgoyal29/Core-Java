package core.java.java.basics;

public class Factorial_4 {
	public static void main(String[] args) {
		int i, fact = 1;
		
		//The number whose factorial is to be calculated
		int number = 8;
		for (i=number; i>0 ; i--) {
			fact=fact*i;
		}
		System.out.println("The factorial of "+ number+ " is: "+ fact);
	}
}
