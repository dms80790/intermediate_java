//random number guessing game
import java.util.Scanner;
import java.util.Random;

public class Challenge4_17{
	public static void main(String[] args){
		int number;
		int guess;
		int numGuesses = 0;
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		//generate the random number from 1-100
		number = rand.nextInt(100) + 1;
		
		do{
			//get user guess
			System.out.print("Guess a number 1-100: ");
			guess = keyboard.nextInt();
		
			numGuesses ++;  //increment the number of guesses
			
			//if incorrect, give user hint on where to guess next
			if(guess < number){
				System.out.println("You guessed too low, try again!");
			}//end if
			else if(guess > number){
				System.out.println("You guessed too high, try again!");
			}//end else
		}while(guess != number);

		//display final results
		System.out.println("You guessed the correct number!");
		System.out.println("Number of guesses: " + numGuesses);
		
		System.exit(0);  //exit without error
	}//end main
}//end class