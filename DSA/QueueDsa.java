package com.company.DSAPractice;

import java.util.Scanner;

public class QueueDsa {
    public int Max_Size=4;
    public int front=-1;
    public int rear=-1;
    public int[] queue=new int[Max_Size];

    public boolean isFull(){
        if ( rear==Max_Size-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if (front== -1 &&rear==-1){
            return true;
        }else {
            return false;
        }
    }
    public void enqueue( int value){
        if (!isFull()){
            front=0;
            queue[++rear]=value;
            System.out.println("Element Enqueued: "+queue[rear]);
        }else{
            System.err.println("Queue OverFlow......");
        }
    }
    public int dequeue(){
        if (isEmpty()){
            return -1;
        }
        int value =queue[front];
        if (front==rear){front=rear=-1;}
        else {front=front+1;}
        return value;
    }
    public void peek(){
        System.out.println("Elements in Queue: ");
        for (int i=front;i!=rear;i++){
            System.out.println(queue[i]);
        }
        System.out.println(queue[rear]);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        QueueDsa queue =new QueueDsa();
        boolean exist=false;
        while (!exist){
            System.out.println("\t\t------Queue------");
            System.out.println("\n1.Enqueue" +
                    "\n2.Dequeue" +
                    "\n3.Peek" +
                    "\n4.Exist");
            System.out.println("Enter your choice: ");
            int choice =scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter the element: ");
                    int value=scanner.nextInt();
                    queue.enqueue(value);
                    break;
                }
                case 2:{
                    int value= queue.dequeue();
                    if (value!= -1){
                        System.out.println("Element Dequeued: "+value);
                    }else {
                        System.err.println("Queue Underflow.....");
                    }
                    break;
                }
                case 3:{
                    queue.peek();
                    break;
                } case 4:{
                    exist=true;
                    break;
                }
                default:
                    System.out.println("Invalid Choice!!!PLease enter correct choice.");
            }
        }
    }
}
