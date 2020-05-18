// program that calculates the miles per gallon used

import java.util.Scanner;
public class Challenge2_9{
	public static void main(String[] args){
		double numMiles;
		double numGallons;
		double mpg;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of miles drives: ");
		numMiles = keyboard.nextDouble();
		
		System.out.print("Enter the number of gallons consumed: ");
		numGallons = keyboard.nextDouble();
		
		mpg = numMiles / numGallons;
		
		System.out.println("\nMiles per gallon: " + mpg);
	}//end main
}//end class