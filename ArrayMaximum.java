package com.Basic.JavaPractice;

public class ArrayMaximum {
    private final int[] numbers;
    ArrayMaximum(int[] numbers){
          this.numbers = numbers;
    }
    public void arrayMaximum(){
        int max = numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>max){
                max= numbers[i];
            }
        }
        System.out.println("The maximum number is :"+max);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{8,7,9,10,13,14,12};
      ArrayMaximum arrayMaximum = new ArrayMaximum(numbers);
      arrayMaximum.arrayMaximum();

    }
}
