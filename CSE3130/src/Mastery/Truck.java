package Mastery;

import java.util.Arrays;

public class Truck extends Vehicle
{
	String song;
	
	public Truck(String N, double D, double V, double S, double F)
	{
		super(N, D, V, S, F);
	}
	public String songChoiceCountry()
	{
		String[] songs = {"where the wild things are. luke combs", "fast car. luke combs", "home. Franck and Damien", "Pretty little poison. Warren zeiders"};
		song = Arrays.toString(songs);
		return(song);
	}
	public String songChoiceRock()
	{
		String[] songs = {"Bohemian Rhapsody. Queen", "Sweet child O'mine. Guns N' Roses", "Whole Lotta Love. Led Zeppelin", "smoke on the water. Deep purple"};
		song = Arrays.toString(songs);
		return(song);
	}
	public String toString()
	{
		return(super.toString() + "fuel economy is: " + fuelEconHwy() + " on the hwy, and in the city: " + FuelEconCity() +
				"\n the cargo space is: " + cargoVolume() + " square feet" +
				"\n seats: " + seating()
				+ "\n music choice for country songs: " + songChoiceCountry()
				+ "\n music choice for rock songs: " + songChoiceRock());
	}
}
