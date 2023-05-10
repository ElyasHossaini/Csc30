package skillBuilders;

abstract class Percussion extends Instrument
{
	/*
	 * pre none
	 * a percussion instrument has been created
	 */
	public Percussion(String Percussionist)
	{
		super(Percussionist);
	}
	/*
	 * pre none
	 * post the sound made by the instrument is returned
	 */
	public String makeSound()
	{
		return("Boom");
	}
	
	
}