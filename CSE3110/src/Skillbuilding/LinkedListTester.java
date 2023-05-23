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

public class LinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.addAtFront("Elyas");
		list.addAtFront("Nolan");
		list.addAtFront("Manav");
		list.addAtFront("Mohammad");
		list.addAtFront("Adam");
		
		System.out.println("List has " + list.size() + "");
		
		System.out.println(list);
		
		list.remove("Manav");
		
		System.out.println("List has " + list.size() + "");
		
		System.out.println(list);
		
		list.addAtEnd("Mr. Abdalla");
		
		System.out.println("List has " + list.size() + "");
		
		System.out.println(list);
		
		list.makeEmpty(null);
		
		System.out.println("List has " + list.size() + "");
		
		System.out.println(list);
		
		
		

	}

}
/*
List has 5
Adam
Mohammad
Manav
Nolan
Elyas

List has 4
Adam
Mohammad
Nolan
Elyas

List has 5
Adam
Mohammad
Nolan
Elyas
Mr. Abdalla

List has 0
There are no items in list.
*/