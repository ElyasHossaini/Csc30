package Skillbuilding;

public class RectangleP4 implements CompareTo 
{
	private double length, width;
	
	public RectangleP4() //Constructor
	{
		length = 1;
		width = 1;
	}
	
	public RectangleP4(double l, double w) //Overload the Constructor
	{
		length = l;
		width = w;
	}
	
	public void setLength(double newL)
	{
		length = newL;
	}
	public void setWidth(double newW)
	{
		width = newW;
	}
	
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	
	//Implement the perimeter method
	
	//Implement displayAreaFormula() method
	
	public boolean equals(Object r)
	{
		RectangleP4 testObj = (RectangleP4) r;
		
		if(testObj.getLength() == length && testObj.getWidth() == width)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String rectangleS;
		
		rectangleS = "Rectangle has length "+ length +
				"and width " + width;
		
		return rectangleS;
				
	}
	
	public int compareTo(Object r)
	{
		RectangleP4 testRect = (RectangleP4) r;
		
		if(length < testRect.getLength() || width < testRect.getWidth())
		{
			return(-1);
		}
		else if(length == testRect.getLength() && width == testRect.getWidth())
		{
			return(0);
		}
		else
		{
			return(1);
		}
	}
		
	
}