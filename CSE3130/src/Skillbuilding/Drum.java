package Skillbuilding;

public class Drum extends Percussion {

	public Drum(String Drummer) {
		super(Drummer);
		// TODO Auto-generated constructor stub
	}
	


	public String makeSound() {
	 	return("Thump");
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
