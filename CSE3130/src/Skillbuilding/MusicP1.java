/*

Program: MusicP1.java          Date: 4/20/2023

Purpose: Modify the Music application to allow the user to select a quartet in addition to the other performances. 

Author: Elyas Hossaini 
School: CHHS
Course: Computer Programming 30
 
*/
package Skillbuilding;



 import java.util.Scanner;


 public class MusicP1 {


	public static Instrument assignInstrument() {
		String instrumentChoice, name;
		Scanner input = new Scanner(System.in);

		System.out.println("Select an instrument for the band member. ");
		System.out.print("Vocals, Piccolo, or Clarinet: ");
		instrumentChoice = input.nextLine();
		System.out.print("Enter the band member's name: ");
		name = input.nextLine();
		if (instrumentChoice.equalsIgnoreCase("Vocals")) {
			return(new Vocal(name));
		} else if (instrumentChoice.equalsIgnoreCase("Piccolo")) {
			return(new Piccolo(name));
		} else {	//default to clarinet
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
Vocals, Piccolo, or Clarinet: Vocals
Enter the band member's name: John
Select an instrument for the band member. 
Vocals, Piccolo, or Clarinet: Piccolo
Enter the band member's name: Jane
Select an instrument for the band member. 
Vocals, Piccolo, or Clarinet: Clarinet
Enter the band member's name: mike
Select an instrument for the band member. 
Vocals, Piccolo, or Clarinet: Vocals
Enter the band member's name: Sarah
John sings LaLaLa. Jane plays peep. mike plays squawk. Sarah sings LaLaLa.

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Solo
LaLaLa

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Duet
LaLaLapeep

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Trio
LaLaLapeepsquawk

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Quartet
LaLaLapeepsquawkLaLaLa

Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? Leave

*/