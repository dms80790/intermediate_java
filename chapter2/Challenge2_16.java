// program that displays energy drink consumption statistics

public class Challenge2_16{
	public static void main(String[] args){
		int numCustomers = 12467;
		final double ONE_PLUS_PERCENTAGE = .14;
		final double CITRUS_PERCENTAGE = .64;
		int numOnePlus;
		int numCitrus;
		
		numOnePlus = (int)(numCustomers * ONE_PLUS_PERCENTAGE);
		numCitrus = (int)(numOnePlus * CITRUS_PERCENTAGE);
		
		System.out.println("Number of customers purchasing one or more energy drinks per week: " + numOnePlus);
		
		System.out.println("Number of customers that prefer citrus-flavored drinks: " + numCitrus);
	}//end main
}//end class