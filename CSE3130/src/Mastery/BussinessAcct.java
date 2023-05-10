package Mastery;

public class BussinessAcct extends Account
{

	public BussinessAcct(double bal, String fName, String lName, String ct, String st, String prov, String post)
	{
		
		super(bal, fName, lName, ct, st, prov, post);
		
	}
	
	/*
	 * returns a 10 dollar deduction from account
	 * pre: none
	 * post: 10 dollar deduction from account for being below 500$, and returns balance
	 * 
	 */
	
	public double minBal()
	{	
			if(balance <= 500)
			{
				System.out.println("10 dollars is removed from your account. For being below $500");
				balance -= 10;
			
				System.out.println("New balance: " + balance);
				
				if(balance < 10)
				{
					System.out.println("You are in debt!");
				}
				
			}
			
		return(balance);
	}
}
/* screen dump

 (A)ccount \ (C)hange address \ (W)ithdraw \ (D)eposit \ (Q)uit 
Enter choice: 
A
Enter Account number (1, or 2) : 
2
bcorporation
building corporation St road nashville USA 61fki9
Current balance is $400.00
10 dollars is removed from your account. For being below $500
New balance: 390.0

*/