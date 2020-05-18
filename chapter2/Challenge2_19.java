// stock calculator program

public class Challenge2_19{
	public static void main(String[] args){
		int numPurchased = 1000;
		double pricePerShare = 32.87;
		double commissionRate = .02;
		
		double sellingPrice = 33.92;
		
		double pricePaid;
		double commissionInitial;
		double priceSold;
		double commissionSold;
		double profit;
		
		pricePaid = numPurchased * pricePerShare;
		commissionInitial = pricePaid * commissionRate;
		priceSold = numPurchased * sellingPrice;
		commissionSold = priceSold * .02;
		profit = priceSold - commissionSold - commissionInitial - pricePaid;
		
		System.out.println("Initial price paid: $" + pricePaid);
		System.out.println("Initial commission paid: $" + commissionInitial);
		System.out.println("Amount sold for: $" + priceSold);
		System.out.println("Selling commission paid: $" + commissionSold);
		System.out.printf("Profit: $%.2f", profit);
	}//end main
}//end class