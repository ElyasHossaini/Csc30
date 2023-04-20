package Skillbuilding;

public class Cymbal extends Percussion {

	public Cymbal(String Cymbalist) {
		super(Cymbalist);
		// TODO Auto-generated constructor stub
	}
	
	public String makeSound() {
	 	return("Clang");
	}

	
	/** 
	 * Returns a String that represents the instrument.
	 * pre: none
	 * post: A string representing the instrument has 
	 * been returned.
	 */
	public String toString() {
	 	return(super.getMusician() + " plays " + makeSound() + ".");
	}
}
	

