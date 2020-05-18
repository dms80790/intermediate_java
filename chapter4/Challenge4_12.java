//program that gets the sales for a series of days and displays the sales as a bar chart
import java.util.Scanner;
public class Challenge4_12{
	public static void main(String[] args){
		double[] sales = new double[5];
		int numAsterisks;
		
		Scanner keyboard = new Scanner(System.in);

		//obtain the sales for 5 stores
		for(int i = 0; i < 5; i ++){
			System.out.print("Enter the sales for store " + (i+1) + ": ");
			sales[i] = keyboard.nextDouble();
		}//end for
		
		//output formatting
		System.out.println("Sales Bar Chart");
		
		//display the sales for each store
		for(int i =0; i < 5; i++){
			numAsterisks = (int)(sales[i] / 100);  //integer division, one star for every $100 in sales
			
			System.out.print("Store " + (i+1) + ": ");
			
			//print out the appropriate number of asterisks
			while(numAsterisks > 0){
				System.out.print("*");
				numAsterisks --;
			}//end while
			
			System.out.println();
		}//end for
		
		System.exit(0);  //exit without error
	}//end main
}//end class