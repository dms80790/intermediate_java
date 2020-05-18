//program that calculates the cost of a paint job, given the size of the wall
//115 square feet wall space... one gallon of paint... 8 hours labor... 18 per hour labor
import java.util.Scanner;
public class Challenge5_4{
	public static void main(String[] args){
		double numGallons, numHours, paintPrice, laborPrice, total;
		
		numGallons = calculateGallons();
		paintPrice = calculatePaintPrice(numGallons);
		numHours = calculateLaborHours(numGallons);
		laborPrice = calculateLaborPrice(numHours);
		total = calculateTotal(paintPrice, laborPrice);
		
		//display the results
		displayTotal(numGallons, numHours, laborPrice, total);
		
	}//end main
	
	public static double calculateGallons(){
		int numRooms;
		double squareFeet = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of rooms: ");
		numRooms = keyboard.nextInt();

		//add up square feet
		for(int i = 0; i < numRooms; i++){
			System.out.print("Enter the size of room " + (i+1) + ": ");
			squareFeet += keyboard.nextDouble();
		}//end for loop
		
		//return the number of gallons needed
		return (squareFeet / 115); 
	}//end calculateGallons
	
	public static double calculatePaintPrice(double gallons){
		double pricePer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the price per gallon: $");
		pricePer = keyboard.nextDouble();
		
		return pricePer * gallons;
	}//end calculatePaintPrice
	
	public static double calculateLaborHours(double gallons){
		return gallons * 8;
	}//end calculateLaborHours
	
	public static double calculateLaborPrice(double hours){
		double rate;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter hourly labor rate: $");
		rate = keyboard.nextDouble();
		
		return rate * hours;
	}//end calculateLaborPrice
	
	public static double calculateTotal(double paint, double labor){
		return paint + labor;
	}//end calculateTotal
	
	public static void displayTotal(double gal, double hours, double labor, double total){
		System.out.println("Number gallons: " + gal + "\n" +
						   "Labor hours: " + hours + "\n" +
						   "Labor cost: $" + labor + "\n" +
						   "Total: $" + total);
	}//end displayTotal
	
}//end class