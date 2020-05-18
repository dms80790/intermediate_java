//write a program that calculates and displays the amount of sales for a given year

public class Challenge2_5{
	public static void main(String[] args){
		final double SALES_PERCENTAGE = 0.62;
		double total_sales = 4600000;
		double division_sales;
		
		division_sales = total_sales * SALES_PERCENTAGE;
		
		System.out.println("Total company sales: $" + total_sales);
		System.out.println("East coast sales: $" + division_sales);
		
	}//end main
}//end class