//programming assignment 1 CS 401
import java.util.Scanner;   //used for user input
public class ItemShop{
	public static void main(String[] args){
		String name;    //customer's name
		int numCoins;   //number of coins in user's wallet
		int itemNum;    //item menu choice number
		int itemPrice;  //price of the item
		int itemQuantity;  //number of units to buy
		int discount = 0;
		int subtotal;  //total before discount
		int total;  //subtotal - discount

		//constants for item prices
		final int LONG_SWORD_PRICE = 120;
		final int SHORT_SWORD_PRICE = 90;
		final int MACE_PRICE = 80;
		final int MAGIC_RING_PRICE = 150;
		final int HEALING_POTION_PRICE = 10;
		
		final double DISCOUNT_RATE = .10;   //discount rate of 10%
		
		Scanner keyboard = new Scanner(System.in);   //user input object
		
		//obtain user's name
		System.out.print("Enter name: ");
		name = keyboard.nextLine();
		
		//obtain number of starting coins
		System.out.print("Enter your number of gold coins: ");
		numCoins = keyboard.nextInt();
		
		//welcome message
		System.out.println("\nWelcome to the Item Shop, " + name + "!");
		System.out.println("\nHere's what we have for sale (all prices are in units of gold):\n");
		
		//display menu
		System.out.println("1. Long Sword\t\t" + LONG_SWORD_PRICE + "\n" +
						   "2. Short Sword\t\t" + SHORT_SWORD_PRICE + "\n" +
						   "3. Mace\t\t\t" + MACE_PRICE + "\n" +
						   "4. Magic Ring\t\t" + MAGIC_RING_PRICE + "\n" +
						   "5. Healing Potion\t" + HEALING_POTION_PRICE + "\n");
						   
		//obtain user item choice
		System.out.print("Enter the item number: ");
		itemNum = keyboard.nextInt();
		
		//set the item cost, depending on item choice
		switch(itemNum){
			case 1:
				itemPrice = 120;
				break;
			case 2:
				itemPrice = 90;
				break;
			case 3:
				itemPrice = 80;
				break;
			case 4:
				itemPrice = 150;
				break;
			case 5:
				itemPrice = 10;
				break;
			default:
				itemPrice = 0;
				break;
		}//end switch
		
		//obtain item quantity
		System.out.print("Enter the quantity: ");
		itemQuantity = keyboard.nextInt();
		
		//calculate cost
		subtotal = itemPrice * itemQuantity;
		
		//determine discount if number of items is 3 or more
		if(itemQuantity >= 3){
			discount = (int)(subtotal * DISCOUNT_RATE);
		}//end if
		
		//determine final total
		total = subtotal - discount;
		
		//display output
		System.out.println("\nTotal cost: " + subtotal + " gold\n" +
						   "Discount: " + discount + " gold\n" +
						   "Final cost: " + total + " gold\n");
		
		//check for sufficient funds
		if(total > numCoins){
			System.out.println(name + " - you have insufficient funds! Please come back with more gold!");
		}
		else{
			System.out.println("Thank you, " + name + "! Your transaction is complete! Please stop by again!");
		}//end else
	}//end main

}//end class