/*
Program:.java          Last Date of this Revision: March 6, 2023


Purpose:Create a MyFile application that creates a file named zzz.txt and then displays a message indicating that the file has been created.


Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 30
*/
package Skillbuilding;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFileP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        
	        // Prompt user that the program will create a file
	        System.out.println("The program will now begin to create the file: zzz.txt");
	        
	        // Create a File object for the file we want to create
	        File textfile = new File("c:\\zzz.txt");
	        
	        // Check if the file already exists
	        if (textfile.exists()) {
	            System.out.println("Your file exists");
	        } else {
	            // If the file does not exist, create it
	            try {
	                textfile.createNewFile();
	                System.out.println("Your file has been successfully created");
	            } catch (IOException e) {
	                System.out.println("File could not be created");
	                System.err.println("IOException: " + e.getMessage());
	            }
	        }
	        
	        // Ask the user if they want to keep or delete the file
	        System.out.println("Would you like to keep or delete the file? Input k for keep or d for delete");
	        
	        String kd = input.nextLine();
	        
	        // If user enters 'k', keep the file. Otherwise, delete it.
	        if (kd.equals("k")) {
	            System.out.println("Your file is kept");
	        } else {
	            textfile.delete();
	            System.out.println("Your file has been deleted");
	        }

	}

}
/*
The program will now begin to create the file: zzz.txt
Your file has been successfully created
Would you like to keep or delete the file? Input k for keep or d for delete
k
Your file is kept

The program will now begin to create the file: zzz.txt
Your file has been successfully created
Would you like to keep or delete the file? Input k for keep or d for delete
d
Your file has been deleted
*/