package com.Basic.JavaPractice;

public class ArraySum {
    public static void main(String[] args) {
        int[] elements = new int[]{1,2,3,4,5};
        int sum=0;
        for(int i=0;i<elements.length;i++){
            sum+=elements[i];
        }
        System.out.println("The sum of the od the array elements is:"+sum);

    }


}
