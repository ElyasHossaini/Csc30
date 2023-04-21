/*

Program: MusicP2.java          Date: 4/24/2023

Purpose: Modify the Music application to allow the user to select a cymbal or drum in addition to the other
instruments for the band members. 

Author: Elyas Hossaini 
School: CHHS
Course: Computer Programming 30
 
*/
package Skillbuilding;



 import java.util.Scanner;


 public class MusicP2 {


	public static Instrument assignInstrument() {
		String instrumentChoice, name;
		Scanner input = new Scanner(System.in);

		System.out.println("Select an instrument for the band member. ");
		System.out.print("Vocals, Piccolo, Clarinet, Drums, or Cymbals: ");
		instrumentChoice = input.nextLine();
		System.out.print("Enter the band member's name: ");
		name = input.nextLine();
		if (instrumentChoice.equalsIgnoreCase("Vocals")) {
			return(new Vocal(name));
		} else if (instrumentChoice.equalsIgnoreCase("Piccolo")) {
			return(new Piccolo(name));
		} else if (instrumentChoice.equalsIgnoreCase("Drums")) {
				return(new Drum(name));
		} else if (instrumentChoice.equalsIgnoreCase("Cymbals")) {
			return(new Cymbal(name));
	    } else {	
			return(new Clarinet(name));
		}
	}


	public static void main(String[] args) {
		Performance band;
		Instrument bandMember1, bandMember2, bandMember3, bandMember4;
		Scanner input = new Scanner(System.in);
		String performanceChoice;

		/* assign instruments */
		bandMember1 = assignInstrument();
		bandMember2 = assignInstrument();
		bandMember3 = assignInstrument();
		bandMember4 = assignInstrument();
		System.out.println(bandMember1 + " " + bandMember2 + " " + bandMember3 + " " + bandMember4 + "\n");

		System.out.print("Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? ");
		performanceChoice = input.nextLine();
		while (!performanceChoice.equalsIgnoreCase("Leave")) {
			if (performanceChoice.equalsIgnoreCase("Solo")) {
				band = new Performance(bandMember1);
			} else if (performanceChoice.equalsIgnoreCase("Duet")) {
				band = new Performance(bandMember1, bandMember2);
			} else if (performanceChoice.equalsIgnoreCase("Trio")) {	
				band = new Performance(bandMember1, bandMember2, bandMember3);
			}
			else {
				band = new Performance(bandMember1, bandMember2, bandMember3, bandMember4);
			}
			band.begin();

			System.out.print("\nWould you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? ");
			performanceChoice = input.nextLine();
		}
	}
}
/*
Select an instrument for the band member. 
Vocals, Piccolo, Clarinet, Drums, or Cymbals: Vocals
Enter the band member's name: Sarah
Select an instrument for the band member. 
Vocals, Piccolo, Clarinet, Drums, or Cymbals: Clarinet
Enter the band member's name: Elyas
Select an instrument for the band member. 
Vocals, Piccolo, Clarinet, Drums, or Cymbals: Drums
Enter the band member's name: Idrees
Select an instrument for the band member. 
Vocals, Piccolo, Clarinet, Drums, or Cymbals: Cymbals
Enter the band member's name: Neda
Sarah sings LaLaLa. Elyas plays squawk. Idrees plays Thump. Neda plays Clang.

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Solo
LaLaLa

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Duet
LaLaLasquawk

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Trio
LaLaLasquawkThump

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Quartet
LaLaLasquawkThumpClang

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Leave
*/