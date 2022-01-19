package core.java.java.basics;

public class PositionOfElementinArray_18 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8,9,10,11,12,14,155,4567};
		int x = 1550;
		boolean foundNumber = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==x) {
				System.out.println("The position of "+x+" in this array is: "+ (i+1));
				foundNumber = true;
				break;
			}
			 
				
			}
		if (foundNumber== false) {
			 System.out.println("The number could not be found. Hence, -1");
		}
	}
}
