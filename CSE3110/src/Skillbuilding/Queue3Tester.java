/*
 * Program: Queue3.java
 * Last Date of this Revision: May 14, 2023
 * 
 * Purpose: The Queue class is limited because the queue size cannot change from its initial size. Create a Queue3 class
that implements a queue data structure using an ArrayList. Write appropriate client code to test the class
 * 
 * Author: Your Name, Elyas Hossaini
 * School: CHHS
 * Course: Computer Programming 30
 */
package Skillbuilding;

public class Queue3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue3 q3 = new Queue3();

		System.out.println("Adding to q3");
		q3.enqueue("Red"); // Add "Red" to the queue
		q3.enqueue("Orange"); // Add "Orange" to the queue
		q3.enqueue("Brown"); // Add "Brown" to the queue
		q3.enqueue("Yellow"); // Add "Yellow" to the queue

		System.out.println("Front of q3: " + q3.front()); // Print the front item of the queue
		System.out.println("Items in q3: " + q3.size()); // Print the number of items in the queue

		System.out.println("Removing front item: " + q3.dequeue()); // Remove and print the front item of the queue
		System.out.println("Front of q3: " + q3.front()); // Print the new front item of the queue
		System.out.println("Items in q3: " + q3.size()); // Print the updated number of items in the queue

	}

}
/*
Adding to q2
Front of q2: Red
Items in q2: 4
Removing front item: Red
Front of q2: Orange
Items in q2: 0

*/