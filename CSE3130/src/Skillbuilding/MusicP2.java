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
		if (instrumentChoice.equalsIgnoreCase("V")) {
			return(new Vocal(name));
		} else if (instrumentChoice.equalsIgnoreCase("P")) {
			return(new Piccolo(name));
		} else if (instrumentChoice.equalsIgnoreCase("D")) {
				return(new Drum(name));
		} else if (instrumentChoice.equalsIgnoreCase("C")) {
			return(new Cymbal(name));
	    } else {	//default to clarinet   YOU ARE HERE
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
		while (!performanceChoice.equalsIgnoreCase("L")) {
			if (performanceChoice.equalsIgnoreCase("S")) {
				band = new Performance(bandMember1);
			} else if (performanceChoice.equalsIgnoreCase("D")) {
				band = new Performance(bandMember1, bandMember2);
			} else if (performanceChoice.equalsIgnoreCase("T")) {	
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
 Vocals, Piccolo, Clarinet, Drums, or Cymbals: d
 Enter the band member's name: kyle
 Select an instrument for the band member. 
 Vocals, Piccolo, Clarinet, Drums, or Cymbals: c
 Enter the band member's name: johnnah
 Select an instrument for the band member. 
 Vocals, Piccolo, Clarinet, Drums, or Cymbals: v
 Enter the band member's name: manny
 Select an instrument for the band member. 
 Vocals, Piccolo, Clarinet, Drums, or Cymbals: p
 Enter the band member's name: jeff
 kyle plays Thump. johnnah plays Clang. manny sings LaLaLa. jeff plays peep.

 Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? s
 Thump

 Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? d
 ThumpClang

 Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? t
 ThumpClangLaLaLa

 Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? q
 ThumpClangLaLaLapeep

 Would you like to hear a Solo, a Duet, a Trio, a quartet, or Leave? l
*/