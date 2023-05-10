/*
 * Program: AccountTester.java
 * Last Date of this Revision: April 28, 2023
 * 
 * Purpose: Create a Music game
 * 
 * Author: Your Name, Elyas Hossaini
 * School: CHHS
 * Course: Computer Programming 30
 */
package skillBuilders;

/*
 * Music.java from Chapter 8
 * A program that demonstrates polymorphism.
 * Lawrenceville Press
 * June 10, 2011
 */

import java.util.Scanner;

/**
 * A musical performance.
 */
public class Music {

	/**
	 * Returns a selected instrument.
	 * pre: none
	 * post: An instrument object has been returned.
	 */
	public static Instrument assignInstrument() {
		String instrumentChoice, name;
		Scanner input = new Scanner(System.in);

		System.out.println("Select an instrument for the band member.");
		System.out.print("Vocals, Piccolo, or Clarinet: ");
		instrumentChoice = input.nextLine(); // Read the chosen instrument
		System.out.print("Enter the band member's name: ");
		name = input.nextLine(); // Read the band member's name

		// Create and return an instrument object based on the chosen instrument
		if (instrumentChoice.equalsIgnoreCase("V")) {
			return new Vocal(name);
		} else if (instrumentChoice.equalsIgnoreCase("P")) {
			return new Piccolo(name);
		} else if (instrumentChoice.equalsIgnoreCase("C")) {
			return new Clarinet(name);
		} else if (instrumentChoice.equalsIgnoreCase("Cy")) {
			return new Cymbal(name);
		} else { // Default set to Drum
			return new Drum(name);
		}
	}

	public static void main(String[] args) {
		Performance band;
		Instrument bandMember1, bandMember2, bandMember3, bandMember4;
		Scanner input = new Scanner(System.in);
		String performanceChoice;

		// Assign instruments to the band members
		bandMember1 = assignInstrument();
		bandMember2 = assignInstrument();
		bandMember3 = assignInstrument();
		bandMember4 = assignInstrument();
		System.out.println(bandMember1 + " " + bandMember2 + " " + bandMember3 + " " + bandMember4 + "\n");

		System.out.print("Would you like to hear a Solo, a Duet, a Trio, quartet or Leave? ");
		performanceChoice = input.nextLine(); // Read the chosen performance type

		while (!performanceChoice.equalsIgnoreCase("L")) {
			if (performanceChoice.equalsIgnoreCase("S")) {
				band = new Performance(bandMember1); // Create a solo performance with bandMember1
			} else if (performanceChoice.equalsIgnoreCase("D")) {
				band = new Performance(bandMember1, bandMember2); // Create a duet performance with bandMember1 and bandMember2
			} else if (performanceChoice.equalsIgnoreCase("T")) {
				band = new Performance(bandMember1, bandMember2, bandMember3); // Create a trio performance with bandMember1, bandMember2, and bandMember3
			} else { // Default is set to quartet
				band = new Performance(bandMember1, bandMember2, bandMember3, bandMember4); // Create a quartet performance with all four band members
			}

			band.begin(); // Start the performance

			System.out.print("\nWould you like to hear a Solo, a Duet, a Trio, quartet, or Leave? ");
			performanceChoice = input.nextLine(); // Read the chosen performance type
		}
	}
}
/*
 Select an instrument for the band member. 
Vocals, Piccolo, or Clarinet: v
Enter the band member's name: molly
Select an instrument for the band member. 
Vocals, Piccolo, or Clarinet: p
Enter the band member's name: john
Select an instrument for the band member. 
Vocals, Piccolo, or Clarinet: c
Enter the band member's name: mike
Select an instrument for the band member. 
Vocals, Piccolo, or Clarinet: v
Enter the band member's name: kevin
molly sings LaLaLa. john plays peep. mikeplayssquawk. kevin sings LaLaLa.

Would you like to hear a Solo, a Duet, a Trio, quartet or Leave? s
LaLaLa

Would you like to hear a Solo, a Duet, a Trio, quartet, or Leave? d
LaLaLapeep

Would you like to hear a Solo, a Duet, a Trio, quartet, or Leave? t
LaLaLapeepsquawk

Would you like to hear a Solo, a Duet, a Trio, quartet, or Leave? q
LaLaLapeepsquawkLaLaLa

Would you like to hear a Solo, a Duet, a Trio, quartet, or Leave? l

 */