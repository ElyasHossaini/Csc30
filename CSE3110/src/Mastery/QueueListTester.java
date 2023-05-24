/*

Program: QueueList          Date: 5/23/2023

Purpose: Create a queuelist class that implements a queue using a linked list that can store object data.

Author: Elyas Hossaini 
School: CHHS
Course: Computer Programming 30
 
*/
package Mastery;

public class QueueListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueList ql = new QueueList();
		
		System.out.println("Adding to Queue:");
		
		ql.enqueue("red");
		ql.enqueue("blue");
		ql.enqueue("yellow");
		ql.enqueue("green");
		
		System.out.println("Begging of queue: " + ql.Top());
		System.out.println("Items in queue: " + ql.Size());
		
		System.out.println("Removing front item: ");
		ql.dequeue();
		System.out.println("Front of queue: "+ ql.Top());
		System.out.println("Items in queue: "+ ql.Size());
		
		

	}
}
/*
Adding to Queue:
Begging of queue: red
Items in queue: There are 4 items in the queue.
Removing front item: 
Front of queue: blue
Items in queue: There are 3 items in the queue.
*/