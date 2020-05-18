//program that calculates the occupancy rate for each floor in a hotel
//gets the number of floors, then number of rooms and number of occupied rooms per floor
//outputs the total number of rooms, total number occupied rooms, and occupancy rate
import java.util.Scanner;
public class Challenge4_6{
	public static void main(String[] args){
		int numFloors;
		int numRooms = 0;
		int numOccupied = 0;
		int tempRooms;
		int tempOccupied;
		double occupancyRate;
		
		Scanner keyboard = new Scanner(System.in);
		
		//obtain the number of floors in the hotel until valid input
		do{
			System.out.print("Enter the number of floors in the hotel: ");
			numFloors = keyboard.nextInt();
			
			//check there is at least 1 floor in the hotel
			if(numFloors < 1){
				System.out.println("Error. The hotel must have at least 1 floor!");
			}
		}while(numFloors < 1);
		
		//loop through floors
		for(int i = 0; i < numFloors; i++){
			tempRooms = 0;     //set the rooms on this floor to 0
			tempOccupied = 0;  //set the occupied rooms on this floor to 0
			
			//get the number of rooms on this floor until valid
			do{
				System.out.print("Enter the number of rooms on floor " + (i+1) + ": ");
				tempRooms = keyboard.nextInt();
			
				//number of available rooms per floor must be at least 10
				if(tempRooms < 10){
					System.out.println("Error. The number of rooms on a floor cannot be less than 10!");
				}//end if
			}while(tempRooms < 10);
			
			numRooms+= tempRooms;  //increase the total number of rooms in the hotel
			
			//get the number of rooms occupied on this floor until valid
			do{
				System.out.print("Enter the number of occupied rooms on floor " + (i+1) + ": ");
				tempOccupied = keyboard.nextInt();
				
				//cannot have more rooms occupied than number of rooms on the floor
				if(tempOccupied > tempRooms){
					System.out.println("Error. The number of occupied rooms cannot exceed the number of rooms on the floor!");
				}//end if
				//cannot have a negative number of occupied rooms on the floor
				else if(tempOccupied < 0){
					System.out.println("Error. The number of occupied rooms cannot be less than 0!");
				}//end if
			}while(tempOccupied > tempRooms || tempOccupied < 0);
			
			numOccupied += tempOccupied;  //increase the total number of occupied rooms in the hotel
			
			System.out.println("---------------------------------------------");   //formatting
		}//end for
		
		//calculate percentage of rooms occupied
		occupancyRate = (numOccupied / (double)numRooms) * 100.0;
		
		//display output
		System.out.println("Number of occupied rooms: " + numOccupied);
		System.out.println("Number of available rooms: " + numRooms);
		System.out.printf("Occupancy: %.2f%%\n", occupancyRate);
		
		System.exit(0);  //exit without error
	}//end main
}//end class