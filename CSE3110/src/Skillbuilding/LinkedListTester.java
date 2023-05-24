/*
 * Program: LinkedList.java
 * Last Date of this Revision: May 12, 2023
 * 
 * Purpose: Modify the LinkedList class to include a member function size() that returns the number of items in the
list. Modify the LinkedList class to include a member function addAtEnd() that adds a new item to the end of
the linked list. Modify the LinkedList class to include a member function makeEmpty() that removes all the items in the
list
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

		list.addAtFront("Elyas"); // Add "Elyas" to the front of the list
		list.addAtFront("Nolan"); // Add "Nolan" to the front of the list
		list.addAtFront("Manav"); // Add "Manav" to the front of the list
		list.addAtFront("Mohammad"); // Add "Mohammad" to the front of the list
		list.addAtFront("Adam"); // Add "Adam" to the front of the list

		System.out.println("List has " + list.size() + " elements");

		System.out.println(list); // Print the list

		list.remove("Manav"); // Remove the element "Manav" from the list

		System.out.println("List has " + list.size() + " elements");

		System.out.println(list); // Print the updated list

		list.addAtEnd("Mr. Abdalla"); // Add "Mr. Abdalla" to the end of the list

		System.out.println("List has " + list.size() + " elements");

		System.out.println(list); // Print the updated list

		list.makeEmpty(null); // Empty the list

		System.out.println("List has " + list.size() + " elements");

		System.out.println(list); // Print the empty list
		
		
		

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