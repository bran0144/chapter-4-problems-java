// Expand the program given in Example 4.5 to give the correct suffixes (always “th”) for 
// numbers that end in 11, 12, and 13. Use the modulus operator to find the last two digits of the 
// number. Using an if statement, a switch statement, or a combination, check for those three cases 
// before going into the normal cases.


import java.util.*;

public class Ordinals {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.print("Please enter a positive number: ");
        int number = in.nextInt();
        String ending;
        
        switch( number % 100) {
            case 11: ending = "th"; break;
            case 12: ending = "th"; break;
            case 13: ending = "th"; break;
        }
        switch( number % 10 ) {
            case 1:  ending = "st"; break;
            case 2:  ending = "nd"; break;
            case 3:  ending = "rd"; break;
            default: ending = "th"; break;
        }
        System.out.println("Its ordinal version is "
            + number + ending + ".");
    }
}