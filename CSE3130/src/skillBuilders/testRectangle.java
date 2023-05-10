/*
 * Program: AccountTester.java
 * Last Date of this Revision: April 29, 2023
 * 
 * Purpose: Create a Rectangle program
 * 
 * Author: Your Name, Elyas Hossaini
 * School: CHHS
 * Course: Computer Programming 30
 */
package skillBuilders;

public class testRectangle {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(5, 2); // Create a rectangle object R1 with width 5 and height 2
		Rectangle R2 = new Rectangle(3, 2); // Create a rectangle object R2 with width 3 and height 2

		// Compare the areas of R1 and R2 using the compareToArea() method
		if (R1.compareToArea(R2) == 0) {
			System.out.println("Rectangles have the same width and length");
		} else if (R1.compareToArea(R2) < 0) {
			System.out.println("R2 is larger than R1");
		} else if (R1.compareToArea(R2) > 0) {
			System.out.println("R1 is larger than R2");
		}

		// Compare R1 and R2 using the compareTo() method
		if (R1.compareTo(R2) == 0) {
			System.out.println("Rectangles have the same width and length");
		} else {
			System.out.println("They have different widths and lengths");
		}

		System.out.println(R1); // Print the details of R1
		System.out.println(R2); // Print the details of R2
	}
}
/*
R1 is larger than R2
They have different widths and lengths
Rectangle has length 5.0 and width 2.0 and area 10.0
Rectangle has length 3.0 and width 2.0 and area 6.0

*/