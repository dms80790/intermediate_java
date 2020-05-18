//class representing lottery numbers. has a method that takes a user's picks and compares, returning the number correct.
//if all 5 correct, the user is a winner
import java.util.Random;
public class Challenge7_10{
	private int[] lotteryNumbers;;
	
	public Challenge7_10(){
		lotteryNumbers = new int[5];
		
		Random rand = new Random();
		
		//randomly generate 5 lotter numbers from 0-9
		for(int i = 0; i < 5; i++){
			lotteryNumbers[i] = rand.nextInt(10);
		}//end for
	}//end constructor
	
	public int[] getLotteryNumbers(){
		return this.lotteryNumbers;
	}
	
	public int compareTo(int[] userNumbers){
		int numMatch = 0;
		
		for(int i = 0; i < lotteryNumbers.length; i++){
			if(lotteryNumbers[i] == userNumbers[i])
				numMatch++;
		}
		
		return numMatch;
	}//end compareTo
	
	public String toString(){
		return String.format("%3d%3d%3d%3d%3d",this.lotteryNumbers[0], this.lotteryNumbers[1], this.lotteryNumbers[2], this.lotteryNumbers[3], this.lotteryNumbers[4]);
	}
}//end class