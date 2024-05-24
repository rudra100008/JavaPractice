package com.company.DSA;

import java.util.Scanner;

public class LinkedListDsa {
	  class Node{
		 Node next;
		 int data;
		 public Node(int data) {
			 this.data=data;
			 this.next=null;
		 }
	  }
	 public Node head=null;
	 public Node tail =null;
	 
	 public void addNode(int data) {
		 Node newNode=new Node(data);
		 
		 if(head==null) {
			 head=newNode;
			 tail=newNode;
		 }else {
			 tail.next=newNode;
			 tail=newNode;
		 }
	 }
	 public void display(){
		 Node currentNode=head;
		 if (head==null) {
			System.err.println("List is empty...");
			return;
		}
		 System.out.println("The elements in linklist...");
		 while(currentNode !=null) {
			 System.out.println(currentNode.data+" "+currentNode.next+" ");
			 currentNode=currentNode.next;
		 }
		 System.out.println(" ");
	 }
	
	
	public static void main(String[] args) {
      LinkedListDsa link= new LinkedListDsa();
      link.addNode(1);
      link.addNode(2);
      link.addNode(4);
      link.addNode(6);
      link.display();
      
	}

}
