package core.java.java.basics;

import java.lang.Math;
import java.util.Iterator;
public class RandomNumbers_3 {
	public static void main(String[] args) {
				
		for (int i = 1; i < 6; i++) {
			double x = Math.floor(Math.random()*100);
			int randomNumber = (int) Math.round(x);
			System.out.println("The "+i+" random number is: "+ randomNumber);
		}
		
	}
}
