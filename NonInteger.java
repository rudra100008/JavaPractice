package com.ExceptionHandling;
//Write a Java program that prompts the user to enter two integers from the console. Handle the scenario
//where the user enters a non-integer value.

import java.util.InputMismatchException;
import java.util.Scanner;

public class NonInteger  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter two numbers");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("Sum: "+(num2+num1));

        }catch(InputMismatchException non ){
            System.out.println("Caught");
            System.out.println(non.getMessage());
        }

    }

}

