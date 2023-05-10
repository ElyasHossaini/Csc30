package Mastery;

public class Staff extends UEmployee
{
	String job;
	
	public Staff(String fN, String lN, double salary, String J)
	{
		super(fN, lN, salary);
		job = J;
	}
	public String job(String J)
	{
		return(job);
	}

	public String toString()
	{
		return(super.toString() + ", Staff member, occupation: " + job);
	}
	
}
