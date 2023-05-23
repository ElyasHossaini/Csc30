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

public class Stack3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack3 s3 = new Stack3();
		
		s3.push(16);
		s3.push(9);
		s3.push(51);
		System.out.println("Top of Stack3: " + s3.top());
		System.out.println("Items in Stack S2: "+ s3.size());
		
		System.out.println("Removing top item!");
		s3.pop();
		
		System.out.println("Top of Stack3: " + s3.top());
		System.out.println("Items in Stack S2: "+ s3.size());
		
		System.out.println("Adding a new item");
		s3.push("Crescent");
		
		System.out.println("Top of Stack3: " + s3.top());
		System.out.println("Items in Stack S2: "+ s3.size());
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