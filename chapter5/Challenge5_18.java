//program that randomly generates 10 colors and asks the user to guess which color every time
//similar to challenge from chapter 4 but modularizing it into methods
import java.util.Scanner;
import java.util.Random;
public class Challenge5_18{
	public static String getColor(){
		int colorCode;
		
		Random rand = new Random();
		
		colorCode = rand.nextInt(5);
		
		switch(colorCode){
			case 0:
				return "red";
			case 1:
				return "orange";
			case 2:
				return "yellow";
			case 3:
				return "green";
			case 4:
				return "blue";
		}//end switch
		
		return "ERROR";
	}//end getColor
	
	public static String getPlayer(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter guess: ");
		return keyboard.nextLine();
	}//end getPlayer
	
	public static boolean compareGuess(String player, String cpu){
		if(player.equals(cpu)){
			return true;
		}//end if
		else{
				return false;
		}//end else
	}//end compareGuess
	
	public static void displayResults(int numCorrect){
		System.out.println("You guessed correctly " + numCorrect + " times.");
		
		if(numCorrect < 5){
			System.out.println("You need to improve your ESP skills!");
		}//end if
		else if (numCorrect < 8){
			System.out.println("Great job! You have potential!");
		}//end else if
		else{
			System.out.println("Ms. Cleo, is that you?");
		}//end else
	}//end displayResults
	
	public static void main(String[] args){
		String player, cpu;
		int numCorrect = 0;  //accumulator for correct guesses
		final int NUM_ROUNDS = 10;
	
		//welcome message
		System.out.println("Welcome to the ESP Game!");
		System.out.println("The computer will randomly select a color 10 times. Each time, you must guess the color!");
		System.out.println("The colors are: red, orange, yellow, green, and blue.");

		for(int i = 0; i < NUM_ROUNDS; i++){
			System.out.println("Round " + (i+1));
			
			cpu = getColor();
			player = getPlayer();
			
			System.out.println("The computer picked " + cpu);
			
			//check if the player guessed correctly
			if(compareGuess(player, cpu)){
				numCorrect++;
				System.out.println("Match! Current correct: " + numCorrect);
			}//end if
			else{
				System.out.println("Wrong guess -\\_O_/-");
			}//end else
				
			System.out.println("-----------------------\n");
		}//end for
	
		displayResults(numCorrect);

		System.exit(0);
	}//end main
}//end class