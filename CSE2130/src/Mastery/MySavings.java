/*

Program: MySavings         Date: 4/10/2023

Purpose: Modify the MySavings application from chapter 7 to store and load the piggybank object from a file.

Author: Elyas Hossaini
School: CHHS
Course: Computer Science 30
 

*/
package Mastery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MySavings {
			
			private static final DecimalFormat df = new DecimalFormat("0.00");
			
			
		    public static void main(String[] args) {
		    	
		    	// Create four Scanner objects to receive input from the user
		    	Scanner user = new Scanner(System.in);
		    	Scanner user2 = new Scanner(System.in);
		    	Scanner user3 = new Scanner(System.in);
		    	Scanner user4 = new Scanner(System.in);
		    	
		    	String read, strDouble;
		    	
		    	// Create two FileReader objects in and readFile
		    	FileReader in;
		    	BufferedReader readFile;
		    	
		    	// Create two FileWriter objects out and writeFile
		    	FileWriter out;
		    	BufferedWriter writeFile;
		    	
		    	// Declare variables including String read, String strDouble, int i, and double initialTotal, remove, and finalTotal
		    	int i, x;
		    	double initialTotal, remove, finalTotal;
		    	
		    	// Use the try-catch block to handle potential exceptions including FileNotFoundException and IOException
		    	try {
			    	// Ask user to enter bank file directory and store it in fileName variable
		    		System.out.println("Enter bank file directory: ");
		    		
		    		String fileName = user.next();
		    		
		    		// Create a File object using the fileName provided by the user
		    		File textFile = new File(fileName);

		    		// Create FileReader and BufferedReader objects and read the first line of the file
		    		in = new FileReader(textFile);
		    		readFile = new BufferedReader(in);
		    		read = readFile.readLine();

		    		// Convert the initial total to a double using parseDouble method
		    		initialTotal = Double.parseDouble(read);

		    		// Store initial total in a variable called change
		    		double change = initialTotal;

		    		// Format initialTotal and display it to the user
		    		String formatted = df.format(initialTotal);
		    		System.out.println("File contents: \n" + "Bank account total: " + formatted);

		    		// Create a loop that allows user to add coins, view total and withdraw money, or exit the bank
		    		x = 1;
		    		for(i = 0; i < x; i++) {
		    			System.out.println(" \n1. To Add a penny \n2. Add a nickel \n3. Add a dime \n4. Add a quarter \n5. View Total and take money out \n6. Exit bank");
		    			
		    			// Receive user's input and execute the corresponding code
		    			int input = user3.nextInt();
		    			
		    			if(input == 1) {
		    				change += 0.01;
		    				x += 1;
		    				System.out.println(df.format(change));
		    			}
		    			else if(input == 2) {
		    				change += 0.05;
		    				x +=1;
		    				System.out.println(df.format(change));
		    			}
		    			else if(input == 3) {
		    				change += 0.1;
		    				x += 1;
		    				System.out.println(df.format(change));
		    			}
		    			else if(input == 4) {
		    				change += 0.25;
		    				x += 1;
		    				System.out.println(df.format(change));
		    			}
		    			else if (input == 5) {
		    				// Display current total and prompt user for the amount to withdraw
		    				System.out.println("Total right now: " + (df.format(change)));
		    				System.out.println("How much money would you like to withdraw?");
		    				remove = user4.nextDouble();
		    				
		    				// Subtract the amount to withdraw from change and display new total
		    				change = change - remove;
		    				System.out.println("Your new total: " + df.format(change));
		    				x += 1;
		    			}
		    			else if(input == 6) {
		    				// Exit the loop and display farewell message
		    				x = 0;
		    				System.out.println("Have a nice day!");
		    			}
		    		}

		    		// Store the final total in a variable called finalTotal
		    		finalTotal = change;

		    		// Format finalTotal and replace initialTotal in the read string with finalTotal
		    		String Final = df.format(finalTotal);
		    		String initial = Double.toString(initialTotal);
		    		String fileContents = read.replace(initial, Final);

		    		// Write the updated file contents to the file and display the new account total to the user
		    		out = new FileWriter(textFile);
		    		writeFile = new BufferedWriter(out);
		    		writeFile.write(fileContents);
		    		System.out.println("New account total: \n" + fileContents);
		    		
		    		
		    		//close everything
		    		readFile.close();
		    		in.close();
		    		writeFile.close();
		    		out.close();
		    		
		    		
		    	//error checker
		    	}catch(FileNotFoundException e)
				{
					System.out.println("File does not exist or could not be found. ");
					System.err.print("FileNotFoundexception: " + e.getMessage());
				}
				catch(IOException e)
				{
					System.out.println("Problem reading file. ");
					System.err.print("IOException: " + e.getMessage());
				 }
		    	
		 
	
		    }

}
/*
Enter bank file directory: 
C:\Users\elyas\git\cs30p2---sem2-Killer1023\CSE2130\src\Mastery\PiggyBank.txt
File contents: 
Bank account total: 34.45
 
1. To Add a penny 
2. Add a nickel 
3. Add a dime 
4. Add a quarter 
5. View Total and take money out 
6. Exit bank
1
34.46
 
1. To Add a penny 
2. Add a nickel 
3. Add a dime 
4. Add a quarter 
5. View Total and take money out 
6. Exit bank
2
34.51
 
1. To Add a penny 
2. Add a nickel 
3. Add a dime 
4. Add a quarter 
5. View Total and take money out 
6. Exit bank
3
34.61
 
1. To Add a penny 
2. Add a nickel 
3. Add a dime 
4. Add a quarter 
5. View Total and take money out 
6. Exit bank
4
34.86
 
1. To Add a penny 
2. Add a nickel 
3. Add a dime 
4. Add a quarter 
5. View Total and take money out 
6. Exit bank
5
Total right now: 34.86
How much money would you like to withdraw?
12.23
Your new total: 22.63
 
1. To Add a penny 
2. Add a nickel 
3. Add a dime 
4. Add a quarter 
5. View Total and take money out 
6. Exit bank
6
Have a nice day!
New account total: 
22.63
*/