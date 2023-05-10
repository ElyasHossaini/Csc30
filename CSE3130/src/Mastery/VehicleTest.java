/*

Program: Vehicle.java          Last Date of this Revision: April 20, 2023

Purpose: create a Vehicle abstract class and 3 others, car, truck, minivan which are inheriting the Vehicle class, and contain special or distinct characteristics 
to each vehicle

Author: Your Name, Elyas Hossaini	
School: CHHS
Course: Computer Programming 30
 

*/
package Mastery;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class VehicleTest {
	
	// Method to travel a vehicle for a given distance
	public static void travelVehicle(Vehicle vec, double KM) {
		NumberFormat travelKM = NumberFormat.getCurrencyInstance();
		double kmTravel;
		
		System.out.println(vec); // Print the details of the vehicle
		
		kmTravel = vec.costOfTravel(KM); // Calculate the cost of travel for the given distance
		
		System.out.println(travelKM.format(kmTravel)); // Print the cost of travel in a formatted manner
	}

	public static void main(String[] args) {
		Car vec1 = new Car("BMW", 4, 50, 6, 22); // Create a car object with specific attributes (name, doors, storage, seating, kmpl)
		Truck vec2 = new Truck("Ford", 2, 100, 7, 18); // Create a truck object with specific attributes (name, doors, storage, seating, kmpl)
		Minivan vec3 = new Minivan("Honda", 4, 75, 8, 25, 5); // Create a minivan object with specific attributes (name, doors, storage, seating, kmpl, capacity)
		
		Scanner userinput = new Scanner(System.in); // Create a Scanner object to read user input
		
		String action; // Stores the user's chosen action
		double travel; // Stores the distance of travel
		int carNum; // Stores the chosen car number
		
		Vehicle vec = vec1; // Initialize the selected vehicle with the first car object
		
		do {
			System.out.println("\n (C)ar \\ (P)rice to travel \\ (Q)uit");
			System.out.println("Enter choice: ");
			action = userinput.next(); // Read the user's chosen action
			
			if (!action.equalsIgnoreCase("Q")) {
				System.out.println("Enter car number (1, 2, or 3)");
				carNum = userinput.nextInt(); // Read the user's chosen car number
				
				switch (carNum) {
					case 1:
						vec = vec1; // Set the selected vehicle as car 1
						break;
					case 2:
						vec = vec2; // Set the selected vehicle as car 2
						break;
					case 3:
						vec = vec3; // Set the selected vehicle as car 3
						break;
				}
				
				if (action.equalsIgnoreCase("C")) {
					System.out.println(vec); // Print the details of the selected vehicle
				} else if (action.equalsIgnoreCase("P")) {
					System.out.println("How far are you travelling in km?");
					travel = userinput.nextDouble(); // Read the distance of travel from the user
					
					travelVehicle(vec, travel); // Invoke the method to calculate and print the cost of travel for the selected vehicle
				}
			}
			
			if (vec == vec1) { // Check if the selected vehicle is car 1
				System.out.println("Want to play the lottery, on the way to work? (Y/N)");
				action = userinput.next(); // Read the user's choice
				
				if (action.equalsIgnoreCase("Y")) {
					Random random = new Random();
					int moneyWon = random.nextInt(1000); // Generate a random amount of money won
					System.out.println("You win: $" + Integer.toString(moneyWon)); // Print the amount won
				}
			}
		} while (!action.equalsIgnoreCase("Q")); // Repeat the loop
	}
}
/*

 (C)ar \ (P)rice to travel \ (Q)uit
Enter choice: 
C
Enter car number (1, 2, or 3)
2
Car model: Ford. fuel economy is: 24.0 on the hwy, and in the city: 18.0
 the cargo space is: 100.0 square feet
 seats: 7.0
 music choice for country songs: [where the wild things are. luke combs, fast car. luke combs, home. Franck and Damien, Pretty little poison. Warren zeiders]
 music choice for rock songs: [Bohemian Rhapsody. Queen, Sweet child O'mine. Guns N' Roses, Whole Lotta Love. Led Zeppelin, smoke on the water. Deep purple]

 (C)ar \ (P)rice to travel \ (Q)uit
Enter choice: 
P
Enter car number (1, 2, or 3)
3
How far are you travelling in km?
345
Car model: Honda. fuel economy is: 31.0 on the hwy, and in the city: 25.0
 the cargo space is: 75.0 square feet
 seats: 8.0
 cost of ice cream for the children: $17.9
$23.60

 (C)ar \ (P)rice to travel \ (Q)uit
Enter choice: 
q
*/