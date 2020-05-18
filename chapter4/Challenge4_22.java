//program that simulates a slot machine
import java.util.Random;
import java.util.Scanner;
public class Challenge4_22{
	public static void main(String[] args){
		double bet;    //individual bet amount
		double total = 0;  //total amount bet
		double totalWinnings = 0;  //amount won
		double winLoss = 0;   //winnings - amount bet
		int[] slots = new int[3];
		String[] slotNames = new String[3];
		String playAgain;
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("*****  *****  *****  *****      *****  *****  *****  *  *****  *****");
		System.out.println("*      *   *  *   *    *        *      *   *  *      *  *   *  *   *");
		System.out.println("* ***  *   *  *****    *        *      *****  *****  *  *   *  *   *");
		System.out.println("*   *  *   *  *   *    *        *      *   *      *  *  *   *  *   *");
		System.out.println("*****  *****  *   *    *        *****  *   *  *****  *  *   *  *****");
		System.out.println("");
		System.out.println("********************************************************************");
		
		do{
			System.out.print("Enter bet amount: $");
			bet = keyboard.nextDouble();
			
			total += bet;  //increase total amount bet
			winLoss -= bet;  //decrease win/loss ratio by bet amount
			
			//generate 3 random slots
			for(int i = 0; i < 3; i++){
				slots[i] = rand.nextInt(5);
				
				switch(slots[i]){
					case 0:
						slotNames[i] = "cherry";
						break;
					case 1:
						slotNames[i] = "orange";
						break;
					case 2:
						slotNames[i] = "plum";
						break;
					case 3:
						slotNames[i] = "melon";
						break;
					case 4:
						slotNames[i] = "bar";
						break;
				}
				
				System.out.println("\t[" + i + "]" + slotNames[i]);
			}
			
			//winner winner chicken dinner
			if(slots[0] == slots[1] && slots[0] == slots[2]){
				totalWinnings += 2 * bet;
				winLoss += 2 * bet;
				System.out.println("\nWinner winner chicken dinner! Straight Cash Homie!!!");
			}
			else{
				System.out.println("\nYou lose. Stop gambling you fucking addict.");
			}
			
			//consume newLine
			keyboard.nextLine();
			
			System.out.print("Play again?: ");
			playAgain = keyboard.nextLine();
			
			System.out.println("-------------------------------------------------");
		}while(playAgain.equals("yes"));
		
		//print final results
		System.out.println("\tTotal amount bet: $" + total);
		System.out.println("\tTotal amount won: $" + totalWinnings);
		System.out.println("\tWin/Loss ratio: $" + winLoss);
		System.out.println();
	}//end main
}//end class