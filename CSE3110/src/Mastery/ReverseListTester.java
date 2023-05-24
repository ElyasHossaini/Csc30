/*

Program: ReverseList          Date: 5/20/2023

Purpose: create a reverselist application that uses a stack to reverse a set of integers entered by the user.  

Author: Elyas Hossaini 
School: CHHS
Course: Computer Programming 30
 
*/
package Mastery;

import java.util.*;

public class ReverseListTester {

    public static void main(String[] args) {
        ReverseList stack = new ReverseList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter up to 10 numbers (or enter 999 to terminate): ");

        int count = 0;
        while(count < 10) {
            int num = scanner.nextInt();

            if (num == 999) {
                break;
            }

            stack.push(num);
            count++;
        }

        System.out.println("The reversed list of numbers is: ");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        

    }
}
/*
Please enter up to 10 numbers (or enter 999 to terminate): 
1
2
3
4
5
6
7
8
66
34
The reversed list of numbers is: 
34
66
8
7
6
5
4
3
2
1
*/





