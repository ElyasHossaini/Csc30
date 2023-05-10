package Mastery;

/*
 * Program: AccountTester.java
 * Last Date of this Revision: May 1, 2023
 * 
 * Purpose: Create a personal Account and Business Account classes that inherit the Account class presented in Chapter 7.
 * Introduce minimum balances where money will be withdrawn if the accounts are below that requirement.
 * 
 * Author: Your Name, Elyas Hossaini
 * School: CHHS
 * Course: Computer Programming 30
 */

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {

		// Create new Personal/Business accounts and provide parameters
		PersonalAcct acc1 = new PersonalAcct(1, "joe", "philips", "calgary", "panarama", "alberta", "k915t6");

		BussinessAcct acc2 = new BussinessAcct(400, "building", "corporation", "nashville", "St road", "USA", "61fki9");

		Scanner userInput = new Scanner(System.in);

		String action;
		double amt;
		int accNumber;

		Account account = acc1;

		do {
			// Present choices to the user
			System.out.println("\n (A)ccount \\ (C)hange address \\ (W)ithdraw \\ (D)eposit \\ (Q)uit ");
			System.out.println("Enter choice: ");
			action = userInput.next();

			// The do-while loop continues as long as 'Q' or 'Quit' is not inputted by the user
			if (!action.equalsIgnoreCase("Q")) {
				System.out.println("Enter Account number (1 or 2): ");
				accNumber = userInput.nextInt();

				// Select the account based on the user's input
				switch (accNumber) {
					case 1:
						account = acc1;
						break;
					case 2:
						account = acc2;
						break;
				}

				// User chooses account
				if (action.equalsIgnoreCase("A")) {
					System.out.println(account);
					
					if (account == acc1) {
						acc1.minBal();
					} else {
						acc2.minBal();
					}
				}
				// User chooses to change part of their address
				else if (action.equalsIgnoreCase("C")) {
					System.out.println(account);
					account.changeAddress();
					System.out.println(account);
				}
				// User chooses to withdraw from the account
				else if (action.equalsIgnoreCase("W")) {
					System.out.println(account);
					System.out.println("How much would you like to withdraw?");
					amt = userInput.nextDouble();
					account.withdrawal(amt);
					System.out.println("New balance: " + account.getBalance());
				}
				// User chooses to deposit into the account
				else if (action.equalsIgnoreCase("D")) {
					System.out.println(account);
					System.out.println("How much would you like to deposit?");
					amt = userInput.nextDouble();
					account.deposit(amt);
					System.out.println("New balance: " + account.getBalance());
				}
			}
			// The loop continues if 'Q' or 'Quit' is not inputted
		} while (!action.equalsIgnoreCase("Q"));

		userInput.close();
	}
}
/*

 (A)ccount \ (C)hange address \ (W)ithdraw \ (D)eposit \ (Q)uit 
Enter choice: 
a
Enter Account number (1, or 2) : 
2
bcorporation
building corporation St road nashville USA 61fki9
Current balance is $400.00
10 dollars is removed from your account. For being below $500
New balance: 390.0

 (A)ccount \ (C)hange address \ (W)ithdraw \ (D)eposit \ (Q)uit 
Enter choice: 
c
Enter Account number (1, or 2) : 
2
bcorporation
building corporation St road nashville USA 61fki9
Current balance is $390.00
Change (s)treet, (c)ity, (p)rovince, (po)stal code
s
Please enter new street: 
lol street
bcorporation
building corporation lol nashville USA 61fki9
Current balance is $390.00

 (A)ccount \ (C)hange address \ (W)ithdraw \ (D)eposit \ (Q)uit 
Enter choice: 
w
Enter Account number (1, or 2) : 
2
bcorporation
building corporation lol nashville USA 61fki9
Current balance is $390.00
How much would you like to withdraw?
12
New balance: 378.0

 (A)ccount \ (C)hange address \ (W)ithdraw \ (D)eposit \ (Q)uit 
Enter choice: 
d
Enter Account number (1, or 2) : 
2
bcorporation
building corporation lol nashville USA 61fki9
Current balance is $378.00
How much would you like to deposit?
34
New balance: 412.0

 (A)ccount \ (C)hange address \ (W)ithdraw \ (D)eposit \ (Q)uit 
Enter choice: 
q
*/