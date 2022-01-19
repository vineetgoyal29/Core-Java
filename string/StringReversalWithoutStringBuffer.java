package core.java.string;

public class StringReversalWithoutStringBuffer {
	public static void main(String[] args) {
		String name = "Vineet Goyal";
		String revname = "";
		String revnameTwo = "";
		int lengthOfString = name.length();
		
		// reversing the entire string
		for (int i = lengthOfString-1; i>=0; i--) {
			revname = revname + name.charAt(i);
			
		}
		System.out.println(name);
		System.out.println("The given string is "+lengthOfString +" Characters long");
		System.out.println(revname);
		
		// making a div for the next line of code
		System.out.println("");
		System.out.println("");
		
		
		// calculating the count of each character used in the string
		
		for (int i = 0; i < args.length; i++) {
			
		}
	 
		
		
		// reversing at their own place
		
		String[] st = name.split(" ");
		System.out.println(st[1]);
		
		String nameFirst = st[0];
		String nameLast = st[1];
		
		System.out.println(nameFirst + nameLast);
		
	 }
}
