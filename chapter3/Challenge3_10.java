// program that calculates the percentage of calories that come from fat

import java.util.Scanner;
public class Challenge3_10{
	public static void main(String[] args){
		int calories;
		int gramsFat;
		double percentCaloriesFat;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of calories: ");
		calories = keyboard.nextInt();
		
		System.out.print("Enter the grams of fat: ");
		gramsFat = keyboard.nextInt();
		
		percentCaloriesFat = ((gramsFat * 9) / (double)calories) * 100;
		
		System.out.println("Percent calories from fat: " + percentCaloriesFat);
		
		if(percentCaloriesFat < 30)
			System.out.println("This is a low-fat food! Good choice!");
	}//end main
}//end class