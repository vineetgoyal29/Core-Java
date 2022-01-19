package core.java.java.basics;

public class PalindromeNumberCheck_12 {
	public static void main(String args[]){  
		  long r,sum=0,temp; 
		  
		//number to be checked for palindrome
		  long n= 4544542589634l;  
		  
		  temp=n;    
		  while(n>0){    
		//getting remainder   
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp +" is a palindrome number ");    
		  else    
		   System.out.println(temp +" is not a palindrome number");    
		}
}
