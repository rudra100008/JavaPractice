package com.company.ExceptionPractice;

public class ExceptionPropagation {
	public static void main(String[] args) {
		try {
			method1();
			
		}catch (Exception e) {
			System.err.println("Exception caught: "+e.getMessage());
		}
	}
	public static void method1() throws Exception{
		method2();
	}
	public static void method2()throws Exception{
		method3();
	}
	public static void method3()throws Exception{
		throw new  Exception("Exception caught in method3.");
	}

}
