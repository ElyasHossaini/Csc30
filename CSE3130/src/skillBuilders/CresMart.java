package skillBuilders;

import java.text.NumberFormat;
import java.util.Scanner;

public class CresMart 
{

	public static void payEmployee(Employee emp, double payR)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		double pay;
		
		System.out.println(emp);
		
		pay = emp.pay(payR);
		
		System.out.println(money.format(pay));
	}
	
	public static void main(String[] args) 
	{
		Manager emp1 = new Manager("Bell", "Smith", 40000);
		Associate emp2 = new Associate("Bob", "Stuart", 17);
		
		Scanner userinput = new Scanner(System.in);
		
		String action;
		int empNum;
		double payArg;
		
		Employee emp = emp1;
		
		do
		{
			
		System.out.println("\n (E)mployee \\ (P)ay \\ (Q)uit ");
		System.out.println("Enter choice: ");
		action = userinput.next();
		
		if(!action.equalsIgnoreCase("Q"))
		{
			System.out.println("Enter employee number (1 or 2) : ");
			empNum = userinput.nextInt();
			
			switch(empNum)
			{
				case 1: emp = emp1; break;
				case 2: emp = emp2; break;
			}
			
			if(action.equalsIgnoreCase("E"))
			{
				System.out.println(emp);
			}
			else if(action.equalsIgnoreCase("P"))
			{
				System.out.println("Enter the hours for Associate OR pay period for manager");
				payArg = userinput.nextDouble();
				
				payEmployee(emp, payArg);
			}
		}
		}while(!action.equalsIgnoreCase("Q"));
		
	}

}
