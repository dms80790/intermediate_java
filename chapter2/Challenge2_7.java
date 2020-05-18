//write a program that determines the amount of sales tax

import java.util.Scanner;
public class Challenge2_7{
	public static void main(String[] args){
		double initial_price;
		double total_state_tax;
		double total_county_tax;
		double total_tax;
		double final_price;
		final double STATE_TAX = .04;
		final double COUNTY_TAX = .02;
		
		Scanner keyboard = new Scanner(System.in);
		
		//prompt user for price and store
		System.out.print("Enter price: $");
		initial_price = keyboard.nextDouble();
		
		//calculate the taxes and final price
		total_state_tax = initial_price * STATE_TAX;
		total_county_tax = initial_price * COUNTY_TAX;
		total_tax = total_county_tax + total_state_tax;
		final_price = initial_price + total_tax;

		//display the final price and taxes
		System.out.println("Initial price: $" + initial_price);
		System.out.println("State tax: $" + total_state_tax);
		System.out.println("County tax: $" + total_county_tax);
		System.out.println("Total sales tax: $" + total_tax);
		System.out.println("Final price: $" + final_price);
	}//end main
}//end class