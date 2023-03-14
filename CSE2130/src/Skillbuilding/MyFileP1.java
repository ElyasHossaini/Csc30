/*
Program:.java          Last Date of this Revision: March 6, 2023


Purpose:Create a MyFile application that prompts the user for the name of a file and then displays a message that indicates whether the files exists or not.


Author: Elyas Hossaini
School: CHHS
Course: Computer Programming 30
*/
package Skillbuilding;

import java.io.File;
import java.util.Scanner;

public class MyFileP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is the name of your file?");
		
		Scanner input = new Scanner(System.in);
		
		String textfile = input.nextLine();
		
		File textFile = new File(textfile);
		if (textFile.exists())
		{
			System.out.println("Your file exists");
		}
		else
		{
			System.out.println("Your file does not exist");
		}

	}

}
/* Screen Dump

What is the name of your file?
C:\Users\105154006\Downloads\ksi.jfif
Your file exists

What is the name of your file?
ksi.jfif
Your file does not exist


 */
