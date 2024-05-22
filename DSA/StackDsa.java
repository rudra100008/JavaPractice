package com.company.DSA;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class StackDsa {
	public final int Max_Size=10;
	int top=-1;
	 public int[] data=new int[Max_Size];
	public void push(int value) {
		if(top==Max_Size-1) {
			System.out.println("Stack is full.");
			return;
		}
		data[++top]=value;
	}
	public int pop() {
		int value;
		if(top==-1) {
			System.out.println("Stack is empty.Cannot pop an element");
			return -1;
		}
		value=data[top];
		data[top--]=0;
		return value;
	}
	public int peek() {
		if(top==-1) {
			System.out.println("Stack is empty.");
			return -1;
		}
		return data[top];
	}
	public void displayElements() {
		System.out.println("Elements in stack is:");
	  for(int i=0;i<=top;i++) {
		  System.out.println(data[i]);
	  }
	}
	
	public static void main(String[] args) {
		StackDsa stack= new StackDsa();
		boolean isStack=true;
		Scanner input =new Scanner(System.in);
		while(isStack) {
		System.out.println("Enter your choice:");
		System.out.println("1.push \n2.peek \n3.pop \n4.Display \n5.exit");
		int choice=input.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter the elements in the stack");
			int value = input.nextInt();
		    stack.push(value);
			break;
		}
		case 2:{
			int value=stack.pop();
			if (value != -1) {
				System.out.println("Elements popped is: "+value);
			}
			break;
		}
		case 3:{
			int peek=stack.peek();
			if(peek!=-1) {
				System.out.println("Elements in stack is: "+peek);
			}
			break;
		}
		case 4:{
			stack.displayElements();
		}
		case 5:{
			System.out.println("Stack Existing...........");
			isStack=false;
			input.close();
			return;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " +choice);
		}
		}
	
	}

}
