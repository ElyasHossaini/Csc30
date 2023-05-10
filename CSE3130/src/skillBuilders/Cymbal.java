package skillBuilders;

public class Cymbal extends Percussion
{
	/*
	 * pre none
	 * post a cynmbal has been created
	 */
	public Cymbal(String cymbalist)
	{
		super(cymbalist);
	}
	/*
	 * pre none
	 * post the sound made by the instrument is returned
	 */

	public String makeSound()
	{
		return("Clang");
	}
	/*
	 * pre none
	 * post a string reprsenting the instrument has been returned
	 */
	public String toSring()
	{
		return(super.getMusician() + "plays" + makeSound() + ".");
	}
	
}
