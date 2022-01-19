package core.java.java.basics;

public class FibonacciSeries_6 {
	public static void main(String[] args) {
	
		int n1=0, n2=1, n3, i;
		//The number of terms in the fibonacci series
		int terms = 24;
		
		//for printing the first two terms of the series
		System.out.print(n1+ " "+ n2);
		for (i = 2; i < terms; ++i) {
			n3=n1+n2;
			System.out.print(" "+ n3);
			n1=n2;
			n2=n3;
		}
	}
}
