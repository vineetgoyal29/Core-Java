package core.java.java.basics;

public class PrimeNumberCheck_11 {
	public static void main(String args[]){  
		  int i,m=0,flag=0;    
		  
		//Enter the number to be checked 
		  int n=43;
		  
		//imperative to check only till half the value of number
		  m=n/2;    
		  
		//0 and 1 are not prime numbers
		  if(n==0||n==1){
		   System.out.println(n+" is not a prime number");    
		  }else{
		   for(i=2;i<=m;i++){    
		    if(n%i==0){    
		     System.out.println(n+" is not a prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  { System.out.println(n+" is a prime number"); }
		  }
		}
}
