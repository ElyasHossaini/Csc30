package Mastery;

public class Faculty extends UEmployee 
{

	String faculty;
	
	public Faculty(String fN, String lN, double salary, String F)
	{
		super(fN, lN, salary);
		faculty = F;
		
	}
	
	public String faculty(String F)
	{
		return(faculty);
	}
	
	
	
	public String toString()
	{
		return("Faculty memeber: " + super.toString() + " , apart of: " + faculty + " faculty");
	}
}
