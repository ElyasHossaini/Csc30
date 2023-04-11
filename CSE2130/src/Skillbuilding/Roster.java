/*

Program: Roster         Date: 4/1/2023

Purpose: Create a roster application that prompts the user for the name of the file to store student names and then prompts the user for the number of
students in the class.

Author: Elyas Hossaini
School: CHHS
Course: Computer Science 30
 

*/
package Skillbuilding;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Prompt user for file name to store student names
		System.out.print("Enter the name of the file to store student names: ");
		String fileName = scanner.nextLine();

		// Prompt user for number of students
		System.out.print("Enter the number of students in the class: ");
		int numStudents = scanner.nextInt();
		scanner.nextLine(); // Consume the remaining newline character

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
		    // Loop through each student and prompt user for their first and last name
		    for (int i = 0; i < numStudents; i++) {
		        System.out.printf("Enter the first and last name of student %d: ", i + 1);
		        String firstName = scanner.next();
		        String lastName = scanner.next();
		        scanner.nextLine(); // Consume the remaining newline character

		        // Create a new StuName object and write it to the file
		        StuName student = new StuName(firstName, lastName);
		        writer.write(student.toString());
		        writer.newLine();
		    }
		} catch (IOException e) {
		    System.out.println("Error writing to file: " + e.getMessage());
		}

		// Display the class roster by reading from the file
		System.out.println("Class Roster:");
		try (Scanner fileScanner = new Scanner(new java.io.File(fileName))) {
		    while (fileScanner.hasNextLine()) {
		        System.out.println(fileScanner.nextLine());
		    }
		} catch (IOException e) {
		    System.out.println("Error reading from file: " + e.getMessage());
		}
	    }

	}
/*
Enter the name of the file to store student names: NameofStudents
Enter the number of students in the class: 4
Enter the first and last name of student 1: Elyas Hossaini
Enter the first and last name of student 2: Nolan Ferguson
Enter the first and last name of student 3: Manav Pandaya
Enter the first and last name of student 4: Mohammed Bilz
Class Roster:
Elyas Hossaini
Nolan Ferguson
Manav Pandaya
Mohammed Bilz
*/

