package Mastery;

import java.util.Scanner;

/**
 * Customer class.
 */
//
public class Customer {
	private String firstName, lastName, street, province, postalCode, city;

	//create String variables street, city, province, postal code	

	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String ct, String st, String prov, String post)
	{
		firstName = fName;
		lastName = lName;
		city = ct;
		street = st;
		province = prov;
		postalCode = post;
	}
	/**
	 * 
	 * pre: none
	 * post: user has made a change in their city, and returns city.
	 */
	public String changeCity()
	{
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter new city: ");
		city = userinput.next();
		return(city);
	}
	/**
	 * 
	 * pre: none
	 * post: user has made a change in their street, and returns street.
	 */
	public String changeStreet()
	{
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter new street: ");
		street = userinput.next();
		return(street);
	}
	/**
	 * 
	 * pre: none
	 * post: user has made a change in their province and returns province.
	 */
	public String changeProvince()
	{
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter new Province: ");
		province = userinput.next();
		return(province);
	}
	/**
	 * 
	 * pre: none
	 * post: user has made a change in their postal code, and returns postal code.
	 */
	public String changePostalCode()
	{
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter new postal code: ");
		postalCode = userinput.next();
		return(postalCode);
	}

	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		//update this string so that it contains the street, city, province, and postal code
		custString = firstName + " " + lastName + " " + street + " " + city + " " + province + " " + postalCode + "\n" ;
	 	return(custString);
	}

}
