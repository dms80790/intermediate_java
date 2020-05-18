// program that calculates stock commission

public class Challenge2_15{
	public static void main(String[] args){
		int numShares = 600;
		double sharePrice = 21.77;
		double commissionRate = 0.02;
		
		double stockPaid = numShares * sharePrice;
		double commission = stockPaid * commissionRate;
		double total = stockPaid + commission;
		
		System.out.println("Price before commission: $" + stockPaid);
		System.out.println("Commission: $" + commission);
		System.out.println("Total: $" + total);
	}//end main
}//end class