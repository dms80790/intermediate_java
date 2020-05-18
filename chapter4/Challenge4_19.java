//program that randomly generates a color 10 times and asks the user to guess each times
//after 10 rounds, the program displays the user's correct percentage
//colors: red, orange, yellow, green, blue

import java.util.Scanner;
import java.util.Random;
public class Challenge4_19{
	public static void main(String[] args){
		String guess;
		int numCorrect = 0;
		int colorNum;
		String colorName = null;
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Welcome to the ESP Calculator!");
		System.out.println("Guess the color correctly as many times as you can!");
		System.out.println("Colors include: red, orange, yellow, green, and blue.");
		System.out.println("-----------------------------------------------------");
		
		for(int i = 0; i < 10; i++){
			//generate the random color
			colorNum = rand.nextInt(5);   //0-4

			//convert color number to String
			switch(colorNum){
				case 0:
					colorName = "red";
					break;
				case 1:
					colorName = "orange";
					break;
				case 2:
					colorName = "yellow";
					break;
				case 3:
					colorName = "green";
					break;
				case 4:
					colorName = "blue";
					break;
			}//end switch
			
			System.out.print("Guess " + (i+1) + ": ");
			guess = keyboard.nextLine();

			//if the user guesses correctly, increment
			if(guess.compareTo(colorName) == 0){
				numCorrect++;
			}//end if
			
			System.out.println("Actual color: " + colorName);
		}//end for
		
		System.out.println("You guessed correctly " + numCorrect + " times!");
		System.out.println("You have an ESP score of " + (int)((numCorrect/10.0) * 100));
		
		System.exit(0);  //exit without error
	}//end main
}//end class