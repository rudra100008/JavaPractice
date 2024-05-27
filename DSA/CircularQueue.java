package com.company.DSAPractice;

import java.util.Scanner;

public class CircularQueue {
    public static final  int Max_Size=3;
    public int rear=-1;
    public int head=-1;
    public int[] circular_Queue=new int[Max_Size];

    public boolean isFull(){
        if ((rear==Max_Size-1 && head==0) || rear<head  ){
            return true;
        }else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (head==-1 &&rear==-1){
            return true;
        }else{
            return false;
        }
    }
    public void enqueue(int value){
        if (!isFull()){
            head=0;
            rear=(rear+1)%Max_Size;
            circular_Queue[rear]= value;
            System.out.println("Element Enqueued: "+circular_Queue[rear]);
            System.out.println("Rear: "+rear);
        }else{
            System.err.println("Circular Queue is full.Please try again.");
            System.out.println("Rear: "+rear);
            return;
        }

    }
    public int  dequeue(){
        if (isEmpty()){

            System.err.println("Circular Queue is empty.Please try again.");
            return -1;
        }
        int value=circular_Queue[head];
        if (head==rear){
            head=rear=-1;
        }
       else{

           head=(1+head)%Max_Size;
        }
        return value;
    }
    public void peek(){
        System.out.println("Circular Queue: ");
        for (int i = head; i != rear; i = (i + 1) % Max_Size){
                System.out.println(  circular_Queue[i]);
        }
        System.out.println(circular_Queue[rear]);
    }




    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        CircularQueue queue= new CircularQueue();
        boolean exist =false;
        while(!exist){
            System.out.println("\t\t -------Circular Queue-------");
            System.out.println("\n1.Enqueue"+
                    "\n2.Dequeue"+
                    "\n3.Peek" +
                    "\n4.Exist");
            System.out.println("\n\nEnter your choice: ");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:{
                    System.out.println("Enter the value");
                    int value=scanner.nextInt();
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
                    queue.peek();
                    break;
                }
                case 4:{
                     exist=true;
                     break;
                }
            }
        }
    }
}
