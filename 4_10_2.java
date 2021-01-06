// Read a String value from the user that gives one of the 6 coin names given in the table above. 
// Use if statements to print out the corresponding number of cents for the input. If the name 
// doesn’t many any coin, print unknown coin.

import java.util.*; 

public class CoinNamer {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        String coin;

        System.out.print("Please enter the name of a coin: ");
        coin = in.nextString(); 

        if( coin == "penny" ) {
            System.out.print( "1" ); 
        }
        else if( coin == "nickel") {
            System.out.print( "5" ); 
        }
        else if( coin == "dime") {
            System.out.print( "10" ); 
        } 
        else if( coin == "quarter") {
            System.out.print( "25" ); 
        } 
        else if( coin == "half-dollar") {
            System.out.print( "50" ); 
        } 
        else if( coin == "dollar") {
            System.out.print( "100" ); 
        } 
        else {
            System.out.print( "unknown coin" ); 
        }
    }
}