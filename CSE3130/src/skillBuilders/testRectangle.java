package skillBuilders;

public class testRectangle{

	public static void main(String[] args) 
	{
		Rectangle R1 = new Rectangle(5, 2);
		Rectangle R2 = new Rectangle(3, 2);
		
		if(R1.compareToArea(R2) == 0)
		{
			System.out.println("Rectangles have same width and length");
		}else if(R1.compareToArea(R2) < 0)
		{
			System.out.println("R2 is larger than R1");
		}else if(R1.compareToArea(R2) > 0)
		{
			System.out.println("R1 is larger than R2");
		}
		
		
		if(R1.compareTo(R2) == 0)
		{
			System.out.println("Rectangles have same width and length");
		}
		else
		{
			System.out.println("They have different widths and lengths");
		}
		
		System.out.println(R1);
		System.out.println(R2);
		
	}

}
