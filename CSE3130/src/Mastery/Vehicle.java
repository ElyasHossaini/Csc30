/*

Program: Vehicle.java          Last Date of this Revision: April 20, 2023

Purpose: create a Vehicle abstract class and 3 others, car, truck, minivan which are inheriting the Vehicle class, and contain special or distinct characteristics 
to each vehicle

Author: Your Name, Elyas Hossaini	
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

public abstract class Vehicle 
{

	//initializing the variables
	String CarName;
	double carDoors, volume, seating, fuelEcon, kmTravel, kmL, km, fuelEconHwy, fuelEconCity, kmPrice;
	
	//name, carDoors, volume or storage, Seating, fuel economy
	public Vehicle(String N, double D, double V, double S, double F)
	{		
		CarName = N;
		carDoors = D;
		volume = V;
		seating = S;
		fuelEcon = F;
			
	}
	//sets the cargo volume relative to the parameter set in the Vehicle constructor
	public void setCargoVolume(double V)
	{
		volume = V;
	}
	//same deal with cargoVolume
	public void setFuelEcon(double F)
	{
		fuelEcon = F;
	}
	//kmTravel / fuel econ is to see how many litres are traveled
	public double costOfTravel(double kmTravel)
	{
		kmPrice = kmTravel / fuelEcon * 1.71; //multiplied by current premium gas price
		return(kmPrice);
	}
	public double FuelEconCity()
	{
		fuelEconCity = fuelEcon;
		return(fuelEconCity);
	}
	public double fuelEconHwy()
	{
		fuelEconHwy = fuelEcon + 6;//on average the fuel economy on highway is 6km more than in city
		return(fuelEconHwy);
	}
	public double getcostOfTravel()
	{
		return(kmPrice);
	}
	public double cargoVolume()
	{
		return(volume);
	}
	public double seating()
	{
		return(seating);
	}
	//avg km/l is 16.5km/l in city
	//avg km/l is 22.5km/l on highway
	
	//fuelEconomyCity
    //fuelEconomyHwy
    //seatingCapacity
    //cargoVolume
	public String toString()
	{
		return("Car model: " + CarName + ". ");
	}
}
