/*
 * Program: Queue2.java
 * Last Date of this Revision: May 13, 2023
 * 
 * Purpose: Create a Queue2 class that implements a queue data structure for data type Object. Since Object is the superclass of other objects, a Queue2 object can store objects from any class. Write appropriate client code to test
the Object2 class.
 * 
 * Author: Your Name, Elyas Hossaini
 * School: CHHS
 * Course: Computer Programming 30
 */
package Skillbuilding;

public class Queue2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue2 q2 = new Queue2(4);

		System.out.println("Adding to q2");
		q2.enqueue("Red"); // Add "Red" to the queue
		q2.enqueue("Orange"); // Add "Orange" to the queue
		q2.enqueue("Brown"); // Add "Brown" to the queue
		q2.enqueue("Yellow"); // Add "Yellow" to the queue

		System.out.println("Front of q2: " + q2.front()); // Print the front item of the queue
		System.out.println("Items in q2: " + q2.size()); // Print the number of items in the queue

		System.out.println("Removing front item: " + q2.dequeue()); // Remove and print the front item of the queue
		System.out.println("Front of q2: " + q2.front()); // Print the new front item of the queue
		System.out.println("Items in q2: " + q2.size()); // Print the updated number of items in the queue

	}

}
/*
Adding to q2
Front of q2: Red
Items in q2: 4
Removing front item: Red
Front of q2: Orange
Items in q2: 3

*/