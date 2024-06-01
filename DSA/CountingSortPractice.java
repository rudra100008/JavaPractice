package com.company.DsaPractice;

import java.util.Arrays;

public class CountingSortPractice {
	public  int[] array= {2, 3, 0, 2, 3, 2};
   public static void main(String[] args) {
	CountingSortPractice count=new CountingSortPractice();
	int[] countSort=count.array;
	System.out.println("Array Before Sort: "+ Arrays.toString(countSort));
	count.countingSort(countSort);
}
  public void countingSort(int[] array) {
	  int max=Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
	  int[] count = new int[max + 1];

      // Store the count of each number
      for (int num : array) {
          count[num]++;
      }

      // Output the counts (Optional)
      for (int i = 0; i < count.length; i++) {
          if (count[i] > 0) {
              System.out.printf("Number of %d: %d\n", i, count[i]);
          }
      }

      // Update the input array with sorted elements
      int index = 0;
      for (int i = 0; i < count.length; i++) {
          while (count[i] > 0) {
              array[index++] = i;
              count[i]--;
          }
	  }
	 
	  
  } 
}
