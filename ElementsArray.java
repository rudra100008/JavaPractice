package com.Basic;

import java.util.Scanner;

public class ElementsArray {
    public static void main(String[] args) {
        int a[]=new int[4];
        System.out.println("Enter six data.");
        for(int i=0;i<a.length;i++){
                Scanner scanner = new Scanner(System.in);
                a[i] = scanner.nextInt();

        }
        for (int j=0;j<a.length;j++){
            System.out.println("The elements in array are :"+"\n" + a[j]);
        }
    }
}
