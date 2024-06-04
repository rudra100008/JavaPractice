package com.company.ExceptionPractice;
/*Create a program that simulates a scenario where one exception triggers another. For example, try to read data from a file inside a try block.
 In the catch block for the IOException, throw a custom exception like DataProcessingException that wraps the original IOException. 
 Catch the DataProcessingException in another catch block and print a user-friendly error message mentioning the underlying cause (the IOException).*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ChainedException {
	public static void main(String[] args) throws DataProcessingException {
		String filepath="E:\\writer.txt";
//		try {
//			FileOutputStream out=new FileOutputStream(filepath);
//			String text="Ashum practice Java.";
//			byte[] s=text.getBytes();
//			out.write(s);
//			
//			
//		}catch (IOException io) {
//			throw new DataProcessingException("The IOException is called.....");
//		}
//		
		try {
			FileInputStream in=new FileInputStream(filepath);
			int i;
			while((  i= in.read())!=-1) {
				System.out.print((char)i);
			}
		}catch (IOException io) {
			throw new DataProcessingException("The IOException is called.....");//because file not found in defined location.
		}
		
	}
	

}

   class DataProcessingException extends Exception{
	private static final long serialVersionUID = 1L;

	public DataProcessingException(String s) {
		super(s);
	}
	 public DataProcessingException(String message, Throwable cause) {
	        super(message, cause);
	    }
}
