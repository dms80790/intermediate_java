//program that predicts the population size over time, given starting population, growth rate,
//and number of days the population will growth
import java.util.Scanner;
import java.lang.Math;
public class Challenge4_9{
	public static void main(String[] args){
		int startSize;
		int numDays;
		double growthRate;
		
		int population = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		//get starting population
		do{
			System.out.print("Enter the starting population: ");
			startSize = keyboard.nextInt();
		
			//input validation
			if(startSize < 2){
				System.out.println("Error. The start size must be greater than 2.");
			}//end if
		}while(startSize < 2);
		
		//get growth rate
		do{
			System.out.print("Enter the growth rate: ");
			growthRate = keyboard.nextDouble();
			
			//input validation
			if(growthRate < 0){
				System.out.println("Error. Growth rate cannot be negative!");
			}//end if
		}while(growthRate < 0);

		//get number of days
		do{
			System.out.print("Enter the number of days: ");
			numDays = keyboard.nextInt();
			
			//input validation
			if(numDays < 1){
				System.out.println("Error. Must be at least 1 day!");
			}//end if
		}while(numDays < 1);
		
		//table format
		System.out.printf("\n%8s%16s\n", "Day", "Population");
		System.out.printf("------------------------\n");
		
		//project the population for every day and display the results
		for(int i = 0; i < numDays; i++){
			population = (int)(startSize*Math.pow((1+growthRate), i));
			
			System.out.printf("%8d%16d\n", (i+1), population);
		}//end for
		
	}//end main	
}//end Challenge4_9