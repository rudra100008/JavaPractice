package com.company.DSA;

import java.util.Scanner;

public class QueueDsa {
	public final int Max_Size=3;
	public int head=-1;
	public  int rear=-1;
	public int[] queue=new int[Max_Size];
	public boolean isFull() {
		if(rear==Max_Size-1) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		
		if (head==-1&&rear==-1) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is Full.");
			System.err.printf("Data %d is not inserted",value);
			return;
		}
		head=0;
		
		queue[++rear]=value;
     System.out.println(" Element enqueued: "+queue[rear]);
	}
	public int dequeue() {
		int value=-1;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			
			return value;
		}
		 value = queue[head];
        queue[head++] = 0;
        if (head > rear) {
            head = rear = -1; 
        }
		return value;
	}
	public int peek() {
		if (isEmpty()) {
			System.err.println("Queue is empty");
			return -1;
		}
		return queue[head];
	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		QueueDsa queue= new QueueDsa();
		boolean start=true;
		while(start) {
		System.out.println("\n\t\t-------Choose-------");
		System.out.println("\n1.Enqueue \n2.Dequeue \n3.Peek \n4.Empty \n5.Full \n6.exit");
		int choice =input.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter a element in the queue:");
		  int value=input.nextInt();
		  queue.enqueue(value);
		  break;
		}
		case 2:{
			int dequeueValue=queue.dequeue();
			if (dequeueValue==-1) {
				System.err.println("Queue is empty");
			}else {
			System.out.println("Element Dequeued : ");
			System.out.println(dequeueValue);
			}
			break;
		}
		case 3:{
			int data=queue.peek();
			if (data==-1) {
				System.err.println("Queue is empty.");
			}else {
				System.out.println(data);
			}
			break;
		}
		case 4:{
			System.out.println("Queue is:");
			if (queue.isEmpty()) {
				System.err.println("Full");
			}else {
				System.err.println("Empty");
			}
			break;
		}
		case 5:{
			System.out.println("Queue is:");
			if (queue.isFull()) {
				System.err.println("Full");
			}else {
				System.err.println("Empty");
			}
			break;
		}
		case 6:{
			System.out.println("Existing..........");
			start=false;
			return;
		}
		default:
			System.err.println("Unexcepted value: "+choice+" Please enter according to choice ");
	  }
	}
  }

}
