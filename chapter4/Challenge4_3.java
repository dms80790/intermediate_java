//program that doubles a persons salary for every day worked, and displays the total earned
import java.util.Scanner;
import java.lang.Math;
public class Challenge4_3{
	public static void main(String[] args){
		double total = 0;  //holds the total amount earned over the period
		final int GROWTH_FACTOR = 2;  //exponential base
		int numDays;  //user input for number of days worked
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of days worked: ");
		numDays = keyboard.nextInt();
		
		//input validation that at least 1 day was worked
		if(numDays < 1){
			System.out.println("Error. Must enter at least 1 day worked.");
			System.exit(-1);
		}//end if
		
		//calculate the amount earned
		total = .01 * Math.pow(GROWTH_FACTOR, numDays);
		
		System.out.println("Total earnings: $" + total);
	}//end main
}//end class