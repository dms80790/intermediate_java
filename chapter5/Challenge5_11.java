//update to challenge 5_10 to accept multiple transactions

import java.util.Scanner;
public class Challenge5_11{
	public static double getProfit(int numShares, double purchasePPS, double purchaseCommission, double salePPS, double saleCommision){
		double profit;
		
		profit = (numShares * salePPS) - saleCommision - (numShares * purchasePPS) - purchaseCommission;
	
		return profit;
	}//end getProfit
	
	public static void main(String[] args){
		int numShares, numTransactions;
		double purchasePrice, purchaseCommission, salePrice, saleCommision, profit = 0;
		//profit is an accumulator
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of transactions: ");
		numTransactions = keyboard.nextInt();
		
		//loop through numTransactions
		for(int i = 0; i < numTransactions; i++){
			System.out.println("/////////////////////////////////");
			System.out.println("Transaction " + (i+1));
			
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
			
			//add the indiviual profit to total profits
			profit += getProfit(numShares, purchasePrice, purchaseCommission, salePrice, saleCommision);
		}//end for loop
		
		System.out.println("Net profit: $" + profit);
		
		System.exit(0);  //exit without error
	}//end main
}//end class