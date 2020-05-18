// program that determines if a customer gets a discount and their total due

import java.util.Scanner;
public class Challenge3_8{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int numItems;
		double discount;
		double total;
		final double PRICE = 99;
		
		System.out.print("Enter number of items: ");
		numItems = keyboard.nextInt();
		
		if(numItems >= 100)
			discount = .50;
		else if(numItems >= 50)
			discount = .40;
		else if(numItems >= 20)
			discount = .30;
		else if(numItems >= 10)
			discount = .20;
		else
			discount = 0;
		
		total = numItems * PRICE - (numItems * PRICE * discount);
		
		System.out.println("Subtotal: $" + numItems * PRICE);
		System.out.println("Discount: $" + numItems * PRICE * discount);
		System.out.println("Total: $" + total);
	}//end main
}//end class