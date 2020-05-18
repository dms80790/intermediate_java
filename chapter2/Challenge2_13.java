// program that calculates a restaurant bill

import java.util.Scanner;
public class Challenge2_13{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		double charge;
		final double TAX_RATE = 0.0675;
		final double TIP_RATE = 0.2;
		double tax_amount;
		double tip_amount;
		double total_after_tax;
		double total_after_tip;
		
		//obtain the original bill amount
		System.out.print("Enter the bill amount: $");
		charge = keyboard.nextDouble();

		//calculate tax before tip
		tax_amount = charge * TAX_RATE;
		total_after_tax = charge + tax_amount;

		//calculate tip after tax
		tip_amount = total_after_tax * TIP_RATE;
		total_after_tip = total_after_tax + tip_amount;

		//display totals
		System.out.println("Tax: $" + tax_amount);	
		System.out.println("Tip: $" + tip_amount);	
		System.out.println("Total: $" + total_after_tip);	
	}//end main
}//end class