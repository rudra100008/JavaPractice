package com.Basic.JavaPractice;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void addFunction( int a ,int b){
        int sum=a+b;
        System.out.println("The addition of two number is : "+sum);
    }
    public static void subtractFunction(int a, int b){
        int subtract =a-b;
        System.out.println("The subtraction of two number is: "+ subtract);
    }
    public static void multiplyFunction(int a, int b){
        int multiply =a*b;
        System.out.println("The multiplication of two number is "+ multiply);
    }
    public static void divideFunction(int a, int b){
        int divide =a/b;
        System.out.println("The division of two number is "+ divide);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("CALCULATOR");
        while(true) {
            System.out.println("\n");
            System.out.println("Choose from below and type:");
            System.out.println("+ - * /");
            String expression = input.next();
            switch (expression) {
                case "+":
                    System.out.println("Enter your two number to add");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    addFunction(num1, num2);
                    break;
                case "-":
                    System.out.println("Enter two number to subtract:");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    subtractFunction(num1, num2);
                    break;
                case "*":
                    System.out.println("Enter two number to multiply: ");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    multiplyFunction(num1, num2);
                    break;
                case "/":
                    System.out.println("Enter the two number for the division: ");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    divideFunction(num1, num2);
                    break;
                default:
                    System.out.println("Invalid Expression!!!");
            }

        }
    }
}
