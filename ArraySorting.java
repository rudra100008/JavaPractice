package com.Basic.JavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    private final String[] fruits;
    ArraySorting(String[] fruits){
        this.fruits =fruits;
    }
    public static void arrayFruits(String[] getFruits){
        for (int i=0;i<getFruits.length;i++){
            String temp =getFruits[i];
            System.out.println(temp);
        }
    }
    public static void arraySorting(String[] sorted){
      int a=sorted.length;
      for (int i=0;i<a;i++){
          for (int j=i+1;j<a;j++){
              if (sorted[i].compareTo(sorted[j])>0){
                  String temp = sorted[i];
                  sorted[i] =sorted[j];
                  sorted[j] =temp;
              }
          }
      }
        System.out.println(Arrays.toString(sorted));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers of elments in array:");
        int n= input.nextShort();
        String[] fruits = new String[n+1];
       new   ArraySorting(fruits);

        System.out.println("Enter the fruits:");
        for (int i=0;i<fruits.length;i++){
            fruits[i]= input.nextLine();
        }
        arrayFruits(fruits);
        arraySorting(fruits);
    }
}
