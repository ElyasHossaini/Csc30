/*

Program: UEmployee.java          Last Date of this Revision: April 20, 2023

Purpose: create a UEmployee class that contains member variables for the university employee name and salary.
The Uemployee class should contain memeber methods for returning the employee name and salary.
Create faculty and staff classes that inherit the UEmployee class. the faculty class should include
memebrs for storing and returning the department name. the staff class should include members for storing and returning the job title.

Author: Your Name, Elyas Hossaini	
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

import skillBuilders.Associate;
import skillBuilders.Employee;
import skillBuilders.Manager;

public class University {

	/**
	 * Calculate and print the payment for a UEmployee.
	 * 
	 * @param employ    The UEmployee object.
	 * @param payReturn The number of weeks worked.
	 */
	public static void payUEmployee(UEmployee employ, double payReturn) {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double pay;
		
		System.out.println(employ); // Print the details of the employee
		pay = employ.pay(payReturn); // Calculate the payment for the specified number of weeks
		System.out.println(money.format(pay)); // Print the payment in a formatted manner
	}
	
	public static void main(String[] args) {
		Staff s1 = new Staff("Josh", "Richards", 60000, "assistant teacher");
		Staff s2 = new Staff("Jannet", "Smith", 70000, "teacher");
		Faculty s3 = new Faculty("joe", "goldberg", 45000, "arts");
		
		Scanner userInput = new Scanner(System.in);
		
		String action;
		int empNumber;
		double payArg;

		UEmployee employ = s1;
		
		do {
			System.out.println("\n (E)mployee \\ (P)ay \\ (Q)uit ");
			System.out.println("Enter choice: ");
			action = userInput.next();
			
			if (!action.equalsIgnoreCase("Q")) {
				System.out.println("Enter employee number (1, 2, or 3) : ");
				empNumber = userInput.nextInt();
				
				switch (empNumber) {
					case 1:
						employ = s1; // Set the selected employee as s1
						break;
					case 2:
						employ = s2; // Set the selected employee as s2
						break;
					case 3:
						employ = s3; // Set the selected employee as s3
						break;
				}
				
				if (action.equalsIgnoreCase("E")) {
					System.out.println(employ); // Print the details of the selected employee
				} else if (action.equalsIgnoreCase("P")) {
					System.out.println("Enter the weeks worked for the employee.");
					payArg = userInput.nextDouble();
					
					payUEmployee(employ, payArg); // Invoke the method to calculate and print the payment for the selected employee
				}
			}
		} while (!action.equalsIgnoreCase("Q"));
		
		userInput.close();
	}

}
/* screen dump
(E)mployee \ (P)ay \ (Q)uit 
Enter choice: 
E
Enter employee number (1, 2, or 3) : 
2
Jannet Smith, pay: 70000.0, Staff member, occupation: teacher

 (E)mployee \ (P)ay \ (Q)uit 
Enter choice: 
P
Enter employee number (1, 2, or 3) : 
1
Enter the weeks worked for the employee.
50
Josh Richards, pay: 60000.0, Staff member, occupation: assistant teacher
$57,692.31

 (E)mployee \ (P)ay \ (Q)uit 
Enter choice: 


*/