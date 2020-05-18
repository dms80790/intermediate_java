//program that calculates the average monthly rainfall over a given number of years
import java.util.Scanner;
public class Challenge4_8{
	public static void main(String[] args){
		int numYears;
		double monthlyRainfall;
		double totalRainfall = 0;
		double averageRainfall;
		
		Scanner keyboard = new Scanner(System.in);

		//obtain number of years until valid
		do{
			System.out.print("Enter number of years: ");
			numYears = keyboard.nextInt();

			//make sure number of years are at least 1
			if(numYears < 1){
				System.out.println("Error. Must be at least 1 year!");
			}//end if
		}while(numYears < 1);

		//loop through the years
		for(int i = 0; i < numYears; i++){
			//loop through 12 months in a year
			for(int j = 0; j < 12; j++){
				//obtain monthly rainfall until valid
				do{
					System.out.print("Enter rainfall for Year " + (i+1) + ", Month " + (j+1) + ": ");
					monthlyRainfall = keyboard.nextDouble();
					
					if(monthlyRainfall < 0){
						System.out.println("Error. Monthly rainfall must be at least 0.0.");
					}
				}while(monthlyRainfall < 0);
				
				totalRainfall += monthlyRainfall;  //add the monthlyRainfall to the total
			}//end for
		}//end for

		//calculate the average monthly rainfall
		averageRainfall = totalRainfall / (numYears * 12);
		
		//output results
		System.out.println("-------------------------------------------------");
		System.out.println("Total Rainfall (in inches): " + totalRainfall);
		System.out.printf("Average Monthly Rainfall (in inches): %.2f\n", averageRainfall);
	}//end main
}//end class