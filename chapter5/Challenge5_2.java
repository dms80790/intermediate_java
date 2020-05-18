//program that determines the retail price of an item, given its wholesale cost and markup percentage
import java.util.Scanner;
public class Challenge5_2{
	public static void main(String[] args){
		double wholesale;
		double markup;
		double retail;
		
		Scanner keyboard = new Scanner(System.in);
		
		//obtain wholesale price
		System.out.print("Wholesale price: $");
		wholesale = keyboard.nextDouble();

		//obtain markup percentage
		System.out.print("Markup percentage: ");
		markup = keyboard.nextDouble();

		//calculate retail price
		retail = calculateRetail(wholesale, markup);
		
		//display retail price
		System.out.println("Retail price: $" + retail);

		System.exit(0);  //exit without error
	}//end main
	
	/**
		method that calculates retail price from wholesale price and markup
		@param wholesale.. the wholesale price of the item
		@param markup..  the markup percentage
		@return the retail price
	*/
	public static double calculateRetail(double wholesale, double markup){
		return wholesale + (wholesale * (markup/100));
	}//end calculateRetail
}//end class