package Mastery;

import java.text.NumberFormat;

public class Minivan extends Vehicle
{
	double iceCream, kidCount;
	
	//name, carDoors, volume or storage, Seating, fuel economy
	public Minivan(String N, double D, double V, double S, double F, double kids)
	{
		super(N, D, V, S, F); //grabs variables from inherit vehicle class
		kidCount = kids;
	}
	public double costOfIceCream()//the cost of iceCream per kids in the car, as minivans are famous for parents
	{
		NumberFormat cost = NumberFormat.getCurrencyInstance();
		iceCream = kidCount * 3.58;
		cost.format(iceCream);
		return(iceCream);
	}
	public String toString()
	{
		return(super.toString() + "fuel economy is: " + fuelEconHwy() + " on the hwy, and in the city: " + FuelEconCity() +
				"\n the cargo space is: " + cargoVolume() + " square feet" +
				"\n seats: " + seating()
				+ "\n cost of ice cream for the children: $" + costOfIceCream());
	}
}
