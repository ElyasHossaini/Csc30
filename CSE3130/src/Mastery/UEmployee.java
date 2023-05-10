package Mastery;

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
