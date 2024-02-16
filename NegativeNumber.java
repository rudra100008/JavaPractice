package com.ExceptionHandling;
//Create a method that takes an integer as an argument and returns
// its square. Handle the scenario where the input integer is negative by throwing a custom exception.

import java.util.Scanner;

public class NegativeNumber {
    public static int squareNumber(int num){
        return num*num;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        try{


        System.out.println("Square of number:");
        int num =input.nextInt();
        if(num>0) {
            System.out.printf("Square of  number %d is: %d", num, squareNumber(num));
        }else{
            throw new CustomException();
        }
    }catch(CustomException c){
       System.out.println(c.getMessage());

        }
    }
}
class CustomException extends Exception{
    CustomException(){
        super("Invalid number is given");
    }
    CustomException(String message){
        super(message);
    }
}

