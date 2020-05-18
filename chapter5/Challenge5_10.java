//Write a method that accepts as arguments the number of shares, the purchase price per
//share, the purchase commission paid, the sale price per share, and the sale commission
//paid. The method should return the profit (or loss) from the sale of stock.

import java.util.Scanner;
public class Challenge5_10{
	public static double getProfit(int numShares, double purchasePPS, double purchaseCommission, double salePPS, double saleCommision){
		double profit;
		
		profit = (numShares * salePPS) - saleCommision - (numShares * purchasePPS) - purchaseCommission;
	
		return profit;
	}//end getProfit
	
	public static void main(String[] args){
		int numShares;
		double purchasePrice, purchaseCommission, salePrice, saleCommision, profit;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of shares: ");
		numShares = keyboard.nextInt();
		
		System.out.print("Enter the purchase price: $");
		purchasePrice = keyboard.nextDouble();
		
		System.out.print("Enter the purchase commission: $");
		purchaseCommission = keyboard.nextDouble();
		
		System.out.print("Enter the sale price: $");
		salePrice = keyboard.nextDouble();
		
		System.out.print("Enter the sale commission: $");
		saleCommision = keyboard.nextDouble();
		
		profit = getProfit(numShares, purchasePrice, purchaseCommission, salePrice, saleCommision);
		
		System.out.println("Net profit: $" + profit);
		
		System.exit(0);  //exit without error
	}//end main
}//end class