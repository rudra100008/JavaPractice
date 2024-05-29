package com.company.ExceptionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Write a program that reads a file and handles both FileNotFoundException and IOException. 
//Use nested try-catch blocks to handle these exceptions separately.
public class FileReaderExample {
	public static void main(String[] args) {
		try {
			readFile("Ashum.txt");
		}catch (FileNotFoundException f) {
			System.err.println(f.getMessage());
		}catch (IOException i) {
             System.err.println(i.getMessage());
		}
		
	}
	public static void readFile(String filePath)throws IOException{
		FileInputStream fileInputStream=null;
	
		try {
			fileInputStream=new FileInputStream(filePath);
			int data;
			while((data=fileInputStream.read())!=-1) {
				System.out.println((char)data);
			}
			}finally {
				if (fileInputStream!=null) {
					fileInputStream.close();
				}
			}
	}
}