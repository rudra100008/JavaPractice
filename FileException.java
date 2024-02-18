package com.ExceptionHandling;
//Write a program that reads data from a file and performs some operations on it.
// Handle the scenario where the file does not exist or cannot be read by catching the appropriate exceptions.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        try{
            FileReader reader = new FileReader("D://ashum.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line=bufferedReader.readLine())!=null){
                String[] a =(line.trim().split("//s+"));
                for (String b:a){
                    try{
                        int s;
                        s=Integer.parseInt(b);
                        sum+=s;
                        count++;
                    }catch(NumberFormatException n){
                        System.err.println("Warning: Non-integer value ignored: " + b);
                    }

                }
            }
            System.out.println("sum: " + sum+"\n"+
                    "count: " + count);
            bufferedReader.close();
        }catch (IOException io){
            System.err.println("Exception Caught:"+io.getMessage());

        }
    }
}
