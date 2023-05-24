/*

Program: StackedList         Date: 5/15/2023

Purpose: Create a stacklist program that implements a stack using a linked list that can store object data.

Author: Elyas Hossaini 
School: CHHS
Course: Computer Programming 30
 
*/
package Mastery;

public class StackedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackList stack = new StackList();
		
		stack.push("Blue"); // Push "Blue" onto the stack
		stack.push("Green"); // Push "Green" onto the stack
		stack.push("Yellow"); // Push "Yellow" onto the stack
		System.out.println(stack.toString()); // Print the stack

		System.out.println("The top item in the stack is: " + stack.getTop()); // Print the top item of the stack

		System.out.println("Removing the top item");
		stack.pop(); // Remove the top item from the stack
		System.out.println(stack.toString() + "\n"); // Print the updated stack

		System.out.println("Removing all items");
		stack.makeEmpty(); // Remove all items from the stack
		System.out.println(stack.toString() + "\n"); // Print the empty stack

		stack.push("Red"); // Push "Red" onto the stack
		System.out.println("New item being added.");
		System.out.println(stack.toString()); // Print the stack
	}

}
/*
Current items are:
Yellow
Green
Blue

The top item in the stack is: Yellow
Removing the top item
Current items are:
Green
Blue


Removing all items
There are no items in the stack.

New item being added.
Current items are:
Red
*/