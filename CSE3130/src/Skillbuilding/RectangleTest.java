package Skillbuilding;

public class RectangleTest 
{

	public static void main(String[] args) 
	{
		RectangleP4 b1 = new RectangleP4(3, 5);
		RectangleP4 b2 = new RectangleP4(4, 5);
		
		System.out.println("Rectangle has length " + 
						b1.getLength() +
						" and width "+
						b1.getWidth());
		
		//Display the formula
		
		//Display the area
		
		//Display the perimeter
		
		if(b1.equals(b2))
		{
			System.out.println("Rectangles are equal");
		}
		else
		{
			System.out.println("Rectangles are not equal");
		}
		
		if(b1.compareTo(b2) < 0)
		{
			System.out.println("b1 is smaller than b2");
		}
		else if(b1.compareTo(b2) == 0)
		{
			System.out.println("b1 is same size as b2");
		}
		else
		{
			System.out.println("b1 is larger than b2");	
		}
		System.out.println(b2);

	}

}