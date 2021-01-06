// Read an int value from the user specifying a certain number of cents. Use if statements to 
// print out the name of the corresponding coin in U.S. currency according to the table below. 
// If the value doesn’t match any coin, print no coin.

import java.util.*; 

public class GreaterThan {
    public static void main(Integer[] args) {
        Scanner in = new Scanner( System.in );
        int coin;

        System.out.print("Please enter a certain number of cents: ");
        coin = in.nextInt(); 

        if( coin == 1 ) {
            System.out.print( "penny" ); 
        }
        else if( coin == 5) {
            System.out.print( "nickel" ); 
        }
        else if( coin == 10) {
            System.out.print( "dime" ); 
        } 
        else if( coin == 25) {
            System.out.print( "quarter" ); 
        } 
        else if( coin == 50) {
            System.out.print( "half-doller" ); 
        } 
        else if( coin == 100) {
            System.out.print( "dollar" ); 
        } 
        else {
            System.out.print( "no coin" ); 
        }
    }
}