//write a program that lets the user enter the number of cookies eaten and calculates the total calories

import java.util.Scanner;
public class Challenge2_8{
	public static void main(String[] args){
		final int CALORIES_PER_COOKIE = 75;
		int numCookies;
		int caloriesConsumed;

		Scanner keyboard = new Scanner(System.in);
	
		//prompt user for number of cookies eaten
		System.out.print("Number of cookies eaten: ");
		numCookies = keyboard.nextInt();

		//calculate the number of calories consumed
		caloriesConsumed = numCookies * CALORIES_PER_COOKIE;

		//print out the number of calories consumed
		System.out.println("Calories: " + caloriesConsumed);
	}//end main
}//end class