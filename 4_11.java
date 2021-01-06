// Read an int value from the user specifying a certain number of cents. Use if statements to 
// print out the name of the corresponding coin in U.S. currency according to the table below. 
// If the value doesn’t match any coin, print no coin.  Do this using switch instead of if.

import java.util.*; 

public class CoinSelector {
    public static void main(Integer[] args) {
        Scanner in = new Scanner( System.in );
        int coin;
        String coin_name;

        System.out.print("Please enter a certain number of cents: ");
        coin = in.nextInt(); 
        
        switch( coin ) {
            case 1:  coin_name = "penny"; break;
            case 5:  coin_name = "nickel"; break;
            case 10: coin_name = "dime"; break;
            case 25: coin_name = "quarter"; break;
            case 50: coin_name = "half-dollar"; break;
            case 100: coin_name = "dollar"; break;
            default: coin_name = "no coin"; break;

            System.out.println("The coin name for " + coin + "cents is" + 
                coin_name + ".");
        }    
    }
}

// Read a String value from the user that gives one of the 6 coin names given in the table above. 
// Use if statements to print out the corresponding number of cents for the input. If the name 
// doesn’t many any coin, print unknown coin.

import java.util.*; 

public class CoinNamer {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        String coin_name;
        int coin;

        System.out.print("Please enter the name of a coin: ");
        coin = in.nextString(); 

        switch( coin ) {
            case "penny":  coin = 1; break;
            case "nickel":  coin = 5; break;
            case "dime": coin = 10; break;
            case "quarter": coin = 25; break;
            case "half-dollar": coin = 50; break;
            case "dollar": coin = 100; break;
            default: coin_name = "unknown coin"; break;

            System.out.println("The coin amount for a" + coin_name + "is" + 
                coin + "cents.");
        }
    }
}