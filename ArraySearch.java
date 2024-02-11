package com.Basic.JavaPractice;


import java.util.Scanner;

import static java.lang.System.*;

public class ArraySearch {
    private final String[] name;
    ArraySearch(String[] name){
        this.name =name;

    }
    public static int arraySearch(String[] name, String target){
        for (int i=0;i<name.length;i++) {
            if (name[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(in);
        String[] name = new String[6];
        String target ;
        out.println("Enter the name of students:");
        for (int i=0;i<name.length;i++){
       name[i]= scanner1.nextLine();
       }
        out.println("Search the  name: ");
        target =scanner1.nextLine();
            new ArraySearch(name);
         int getName = arraySearch(name,target);
         if (getName != -1){
             out.println("The name searched is"+" "+ name[getName]);
         }else out.println("The name not found ");
    }
}
