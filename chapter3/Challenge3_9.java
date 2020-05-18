// program that calculates and displays shipping charges

import java.util.Scanner;
public class Challenge3_9{
	public static void main(String[] args){
		double weight;
		double rate;
		int miles;
		double total;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter weight: ");
		weight = keyboard.nextDouble();
		
		System.out.print("Enter distance: ");
		miles = keyboard.nextInt();
		
		if(weight <= 2)
			rate = 1.1;
		else if(weight <= 6)
			rate = 2.2;
		else if(weight <= 10)
			rate = 3.7;
		else
			rate = 3.8;
	
		total = rate * (miles / 500);
		
		System.out.println("Total: $" + total);
	}//end main
}//end class