package core.java.string;

public class SplittingAString {
public static void main(String[] args) {
		
		String name = "Vineet Goyal";
		String revnameOne = "";
		String revnameLast = "";
		
		String firstName = name.substring(0,6);
		String lastName = name.substring(7, 12);
	
		
		int lengthOfStringOne = firstName.length();
		int lengthOfStringTwo = lastName.length();
		System.out.println(firstName);
		System.out.println(lastName);

		for (int j = lengthOfStringTwo-1; j>=0; j--) {
			
			revnameLast = revnameLast + name.charAt(j);
			
		}
				System.out.println(revnameOne);
				System.out.println(revnameLast);
				
	}
}
