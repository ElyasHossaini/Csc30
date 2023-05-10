/*

Program: UEmployee.java          Last Date of this Revision: April 20, 2023

Purpose: create a UEmployee class that contains member variables for the university employee name and salary.
The Uemployee class should contain memeber methods for returning the employee name and salary.
Create faculty and staff classes that inherit the UEmployee class. the faculty class should include
memebrs for storing and returning the department name. the staff class should include members for storing and returning the job title.

Author: Your Name, Elyas Hossaini	
School: CHHS
Course: Computer Programming 30
 

*/package Mastery;

public abstract class UEmployee {
	
	String firstName, lastName;
	double salary, yearlySalary;

	
	//stores the first, last name, faculty, job 
	public UEmployee(String fN, String lN, double salary)
	{
		firstName = fN;
		lastName = lN;
		yearlySalary = salary;
	}
	
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = (yearlySalary/52)*weeks;
		return payEarned;
	}
	//a new salary amount has been inputed
	public void setYearlySalary(double salary)
	{
		yearlySalary = salary;
	}
	//creates getSalary class
	public double getYearlySalary()
	{
		return yearlySalary;
	}

	public String toString()
	{
		return(firstName + " " + lastName + ", pay: " + getYearlySalary());
	}
}
/* screen dump
(E)mployee \ (P)ay \ (Q)uit 
Enter choice: 
E
Enter employee number (1, 2, or 3) : 
2
Jannet Smith, pay: 70000.0, Staff member, occupation: teacher

 (E)mployee \ (P)ay \ (Q)uit 
Enter choice: 
P
Enter employee number (1, 2, or 3) : 
1
Enter the weeks worked for the employee.
50
Josh Richards, pay: 60000.0, Staff member, occupation: assistant teacher
$57,692.31

 (E)mployee \ (P)ay \ (Q)uit 
Enter choice: 


*/