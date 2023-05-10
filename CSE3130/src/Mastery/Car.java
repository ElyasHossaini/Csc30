package Mastery;

import java.util.Random;
;

public class Car extends Vehicle//
{
	int moneyWon;
	String money;
	//name, doors, storage, seating, kmpl
	public Car(String N, double D, double V, double S, double F)
	{
		super(N, D, V, S, F);
	}
	public String toString()
	{
		return(super.toString() + "fuel economy is: " + fuelEconHwy() + " on the hwy, and in the city: " + FuelEconCity() +
				"\n the cargo space is: " + cargoVolume() + " square feet" +
				"\n seats: " + seating());
	}
	
}
