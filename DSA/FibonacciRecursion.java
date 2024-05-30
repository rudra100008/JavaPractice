package com.company.DsaPractice;



public class FibonacciRecursion {
       public static void main(String[] args) {
    	   int count=18;
    	   fibonacci(0, 1,count);
		
	}
       public  static void   fibonacci(int a, int b,int count) {
    	   if (count==0) {
			return;
		}
    		int sum=a+b;
    		System.out.println(sum);
    		
    		fibonacci(b, sum ,count-1); 
       }
}
