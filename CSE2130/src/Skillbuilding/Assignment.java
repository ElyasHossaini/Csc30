/*

Program: Assignment         Date: 3/15/2023

Purpose: Create a Assignment application that reads and then displays the contents of a file containing instruction for this assignment.

Author: Elyas Hossaini
School: CHHS
Course: Computer Science 30
 

*/
package Skillbuilding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a new File object and passing the path of the file "Assign.txt"
		File textFile = new File("..\\CSE2130\\src\\Skillbuilding\\Assign.txt");

		// Creating a FileReader object to read the textFile
		FileReader in;

		// Creating a BufferedReader object to read the textFile line by line
		BufferedReader readFile;

		// Declaring a String variable to store the line of text
		String lineofText;

		try {
		    // Initializing the FileReader object with the textFile object
		    in = new FileReader(textFile);

		    // Initializing the BufferedReader object with the FileReader object
		    readFile = new BufferedReader(in);

		    // Reading the textFile line by line until the end of the file is reached
		    while ((lineofText = readFile.readLine()) != null) {

		        // Printing each line of text to the console
		        System.out.println(lineofText);
		    }

		    // Closing the BufferedReader object to free up system resources
		    readFile.close();

		    // Closing the FileReader object to free up system resources
		    in.close();
		} catch (FileNotFoundException e) {

		    // Catching the FileNotFoundException and displaying a relevant error message to the console
		    System.out.println("File does not exist or could not be found");

		    // Printing the exception message to the console for debugging purposes
		    System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {

		    // Catching the IOException and displaying a relevant error message to the console
		    System.out.println("Problem reading file");

		    // Printing the exception message to the console for debugging purposes
		    System.err.println("IOException: " + e.getMessage());
		}
	
	}

}
/*
Create a Assignment application that reads and then displays the contents of a file containing instructions for this assignment
*/