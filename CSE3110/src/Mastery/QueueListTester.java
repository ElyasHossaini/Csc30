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

		ql.enqueue("red"); // Add "red" to the queue
		ql.enqueue("blue"); // Add "blue" to the queue
		ql.enqueue("yellow"); // Add "yellow" to the queue
		ql.enqueue("green"); // Add "green" to the queue

		System.out.println("Beginning of queue: " + ql.Top()); // Print the element at the beginning of the queue
		System.out.println("Items in queue: " + ql.Size()); // Print the number of items in the queue

		System.out.println("Removing front item: ");
		ql.dequeue(); // Remove the front item from the queue
		System.out.println("Front of queue: " + ql.Top()); // Print the new front item of the queue
		System.out.println("Items in queue: " + ql.Size()); // Print the updated number of items in the queue
		
		

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