package core.java.java.basics;

public class DivisibilityOfSeven_7 {
	public static void main(String[] args) {
		
			int maxLimit = 200;
			int minLimit = 100;
			int sum =0;
			int i;
			for (i = minLimit; i < maxLimit; i++) {
				if (i%7<=0) {
					
					sum = sum + i;
					System.out.println("The number "+i+ " is divisible by 7");
					System.out.println("The sum of all the numbers divisible by 7 is " +sum);
					System.out.println("");
					}
				}
			System.out.println("The sum of all the numbers divisibles by 7 between 100 and 200 is: " +sum);
			System.out.println("");
			}
	}

