package skillBuilders;

public class Drum extends Percussion
{
/*
 * pre none
 * post drum has been created
 */
	
	public Drum(String Drummer)
	{
		super(Drummer);
	}
	/*
	 * pre none
	 * post the sound made by the instrument is returned
	 */
	public String makeSound()
	{
		return("Bang");
	}
	/*
	 * returns a string that represents the instrument
	 * pre: none
	 * post: A string representing the instrument
	 * has been returned
	 */
	public String toString()
	{
		return(super.getMusician() + "plays" + makeSound() + ".");
	}
}
