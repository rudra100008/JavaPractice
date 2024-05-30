package com.company.DsaPractice;

import java.util.Arrays;

public class BubbleSortPractice {
	public static void main(String[] args) {
		BubbleSortPractice bubble=new BubbleSortPractice();
		int[] array= {7,12,3,6,9,23,14,8};
		System.out.println(Arrays.toString(array));
		bubble.bubbleSort(array);
		
	}
  public void bubbleSort(int[] sort) {
	  boolean swap;
	  for(int i=0;i<=sort.length-1;i++) {
		  swap=false;
		  for(int j=0;j<sort.length-1-i;j++) {
		  if(sort[j]>sort[j+1]) {
			  int temp=sort[j];
			  sort[j]=sort[j+1];
			  sort[j+1]=temp;
			  swap=true;
		     }
		  }   
		  System.out.println("After BubbleSort:"+(i+1)+Arrays.toString(sort));
		  if(!swap) {
			  break;
		  }
	  }
  }
}
