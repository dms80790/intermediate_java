//program that has a method accepting a String literal and an integer
//program displays the character at that position
import java.util.Scanner;
public class Challenge5_1{
	public static void main(String[] args){
		String word;
		int position;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		word = keyboard.nextLine();
		
		System.out.print("Enter a character position: ");
		position = keyboard.nextInt();

		//formatting
		System.out.println();
		
		//call the method that displays the character at the given position of the word
		showChar(word, position);
		
		System.exit(0);
	}//end main
	
	/**
		@param word.. the string under consideration
		@param position.. the position of the character in the string
		@return void
	*/
	public static void showChar(String word, int position){
		char positionCharacter;
		
		positionCharacter = word.charAt(position);
		
		//display the character
		System.out.println("Character at position " + position + ": " + positionCharacter);
	}//end showChar
}//end class