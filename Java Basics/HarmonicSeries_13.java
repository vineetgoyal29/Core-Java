package core.java.java.basics;

public class HarmonicSeries_13 {
	public static void main(String args[])
    {
 
        // numberOfTerms is the numberOfTermsber of values we want in a series
        int numberOfTerms = 7;
        double result = 0.0;
 
        System.out.println("The harmonic series is: ");
 

        for (int i = numberOfTerms; i > 0; i--) {
 
            // calculating harmonic values
            result = result + (double)1 / i;
            System.out.print(result + ", ");
        }
    }
}
