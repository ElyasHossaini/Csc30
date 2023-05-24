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
		 
		stack.push("Blue");
		stack.push("Green");
		stack.push("Yellow");
		System.out.println(stack.toString());
		System.out.println("The top item in the stack is: " + stack.getTop());
		
		System.out.println("Removing the top item");
		stack.pop();
		System.out.println(stack.toString() + "\n");
		System.out.println("Removing all items");
		stack.makeEmpty();
		System.out.println(stack.toString() + "\n");
		
		stack.push("Red");
		System.out.println("New item being added.");
		System.out.println(stack.toString());
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