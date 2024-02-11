package com.Basic.JavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public  static int[] arrayReverse(int[] numbers){
        int start =0;
        int index = numbers.length-1;
        while(index>start){
            int temp =numbers[index];
           numbers[index] =numbers[start];
           numbers[start] =temp;
           start++;
           index--;
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        System.out.println("Enter the numbers in array:");
        for (int i=0;i<numbers.length;i++) {
            numbers [i] = scanner.nextInt();
        }
       int[] newArray = arrayReverse(numbers);
            System.out.println("The reverse array is "+ Arrays.toString(newArray));

    }
}
