package com.company.DsaPractice;
public class Fibonacci {
	
	public static void main(String[] args) {
		int firstNumber =0;
		int secondNumber=1;
		System.out.println(firstNumber+
				"\n"+secondNumber);
		for(int i=0;i<18;i++) {
			int fibonnaciNumber=firstNumber +secondNumber;
			System.out.println(fibonnaciNumber);
		  firstNumber=secondNumber;
		  secondNumber=fibonnaciNumber;
		}
	}

}
