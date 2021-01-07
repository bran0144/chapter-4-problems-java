// Every member of your secret club has an ID number. These ID numbers are between 1 and 1,000,000 
// and have two special characteristics: They are multiples of 7 and all end with a 3 in the one’s 
// place. For example, 63 is the smallest such value, and 999,943 is the largest such value. Write a 
// program that prompts the user for an int value, reads it in, and then says whether or not it could 
// be used as an ID number. Note: You need to use the modulus operator in two different ways to test 
// the value correctly.

import java.util.*;

public class ClubId {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.print("Please your ID number: ");
        int number = in.nextInt();

        if( number % 7 == 0 && number % 10 == 3) {
            System.out.print("That is a valid ID number: ");
        }
        else {
            System.out.print("That is an invalid ID number: ");
        }