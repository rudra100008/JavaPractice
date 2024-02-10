package com.Basic.JavaPractice;

public class ArrayAverage {
    public static void main(String[] args) {
        double[] numbers = new double[]{12.22,13.45,15.65,67.12};
        double sum =0.00;
        double average ;
        for(int i=0;i<numbers.length;i++){
            sum +=numbers[i];
        }
           average = sum/2;
        System.out.println("The average of the numbers :"+average);
    }
}
