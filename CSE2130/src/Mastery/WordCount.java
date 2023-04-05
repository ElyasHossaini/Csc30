/*

Program: WordCount         Date: 4/3/2023

Purpose: An application that displays the number of words and the average word length in a
text file named source.txt. Consider a word to be any sequence of letters terminated by nonletters. 

Author: Elyas Hossaini
School: CHHS
Course: Computer Science 30
 

*/

package Mastery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class WordCount 
{   
	public static void main(String[] args) 
	{
		BufferedReader reader = null;
		
		//Initializing charCount, wordCount   0
		
		double charCount = 0;

		double wordCount = 0;
		
		
		try
		{
			//Creating BufferedReader object
			
			reader = new BufferedReader(new FileReader("..\\CSE2130\\src\\Mastery\\source.txt"));
			
			//Reading the first line into currentLine
			
			String currentLine = reader.readLine();
			
			while (currentLine != null)
			{
				
				
				//Getting number of words in currentLine
				
				String[] words = currentLine.split(" ");
				
				//Updating the wordCount
				
				wordCount = wordCount + words.length;
				
				//Iterating each word
				
				for (String word : words)
				{
					//Updating the charCount
					
					charCount = charCount + word.length();
				}
				
				//Reading next line into currentLine
				
				currentLine = reader.readLine();
			}
			
			//Printing charCount, wordCount and lineCount
			
			double averageWord = charCount/wordCount;
			
			System.out.println("Number Of Characters In A File : "+charCount + " characters.");
			
			System.out.println("Number Of Words In A File : "+wordCount + " words.");
			
			System.out.println("Average Word Length In A File is about "+ (Math.round(averageWord)) + " letters.");
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				reader.close();           //Closing the reader
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}	
	
	
}
/*
Number Of Characters In A File : 33.0 characters.
Number Of Words In A File : 7.0 words.
Average Word Length In A File is about 5 letters.
*/