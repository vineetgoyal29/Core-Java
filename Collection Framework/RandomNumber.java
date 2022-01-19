package collection.java;

import java.util.ArrayList;
import java.util.HashSet;

public class RandomNumber {

	 public static void main(String[] args) {
			ArrayList m = new ArrayList<>();
			
			for (int i=1; i<=100000;i++) {
				m.add(i);
				
			}
			HashSet h = new HashSet<>();
			h.addAll(m);
			System.out.println(h);
			
			for (int j = 0; j <= 50; j++) {
				System.out.println(m.contains(j));
				System.out.println(m.contains(j));
			}
			
		}
}
