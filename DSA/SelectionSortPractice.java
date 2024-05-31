package com.company.DsaPractice;

import java.util.Arrays;

public class SelectionSortPractice {


	public static void main(String[] args) {
	   SelectionSortPractice sort=new SelectionSortPractice();
	   int[] array = { 4, 8, 3, 9, 7, 12, 2, 16, 1};
	   sort.selectionSort(array);
	}
	public void selectionSort(int[] sort) {
		for(int i=0;i<sort.length-1;i++) {
			 int  index=i;
			for(int j=1+i;j<sort.length;j++) {
				if (sort[index]>sort[j]) {
					index=j;
				}
				int temp=sort[index];
				sort[index]=sort[i];
				sort[i]=temp;
			}
			System.out.println("After Sorting"+(i+1)+": "+Arrays.toString(sort));
		}
		
	}

}
