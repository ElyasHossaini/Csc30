package Mastery;

public class PersonalAcct extends Account
{

	
	public PersonalAcct(double bal, String fName, String lName, String ct, String st, String prov, String post)
	{
		super(bal, fName, lName, ct, st, prov, post);
		
	}
	/*
	 * returns a 2 dollar deduction from account
	 * pre: none
	 * post: 2 dollar deduction from account for being below 100$, and returns balance
	 * 
	 */
	public double minBal()
	{	
		
			if(balance < 100)
			{
				System.out.println("2 dollars is removed from your account. For being below $100");

				balance -= 2;
				
				System.out.println("New Balance: " + balance);
				
				if(balance < 0)
				{
					System.out.println("You are in debt!");
				}
			}
			return(balance);
	}
	
}
/* screen dump
 jphilips
joe philips panarama calgary alberta k915t6
Current balance is $1.00
2 dollars is removed from your account. For being below $100
New Balance: -1.0
You are in debt!



*/