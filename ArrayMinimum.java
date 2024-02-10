package com.Basic.JavaPractice;

public class ArrayMinimum {
    private final int[] numbers;
    ArrayMinimum(int[] numbers){
        this.numbers = numbers;
    }
    public void arrayMinimum(){
        int min= numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (min<numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("The smallest element in array is:"+min);
    }
    public static void main(String[] args)  {
        int[] numbers ={12,14,10,9,7,21};
        ArrayMinimum arrayMinimum = new ArrayMinimum(numbers);
       arrayMinimum.arrayMinimum();

    }
}
