package com.IO;
//Write a program that reads data from a file and performs some operations on it. in java
import java.io.*;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderExercise {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
      try{
          FileReader reader = new FileReader("D:\\Number.txt");
          BufferedReader bufferedReader = new BufferedReader(reader);
          String line;
          while((line =bufferedReader.readLine())!= null){
              String[] numbers= line.trim().split("\\s+");
              for(String number:numbers){
                  int num =Integer.parseInt(number);
                  sum+=num;
                  count++;
              }
          }
          System.out.println("The sum is: "+sum);
          System.out.println("The count is: "+count);
       bufferedReader.close();
      }catch(IOException io){
          System.out.println("Exception Caught");
          System.out.println(io.getMessage());
      }
    }

}
