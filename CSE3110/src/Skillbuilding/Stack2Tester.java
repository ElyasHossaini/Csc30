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

public class Stack2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack2 s2 = new Stack2(5);
		
		s2.push("Red");
		s2.push("Green");
		s2.push("Yellow"); //LIFO Last In First Out
		System.out.println("Top of Stack S2: " + (String)s2.top());
		System.out.println("Items in Stack S2: " + s2.size());
		s2.pop();
		System.out.println("Top of Stack S2: " + (String)s2.top());
		System.out.println("Items in Stack S2: " + s2.size());
		System.out.println("Adding new item: Blue");
		s2.push("Blue");
		System.out.println("Top of Stack S2: " + (String)s2.top());
		System.out.println("Items in Stack S2: " + s2.size());
		

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