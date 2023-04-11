/*

Program: StatsP1         Date: 3/23/2023

Purpose: Create a stats application that reads the names and scores from a data file named test1.dat, supplied with this text. 

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
import java.text.NumberFormat;

public class StatsP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat nf = NumberFormat.getPercentInstance(); // create an instance of NumberFormat to format numbers as percentages

		File dataFile = new File("..\\CSE2130\\src\\Skillbuilding\\test1.txt"); // create a new File object with the path to the data file
		FileReader in; // declare a new FileReader object

		BufferedReader readFile; // declare a new BufferedReader object to read from the file

		String stuName, score; // declare variables to hold student names and scores
		double scoreValue; // declare a variable to hold the numeric value of the score

		double lowScore = 100; // initialize the low score to the maximum possible value
		double highScore = 0; // initialize the high score to 0
		double avgScore; // declare a variable to hold the average score
		double totalScores = 0; // initialize the total score to 0
		double numScores = 0; // initialize the number of scores to 0

		try
		{
			in = new FileReader(dataFile); // create a new FileReader object for the data file
			readFile = new BufferedReader(in); // create a new BufferedReader object to read from the file

			while((stuName = readFile.readLine()) != null) // loop through the file, reading each student name and score
			{
				score = readFile.readLine(); // read the score from the file
				System.out.println(stuName + " " + score); // print the student name and score to the console

				numScores += 1; // increment the number of scores

				scoreValue = Double.parseDouble(score); // parse the score as a double
				totalScores += scoreValue; // add the score to the total

				if(scoreValue < lowScore) // check if the score is lower than the current low score
				{
					lowScore = scoreValue; // if so, update the low score
				}
				if(scoreValue > highScore) // check if the score is higher than the current high score
				{
					highScore = scoreValue; // if so, update the high score
				}			

			}//end while
			
			avgScore = totalScores / numScores; // calculate the average score
			System.out.println("Low score = "+ nf.format(lowScore/100)); // print the low score formatted as a percentage
			System.out.println("High score = "+ nf.format(highScore/100)); // print the high score formatted as a percentage
			System.out.println("Average score = "+ nf.format(avgScore/100)); // print the average score formatted as a percentage
			
			readFile.close(); // close the BufferedReader
			in.close(); // close the FileReader
			
		}
		catch(FileNotFoundException e) // catch a FileNotFoundException if the file doesn't exist
		{
			System.out.println("File does not exist or could not be found. ");
			System.err.print("FileNotFoundexception: " + e.getMessage());
		}
		catch(IOException e) // catch an IOException if there's a problem reading the file
		{
			System.out.println("Problem reading file. ");
			System.err.print("IOException: " + e.getMessage());
		} 
		
		

	}

}
/*
AAA 89
BBB 65
CCC 73
DDD 53
Low score = 53%
High score = 89%
Average score = 70%
*/