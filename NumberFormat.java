package com.ExceptionHandling;
//Create a method that takes a string as input and converts it to an integer.
// Handle the scenario where the input string is not a valid integer by throwing a NumberFormatException.

import java.util.Scanner;

public class NumberFormat {
    NumberFormat() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any String: ");
            String word = scan.nextLine();
            int converter = Integer.parseInt(word);
            System.out.println(word + "is converted to " + converter);
        }catch(NumberFormatException n){
            System.err.println("Error in number format "+ n.getMessage());
        }
    }

    public static void main(String[] args) throws NumberFormatException {
        new NumberFormat();
    }
}
