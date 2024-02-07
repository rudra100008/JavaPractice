package com.Basic;

public class FactorialCalculator {
    public int calculateFactorial(int n){

        if (n==0)
            n=1;
        else
            n=n*calculateFactorial(n-1);
      return n;
    }

    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
         int a =factorialCalculator.calculateFactorial(5);
        System.out.println(a);
    }
}
