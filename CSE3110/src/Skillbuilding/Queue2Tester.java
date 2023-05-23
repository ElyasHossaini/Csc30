/*
 * Program: AccountTester.java
 * Last Date of this Revision: May 1, 2023
 * 
 * Purpose: Create a personal Account and Business Account classes that inherit the Account class presented in Chapter 7.
 * Introduce minimum balances where money will be withdrawn if the accounts are below that requirement.
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
		q2.enqueue("Red");
		q2.enqueue("Orange");
		q2.enqueue("Brown");
		q2.enqueue("Yellow");
		
		
		System.out.println("Front of q2: "+ q2.front());
		System.out.println("Items in q2: "+ q2.size());
		
		System.out.println("Removing front item: "+ q2.dequeue());
		System.out.println("Front of q2: "+ q2.front());
		System.out.println("Items in q2: "+ q2.size());


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