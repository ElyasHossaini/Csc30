package Mastery;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;


public class VehicleTest {
	
	public static void travelVehicle(Vehicle vec, double KM)
	{
		NumberFormat travelKM = NumberFormat.getCurrencyInstance();
		
		double kmTravel;
		
		System.out.println(vec);
		
		kmTravel = vec.costOfTravel(KM);
		
		System.out.println(travelKM.format(kmTravel));
	}

	public static void main(String[] args) 
	{
	
		
		Car vec1 = new Car("BMW", 4, 50, 6, 22); //name, doors, storage, seating, kmpl
		Truck vec2 = new Truck("Ford", 2, 100, 7, 18);
		Minivan vec3 = new Minivan("Honda", 4, 75, 8, 25, 5);
		
		Scanner userinput = new Scanner(System.in);
		
		String action;
		double travel;
		int carNum;
		
		Vehicle vec = vec1;
		
		do
		{
			System.out.println("\n (C)ar \\ (P)rice to travel \\ (Q)uit");
			System.out.println("Enter choice: ");
			action = userinput.next();
			
			if(!action.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter car number (1, 2, or 3)");
				carNum = userinput.nextInt();
				
				switch(carNum)
				{
					case 1: vec = vec1;break;
					case 2: vec = vec2;	break;
					case 3: vec = vec3; break;
				}
				if(action.equalsIgnoreCase("C"))
				{
					System.out.println(vec);
				}
				else if(action.equalsIgnoreCase("P"))
				{
					System.out.println("How far are you travelling in km?");
					travel = userinput.nextDouble();
					
					travelVehicle(vec, travel);
					
				}
			}
			if(vec == vec1)
			{
				System.out.println("Want to play the lottery, on the way to work? (Y/N)");
				action = userinput.next();
				if(action.equalsIgnoreCase("Y"))
				{
					Random random = new Random();
					int moneyWon = random.nextInt(1000);  
					System.out.println("You win: $" + Integer.toString(moneyWon));
				}
			}
		}while(!action.equalsIgnoreCase("Q"));

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