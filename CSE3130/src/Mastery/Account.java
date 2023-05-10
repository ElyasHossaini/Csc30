package Mastery;

/**
 * Account class.
 */
 //
import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
	public double balance;
	private Customer cust;
	private String acctID, city, street, province, postalCode;
	
		//
	/**
	 * constructor
	 * pre: none
	 * post: An account has been created. Balance and 
	 * customer data has been initialized with parameters.
	 */
	public Account(double bal, String fName, String lName, String ct, String st, String prov, String post)//include street, city, province or state, postal code or zip code
	 {
		balance = bal;
		cust = new Customer(fName, lName, ct, st, prov, post);//this constructor should reflect the new additions above, street, city, province, postal code
		acctID = fName.substring(0,1) + lName;
		city = ct;
		street = st;
		province = prov;
		postalCode = post;
	}
	

	/**
	 * constructor
	 * pre: none
	 * post: An empty account has been created with the specified account ID.
	 */
	public Account(String ID) {
		balance = 0;
		cust = new Customer("", "", "", "", "", "");
		acctID = ID;
	}

//
	/** 
	 * Returns the account ID.
	 * pre: none
	 * post: The account ID has been returned.
	 */
	public String getID() {
	 	return(acctID);
	}


	/** 
	 * Returns the current balance.
	 * pre: none
	 * post: The account balance has been returned.
	 */
	public double getBalance() {
	 	return(balance);
	}


	/** 
	 * A deposit is made to the account.
	 * pre: none
	 * post: The balance has been increased by the amount of the deposit.
	 */
	public double deposit(double amt) {
	 	balance += amt;
	 	return(balance);
	}

	
	/** 
	 * A withdrawal is made from the account if there is enough money.
	 * pre: none
	 * post: The balance has been decreased by the amount withdrawn.
	 */
	public double withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	 	return(balance);
	}
	/*
	 * A change in the street, city, province, or postal code has been made
	 * pre none
	 * post the street, city, province, or postal code has been changed
	 */

	public void changeAddress()
	{
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Change (s)treet, (c)ity, (p)rovince, (po)stal code");
		String change = userinput.next();
		
		if(change.equalsIgnoreCase("s"))
		{
			cust.changeStreet();
		}
		else if(change.equalsIgnoreCase("c"))
		{
			cust.changeCity();
		}
		else if(change.equalsIgnoreCase("p"))
		{
			cust.changeProvince();
		}
		else if(change.equalsIgnoreCase("po"))
		{
			cust.changePostalCode();
		}
	}


	//Create a changeAddress() method that calls the cust object from above in order to change
	//Street, city, province, postalCode




	
	
	/** 
	 * Returns a true when objects have matching account ids.
	 * pre: none
	 * post: true has been returned when the objects are equal,
	 * false returned otherwise.
	 */
	public boolean equals(Object acct) {
		Account testAcct = (Account)acct;
		if (acctID.equals(testAcct.acctID)) {
				return(true);
			} else {
				return(false);
			}
	}


	/** 
	 * Returns a String that represents the Account object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = acctID + "\n";
		accountString += cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);
	}
}

