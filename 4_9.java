// Read in two double values and print the larger of the two of them.

import java.util.*; 

public class GreaterThan {
    public static void main(Double[] args) {
        Scanner in = new Scanner( System.in );
        double first_double, second_double;

        System.out.print("Please enter one double value: ");
        first_double = in.nextDouble(); 
        System.out.print("Please enter another double value: ");
        second_double = in.nextDouble();

        if( first_double > second_double ) {
            System.out.print( first_double ); 
        }
        else if( second_double > first_double) {
            System.out.print( second_double ); 
        }
        else {
            System.out.print("The doubles are equal" ); 
        }
    }
}
        
