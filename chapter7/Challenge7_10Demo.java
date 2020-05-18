//program demonstrating the Lottery class for Challenge7_10
import java.util.Scanner;
public class Challenge7_10Demo{
	public static void main(String[] args){
		int[] userNumbers = new int[5];
		int numMatch;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your 5 numbers: ");
		
		//obtain user lottery numbers
		for(int i = 0; i < userNumbers.length; i++){
			userNumbers[i] = keyboard.nextInt();
		}//end for
		
		//create a new lottery object
		Challenge7_10 lotteryNumbers = new Challenge7_10();
		
		//see how many match
		numMatch = lotteryNumbers.compareTo(userNumbers);
		
		System.out.println("Correct numbers: " + lotteryNumbers.toString());
		
		System.out.println("Matching numbers: " + numMatch);
		
		if(numMatch == lotteryNumbers.getLotteryNumbers().length)
			System.out.println("WINNER!!!!");
		else
			System.out.println("Maybe next time!");
		
	}//end main
}//end class