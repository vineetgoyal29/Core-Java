package core.java.java.basics;

public class AverageOfConsecutiveEvenorOddNumbers_14 {
	public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int countOfEvenNumbers=0,countOfOddNumbers=0,sumEven=0,sumOdd=0;

        while(n > 0)
        {
            if(n%2==0)
            {
                countOfEvenNumbers++;
                sumEven = sumEven + n;
            }
            else
            {
                countOfOddNumbers++;
                sumOdd = sumOdd + n;
            }
            
            n--;
        }

            int evenAvg,oddAvg;
            evenAvg = sumEven/countOfEvenNumbers;
            oddAvg = sumOdd/countOfOddNumbers;

            System.out.println("Average of first N Even number is "+evenAvg);
            System.out.println("Average of first N Odd number is "+oddAvg);
    }
}
