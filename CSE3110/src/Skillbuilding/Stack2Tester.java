/*
 * Program: Stack2.java
 * Last Date of this Revision: May 11, 2023
 * 
 * Purpose: Create a Stack2 class that implements a stack data structure for data type Object. Since Object is the superclass of other objects, a Stack2 object can store objects from any class. Write appropriate client code to test
the Stack2 class.
 * 
 * Author: Your Name, Elyas Hossaini
 * School: CHHS
 * Course: Computer Programming 30
 */
package Skillbuilding;

public class Stack2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack2 s2 = new Stack2(5);

		s2.push("Red"); // Push "Red" onto the stack
		s2.push("Green"); // Push "Green" onto the stack
		s2.push("Yellow"); // Push "Yellow" onto the stack (LIFO - Last In First Out)

		System.out.println("Top of Stack S2: " + (String) s2.top()); // Print the top item of the stack
		System.out.println("Items in Stack S2: " + s2.size()); // Print the number of items in the stack

		s2.pop(); // Pop (remove) the top item from the stack

		System.out.println("Top of Stack S2: " + (String) s2.top()); // Print the new top item of the stack
		System.out.println("Items in Stack S2: " + s2.size()); // Print the updated number of items in the stack

		System.out.println("Adding new item: Blue");
		s2.push("Blue"); // Push "Blue" onto the stack

		System.out.println("Top of Stack S2: " + (String) s2.top()); // Print the new top item of the stack
		System.out.println("Items in Stack S2: " + s2.size()); // Print the updated number of items in the stack
		

	}

}
/*
Top of Stack S2: Yellow
Items in Stack S2: 3
Top of Stack S2: Green
Items in Stack S2: 2
Adding new item: Blue
Top of Stack S2: Blue
Items in Stack S2: 3

*/