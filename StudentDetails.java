package com.Basic.JavaPractice;
//Design a class representing a student with attributes like name, roll number, and marks. Implement
// methods to calculate their average and display their details.

import java.util.Scanner;

public class StudentDetails {
    private final String[] name;
    private final int[] rollNumber;
    private final double[] marks;

    StudentDetails(String[] name,int[]rollNumber,double[] marks){
       this.name=name;
       this.rollNumber=rollNumber;
       this.marks = marks;
       getDetails();
       showDetails();
       calculateAverage();
    }
    public void getDetails(){
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i< name.length;i++) {
            System.out.print("Name of Student: ");
            name[i]=scanner.next();
            System.out.print("RollNo of Student: ");
            rollNumber[i]=scanner.nextInt();
            System.out.print("MArks of Student:");
            marks[i]=scanner.nextDouble();
            System.out.print("\n");

        }
    }
    public void showDetails(){

        System.out.println("Students Details");
        for (int i=0;i<name.length;i++){
            System.out.println("Name of the Student: "+name[i]);
            System.out.printf("RollNumber of the %s: %d%n ",name[i],rollNumber[i]);
            System.out.printf("Marks of the %s: %.2f%n",name[i],marks[i]);
            System.out.print("\n");
        }
    }
    public void calculateAverage() {
        double totalMarks = 0;
        for (int mark=0;mark<marks.length;mark++) {
            totalMarks += marks[mark];
        }
        double averageMarks = totalMarks / marks.length;
        System.out.printf("Average Marks: %.2f%n", averageMarks);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students you want  to enter");
        int n=scanner.nextInt();
        String[] name = new String[n];
        int[] rollNumber = new int[n];
        double[] marks = new double[n];
        new StudentDetails(name,rollNumber,marks);


    }
}
