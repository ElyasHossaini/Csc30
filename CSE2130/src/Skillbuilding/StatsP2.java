/*

Program: StatsP2         Date: 3/25/2023

Purpose: Modify the stats application to allow the  user to enter the names and grades of the students.

Author: Elyas Hossaini
School: CHHS
Course: Computer Science 30
 

*/
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
		// Create a NumberFormat object to format the output as percentages
        NumberFormat nf = NumberFormat.getPercentInstance();

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the name of the file to create
        System.out.print("Enter the name of the file to create: ");
        String fileName = input.nextLine();

        // Ask the user to enter the number of student grades to input
        System.out.print("Enter the number of student grades: ");
        int numGrades = input.nextInt();

        // Consume the newline character left by nextInt()
        input.nextLine();

        // Create a File object to represent the data file
        File dataFile = new File(fileName);

        // Create objects to write to the data file
        FileWriter out;
        BufferedWriter writeFile;

        // Initialize variables to track statistics on the grades
        double lowScore = 100;
        double highScore = 0;
        double avgScore;
        double totalScores = 0;
        double numScores = 0;

        try {
            // Create objects to write to the data file
            out = new FileWriter(dataFile);
            writeFile = new BufferedWriter(out);

            // Loop through each student and prompt the user for their name and grade
            for (int i = 1; i <= numGrades; i++) {
                System.out.print("Enter the student name: ");
                String stuName = input.nextLine();

                System.out.print("Enter the student's score: ");
                String score = input.nextLine();
                double scoreValue = Double.parseDouble(score);

                // Write the student name and grade to the data file
                writeFile.write(stuName);
                writeFile.newLine();
                writeFile.write(score);
                writeFile.newLine();

                // Update the statistics on the grades
                numScores += 1;
                totalScores += scoreValue;
                if(scoreValue < lowScore) {
                    lowScore = scoreValue;
                }
                if(scoreValue > highScore) {
                    highScore = scoreValue;
                }
            }

            // Close the output file
            writeFile.close();
            out.close();

            // Open the file for reading
            FileReader in = new FileReader(dataFile);
            BufferedReader readFile = new BufferedReader(in);

            // Read each student's name and grade from the file and print them to the console
            String stuName;
            String score;
            while((stuName = readFile.readLine()) != null) {
                score = readFile.readLine();
                System.out.println(stuName + " " + score);
            }

            // Calculate the average score and print the statistics to the console
            avgScore = totalScores / numScores;
            System.out.println("Low score = "+ nf.format(lowScore/100));
            System.out.println("High score = "+ nf.format(highScore/100));
            System.out.println("Average score = "+ nf.format(avgScore/100));

            // Close the input file
            readFile.close();
            in.close();
        } catch(IOException e) {
            System.out.println("Problem with file I/O. ");
            System.err.print("IOException: " + e.getMessage());
        } catch(NumberFormatException e) {
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