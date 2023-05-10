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


	/* Returns a selected instrument.
	 * pre: none
	 * post: An instrument object has been returned.
	 */
	public static Instrument assignInstrument() {
		String instrumentChoice, name;
		Scanner input = new Scanner(System.in);

		System.out.println("Select an instrument for the band member. ");
		System.out.print("Vocals, Piccolo, or Clarinet: ");
		instrumentChoice = input.nextLine();
		System.out.print("Enter the band member's name: ");
		name = input.nextLine();
		if (instrumentChoice.equalsIgnoreCase("V")) {
			return(new Vocal(name));
		} else if (instrumentChoice.equalsIgnoreCase("P")) {
			return(new Piccolo(name));
		} else if (instrumentChoice.equalsIgnoreCase("C")){	
			return(new Clarinet(name));
		} else if(instrumentChoice.equalsIgnoreCase("Cy"))
		{
			return(new Cymbal(name));
		}else { //default set to Drum
			return(new Drum(name));
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

		System.out.print("Would you like to hear a Solo, a Duet, a Trio, quartet or Leave? ");
		performanceChoice = input.nextLine();
		while (!performanceChoice.equalsIgnoreCase("L")) {
			if (performanceChoice.equalsIgnoreCase("S")) {
				band = new Performance(bandMember1);
			} else if (performanceChoice.equalsIgnoreCase("D")) {
				band = new Performance(bandMember1, bandMember2);
			} else if (performanceChoice.equalsIgnoreCase("T")){
				band = new Performance(bandMember1, bandMember2, bandMember3);
			}else { //default is set to quartet
				band = new Performance(bandMember1, bandMember2, bandMember3, bandMember4);
			}
			band.begin();

			System.out.print("\nWould you like to hear a Solo, a Duet, a Trio, quartet, or Leave? ");
			performanceChoice = input.nextLine();
		}
	}
}