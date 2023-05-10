package skillBuilders;

/**
 * Rectangle class.
 */
public class Rectangle{
	private double length, width, rectArea;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Rectangle object created. length and width intialized to 1.
	 */
	public Rectangle() {
		length = 1;			//default length
		width = 1;			//default width
	}

	/**
	 * constructor
	 * pre: none
	 * post: A Rectangle object created with length l and width w.
	 */
	public Rectangle(double l, double w) {
		length = l;			
		width = w;			
	}


	/** 
	 * Changes the length of the rectangle.
	 * pre: none
	 * post: length has been changed.
	 */
	public void setLength(double newLength) {
	 	length = newLength;
	}


	/** 
	 * Changes the width of the rectangle.
	 * pre: none
	 * post: width has been changed.
	 */
	public void setWidth(double newWidth) {
	 	width = newWidth;
	}


	/** 
	 * Calcuates the area of the rectangle.
	 * pre: none
	 * post: The area of the rectangle has been returned.
	 */
	public double area() {
	 	
	 	rectArea = length * width;
	 	return(rectArea);
	 	
	}
	/*
	 * returns the rectangle area
	 * 
	 * 
	 */
	public double getArea()
	{
		return area();
	}

	
	/** 
	 * Calculates the perimeter of the rectangle.
	 * pre: none
	 * post: The perimeter of the rectangle has been returned.
	 */
	public double perimeter() {
	 	double rectPerimeter;
	 	
	 	rectPerimeter = (2 * length) + (2 * width);
	 	return(rectPerimeter);
	}


	/** 
	 * Returns the legnth of the rectangle.
	 * pre: none
	 * post: The length of the rectangle has been returned.
	 */
	public double getLength() {
	 	return(length);
	}


	/** 
	 * Returns the width of the rectangle.
	 * pre: none
	 * post: The width of the rectangle has been returned.
	 */
	public double getWidth() {
	 	return(width);
	}
	
	
	/** 
	 * Displays the formula for the area of a rectangle.
	 * pre: none
	 * post: The formula for area of a rectangle has been displayed.
	 */
	public static void displayAreaFormula() {
	 	System.out.println("The formula for the area of a rectangle is a=l*w");
	}
	
	
	/** 
	 * Determines if the object is equal to another
	 * Circle object.
	 * pre: r is a Rectangle object.
	 * post: true has been returned if the objects have 
	 * the same length and width. false has been returned otherwise..
	 */
	public boolean equals(Object r) {
		Rectangle testObj = (Rectangle)r;
		
	 	if (testObj.getLength() == length && testObj.getWidth() == width) {
			return(true);
		} else {
			return(false);
		}
	}
	
	public int compareTo(Object r)
	{
		Rectangle testRectangle = (Rectangle)r;
		
		if((length == testRectangle.getLength()) && (width == testRectangle.getWidth()))
		{
			return(0);
		}else
		{
			return(3);
		}
	}
	
	public int compareToArea(Object r)
	{
		
		Rectangle testRectangle = (Rectangle)r;
		
		if(area() < testRectangle.getArea())
		{
			return(-1);
		}else if(area() > testRectangle.getArea())
		{
			return(1);
		}else
		{
			return(0);
		}
	}
	

	/** 
	 * Returns a String that represents the Rectangle object.
	 * pre: none
	 * post: A string representing the Rectangle object has 
	 * been returned.
	 */
	public String toString() {
		String rectangleString;

		rectangleString = "Rectangle has length " + length + " and width " + width + " and area " + rectArea;
	 	return(rectangleString);
	}
}
