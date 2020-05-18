// program that determines the amount of time for sound to travel through one of three different mediums

import java.util.Scanner;
public class Challenge3_12{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double time;
		String medium;
		double distance;
		
		System.out.print("air, water, or steel?: ");
		medium = keyboard.nextLine();
		
		System.out.print("Distance: ");
		distance = keyboard.nextDouble();
		
		if(medium.equals("air")){
			time = distance / 1100.0;
		}//end if
		else if(medium.equals("water")){
			time = distance / 4900.0;
		}//end if
		else{
			time = distance / 16400.0;
		}//end if
		
		System.out.println("Time: " + time + "s");
	}//end main
}//end class