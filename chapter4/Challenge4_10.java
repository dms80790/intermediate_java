//program that lets user enter a series of numbers and then returns the maximum and minimum values
//after the user enters -99

import java.util.Scanner;
public class Challenge4_10{
	public static void main(String[] args){
		int input;
		int min = 0;
		int max = 0;
		Scanner keyboard = new Scanner(System.in);
		
		//get first input
		System.out.print("Enter a number (or -99 to stop):");
		input = keyboard.nextInt();
		
		//exit if user enters -99 before entering a number
		if(input == -99){
			System.out.println("No numbers were entered.");
			System.exit(0);
		}
		
		//set the original min and max to the first number entered
		min = input;
		max = input;
		
		do{
			System.out.print("Enter a number (or -99 to stop):");
			input = keyboard.nextInt();
			
			if(input < min && input != -99){
				min = input;
			}
			
			if(input > max && input != -99){
				max = input;
			}
		}while(input != -99);
		
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}//end main
}//end class