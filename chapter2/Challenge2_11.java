// program that calculates 40% profit on circuit boards sold

import java.util.Scanner;
public class Challenge2_11{
	public static void main(String[] args){
		double price, profit;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the price of a circuit board: $");
		price = keyboard.nextDouble();
		
		profit = price * .40;
		
		System.out.println("Profit per unit sold: $" + profit);
	}//end main
}//end class