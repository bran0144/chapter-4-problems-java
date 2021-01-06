// Read in three double values and print the larger of the two of them.

import java.util.*; 

public class GreaterThan {
    public static void main(Double[] args) {
        Scanner in = new Scanner( System.in );
        double first_double, second_double;

        System.out.print("Please enter one double value: ");
        first_double = in.nextDouble(); 
        System.out.print("Please enter a second double value: ");
        second_double = in.nextDouble();
        System.out.print("Please enter a third double value: ");
        third_double = in.nextDouble();

        if( first_double > second_double && first > third_double) {
            System.out.print( first_double ); 
        }
        else if( second_double > first_double && second_double > third_double) {
            System.out.print( second_double ); 
        }
        else if( third_double > second_double && third_double > first_double) {
            System.out.print( third_double ); 
        }
        else {
            System.out.print("Unable to determine greatest value" ); 
        }
    }
}
        