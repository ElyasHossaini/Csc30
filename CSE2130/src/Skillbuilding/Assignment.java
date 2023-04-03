package Skillbuilding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File textFile = new File("..\\CSE2130\\src\\Skillbuilding\\Assign.txt");
		FileReader in;
		BufferedReader readFile;
		String lineofText;
		
		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			while ((lineofText = readFile.readLine()) != null) {
				System.out.println(lineofText);
			}
			readFile.close();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file");
			System.err.println("IOException: " + e.getMessage());
		}
	
	}

}
/*
Create a Assignment application that reads and then displays the contents of a file containing instructions for this assignment
*/