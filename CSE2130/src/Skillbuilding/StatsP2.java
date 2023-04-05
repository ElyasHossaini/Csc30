package Skillbuilding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;


public class StatsP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat nf = NumberFormat.getPercentInstance();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the file to create: ");
		String fileName = input.nextLine();

		System.out.print("Enter the number of student grades: ");
		int numGrades = input.nextInt();
		input.nextLine(); // consume newline character

		File dataFile = new File(fileName);
		FileWriter out;
		BufferedWriter writeFile;

		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;
		double numScores = 0;

		try
		{
		    out = new FileWriter(dataFile);
		    writeFile = new BufferedWriter(out);

		    for (int i = 1; i <= numGrades; i++) {
		        System.out.print("Enter the student name: ");
		        String stuName = input.nextLine();

		        System.out.print("Enter the student's score: ");
		        String score = input.nextLine();
		        double scoreValue = Double.parseDouble(score);

		        writeFile.write(stuName);
		        writeFile.newLine();
		        writeFile.write(score);
		        writeFile.newLine();

		        numScores += 1;

		        totalScores += scoreValue;

		        if(scoreValue < lowScore)//Check for low score
		        {
		            lowScore = scoreValue;                    
		        }
		        if(scoreValue > highScore)//Check for high score
		        {
		            highScore = scoreValue;
		        }            
		    }

		    writeFile.close();
		    out.close();

		    FileReader in = new FileReader(dataFile);
		    BufferedReader readFile = new BufferedReader(in);

		    String stuName;
		    String score;

		    while((stuName = readFile.readLine()) != null)
		    {
		        score = readFile.readLine();
		        System.out.println(stuName + " " + score);

		    }//end while

		    avgScore = totalScores / numScores;
		    System.out.println("Low score = "+ nf.format(lowScore/100));
		    System.out.println("High score = "+ nf.format(highScore/100));
		    System.out.println("Average score = "+ nf.format(avgScore/100));

		    readFile.close();
		    in.close();



		}
		catch(IOException e)
		{
		    System.out.println("Problem with file I/O. ");
		    System.err.print("IOException: " + e.getMessage());
		}
		catch(NumberFormatException e)
		{
		    System.out.println("Invalid input. ");
		    System.err.print("NumberFormatException: " + e.getMessage());
		}

	}

}
/*
Enter the name of the file to create: TheGradeList
Enter the number of student grades: 3
Enter the student name: elyas
Enter the student's score: 87
Enter the student name: nolan
Enter the student's score: 99
Enter the student name: Manav
Enter the student's score: 81
elyas 87
nolan 99
Manav 81
Low score = 81%
High score = 99%
Average score = 89%
*/