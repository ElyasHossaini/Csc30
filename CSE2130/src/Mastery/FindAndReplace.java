/*

Program: FindAndReplace.java          Date: 4/5/2023

Purpose: An application that prompts the user for a file name, a search word or 
phrase, and a replacement word or phrase. After entering the replacement word or 
phrase, the code will find all occurrences of the word or phrase in the file and 
replaces them with the specified replacement word or phrase. 

Author: Elyas Hossaini 
School: CHHS
Course: Computer Programming 30
 
*/
package Mastery;

import java.io.*;
import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        
        System.out.println("Enter file directory, file name, and type of file:"); //prompts user for file directory, file name, and type of file.
        String file = input.nextLine();
        File dataFile = new File(file); 
        System.out.println("\nInput word(s) to replace:"); //prompts user to input word or phrase to replace.
        String oldString = input.nextLine();
        System.out.println("\nInput word(s) to replace the previous word:"); //word or phrase that will replace the original.
        String newString = input.nextLine();
        String oldContent = ""; 
        
        try {
            BufferedReader reader  = new BufferedReader(new FileReader(dataFile)); //writes data into file.
            String line = reader.readLine(); 
            while (line != null) { //"line" has a value, because it does not equal null.
                oldContent = oldContent + line + "  ";
                line = reader.readLine();
            }
            
            String newContent = oldContent.replaceAll(oldString, newString); //replaces the original word or phrase with the new word or phrase entered into the file. 
            FileWriter writer = new FileWriter(dataFile);
            writer.write(newContent);
            reader.close();
            writer.close();
        }
        
            catch (IOException e) {
                e.printStackTrace();
            }
        
    }
}
/*
Enter file directory, file name, and type of file:
C:\Users\105154006\git\cs30p2---sem2-Killer1023\CSE2130\src\Mastery\FandR.txt

Input word(s) to replace:
notepad

Input word(s) to replace the previous word:
.txtfile
*/