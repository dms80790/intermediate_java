//program that iterates 10 die rolls for the computer and the user
//the die with the highest value wins

import java.util.Random;
public class Challenge4_21{
	public static void main(String[] args){
		Random rand = new Random();
		int userWins = 0;
		int cpuWins = 0;
		int cpuRoll;
		int userRoll;
		
		//iterate through 10 rolls
		for(int i = 0; i < 10; i++){
			//generate random roll numbers
			cpuRoll = rand.nextInt(6) + 1;
			userRoll = rand.nextInt(6) + 1;
			
			//display the roll values
			System.out.println("Round " + (i+1) + ":");
			System.out.println("User: " + userRoll);
			System.out.println("CPU: " + cpuRoll);
			
			//user wins, increment score
			if(userRoll > cpuRoll){
				userWins++;
			}
			//cpu wins
			else if(userRoll < cpuRoll){
				cpuWins++;
			}			
		}//end for
		
		//display the results
		if(userWins > cpuWins){
			System.out.println("\nCongratulations, you won " + userWins + "-" + cpuWins + "!");
		}
		else if(userWins < cpuWins){
			System.out.println("\nThe computer won " + cpuWins + "-" + userWins + ". Tough luck!");
		}
		else
			System.out.println("\nDraw, " + userWins + "-" + cpuWins + ". Play again.");
		
		System.exit(0);  //exit without error
	}//end main
}//end class