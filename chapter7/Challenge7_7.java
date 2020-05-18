//write a program that stores 4 quarterly earnings for 6 divisions of a company, utilizing a 2dimensional array.  Also provide summary statistics
import java.util.Scanner;
public class Challenge7_7{
	public static void main(String[] args){
		final int NUM_DIVISIONS = 6;
		final int NUM_QUARTERS = 4;
		double previousSales = 0.0;  //stores previous quarter company sales
		int high = 0;
		double[][] salesFigures = new double[NUM_DIVISIONS][NUM_QUARTERS];
	
		Scanner keyboard = new Scanner(System.in);
		
		//fill out the array with sales information
		//loop through divisions
		for(int i = 0; i < NUM_DIVISIONS; i++){
			//loop through quarters for the division
			for(int j = 0; j < NUM_QUARTERS; j++){
				System.out.print("Enter sales for division " + (i+1) + ", Quarter " + (j+1) + ": ");
				
				salesFigures[i][j] = keyboard.nextDouble();
			}//end quarter for
		}//end division for
		
		//print out data for each quarter
		for(int j = 0; j < NUM_QUARTERS; j++){
			double totalSales = 0.0;  //quarterly accumulator
			
			//formatting
			System.out.println("--------------------------------------------");
			
			System.out.println("Quarter " + (j+1) + " metrics:\n");
			
			//sales figures by division
			System.out.println("Sales figures by division:");
			for(int i = 0; i < NUM_DIVISIONS; i++){
				System.out.println("\tDivision " + (i+1) + ": $" + salesFigures[i][j]);
			}//end for
			
			//show increase for each division from prior qtr, excluding 1st qtr
			if(j > 0){
				for(int i = 0; i < NUM_DIVISIONS; i++){
					System.out.println("Division " + (i+1) + " change in profit: $" + (salesFigures[i][j] - salesFigures[i][j-1]));
				}//end for
			}//end if
			
			//total sales for the quarter
			for(int i = 0; i < NUM_DIVISIONS; i++){
				totalSales += salesFigures[i][j];
				
			}//end for
			
			System.out.println("Total company sales: $" + totalSales);
			
			
			//show increase for company from prior qtr, excluding 1st qtr
			if(j > 0){	
				System.out.println("Company change in profit: $" + (totalSales - previousSales));
			}//end if
			
			//average sales for all divisions this quarter
			System.out.println("Average sales per division, quarter " + (j+1) + ": $" + String.format("%.2f", (totalSales / NUM_DIVISIONS)));
			
			//division with highest sales this quarter
			for(int i = 0; i < NUM_DIVISIONS; i++){
				if(salesFigures[i][j] > salesFigures[high][j])
					high = i;
			}//end for
			
			System.out.println("Highest Division: " + (high+1));
			
			previousSales = totalSales;  //store the current sales as previousSales, for use next quarter
		}//end for
	}//end main
}//end class