// program that calculates a bank's service fees for the month, based on number of checks written

import java.util.Scanner;
public class Challenge3_15{
	public static void main(String[] args){
		int numChecks;
		final int BASE_RATE = 10;
		double rate;
		double total;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of checks this month: ");
		numChecks = keyboard.nextInt();
		
		if(numChecks < 20){
			rate = .10;
		}
		else if(numChecks >= 20 && numChecks < 40){
			rate = .08;
		}
		else if(numChecks >= 40 && numChecks < 60){
			rate = .06;
		}
		else{
			rate = .04;
		}
		
		total = BASE_RATE + (numChecks * rate);
		
		System.out.println("Total due: $" + total);
	}//end main
}//end class