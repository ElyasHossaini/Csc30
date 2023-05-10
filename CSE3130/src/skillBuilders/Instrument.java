package skillBuilders;

abstract class Instrument{
	String musician;
	
	/*
	 * constructor
	 * pre: none
	 * post: A musician has been assigned to the instrument
	 * 
	 */
	
	public Instrument(String name) {
		
		musician = name;
		
	}
	
	
	/*
	 * returns the name of the musician 
	 * pre: none
	 * post: The name of the musician playing the instrument 
	 * has been returned
	 * 
	 */
	
	public String getMusician() 
	{
		
	return(musician);
		
	}
	
	/*
	 * should return the sound of the instrument
	 * pre: none
	 * post: the sound made by the instrument is returned
	 * 
	 */
	abstract String makeSound();
}

