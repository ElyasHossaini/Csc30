package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

import skillBuilders.Associate;
import skillBuilders.Employee;
import skillBuilders.Manager;

public class University {

	public static void payUEmployee(UEmployee employ, double payReturn)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		double pay;
		
		System.out.println(employ);
		
		pay = employ.pay(payReturn);
		
		System.out.println(money.format(pay));
	}
	
	public static void main(String[] args) {
		
		Staff s1 = new Staff("Josh", "Richards", 60000, "assistant teacher");
		Staff s2 = new Staff("Jannet", "Smith", 70000, "teacher");
		Faculty s3 = new Faculty("joe", "goldberg", 45000, "arts");
		
		Scanner userinput = new Scanner(System.in);
		
		String action;
		int empNumber;
		double payArg;

		UEmployee employ = s1;
		
		do
		{
			
		System.out.println("\n (E)mployee \\ (P)ay \\ (Q)uit ");
		System.out.println("Enter choice: ");
		action = userinput.next();
		
		if(!action.equalsIgnoreCase("Q"))
		{
			System.out.println("Enter employee number (1, 2, or 3) : ");
			empNumber = userinput.nextInt();
			
			switch(empNumber)
			{
				case 1: employ = s1; break;
				case 2: employ = s2; break;
				case 3: employ = s3; break;
			}
			
			if(action.equalsIgnoreCase("E"))
			{
				System.out.println(employ);
			}
			else if(action.equalsIgnoreCase("P"))
			{
				System.out.println("Enter the weeks worked for the employee.");
				payArg = userinput.nextDouble();
				
				payUEmployee(employ, payArg);
			}
		}
		}while(!action.equalsIgnoreCase("Q"));
		

	}

}
