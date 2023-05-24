/*
 * Program: stack3.java
 * Last Date of this Revision: May 12, 2023
 * 
 * Purpose: The Stack class is limited because the stack size cannot change from its initial size. Create a Stack3 class
that implements a stack data structure using an ArrayList. Write appropriate client code to test the Stack3
class.
 * 
 * Author: Your Name, Elyas Hossaini
 * School: CHHS
 * Course: Computer Programming 30
 */
package Skillbuilding;

public class Stack3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack3 s3 = new Stack3();

		s3.push(16); // Push 16 onto the stack
		s3.push(9); // Push 9 onto the stack
		s3.push(51); // Push 51 onto the stack

		System.out.println("Top of Stack3: " + s3.top()); // Print the top item of the stack
		System.out.println("Items in Stack S2: " + s3.size()); // Print the number of items in the stack

		System.out.println("Removing top item!");
		s3.pop(); // Pop (remove) the top item from the stack

		System.out.println("Top of Stack3: " + s3.top()); // Print the new top item of the stack
		System.out.println("Items in Stack S2: " + s3.size()); // Print the updated number of items in the stack

		System.out.println("Adding a new item");
		s3.push("Crescent"); // Push "Crescent" onto the stack

		System.out.println("Top of Stack3: " + s3.top()); // Print the new top item of the stack
		System.out.println("Items in Stack S2: " + s3.size()); // Print the updated number of items in the stack
	}

	

}
/*
Top of Stack3: 51
Items in Stack S2: 3
Removing top item!
Top of Stack3: 9
Items in Stack S2: 2
Adding a new item
Top of Stack3: Crescent
Items in Stack S2: 3
*/