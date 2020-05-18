//program that asks the user to enter a String and a character, then returns the number of 
//times the character appears in the string

import java.util.Scanner;
public class Challenge4_4{
	public static void main(String[] args){
		String inputString;
		char myCharacter;
		int numUses = 0;  //holds the number of times the character appears in the string
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		inputString = keyboard.nextLine();
		
		System.out.print("Enter a character: ");
		myCharacter = keyboard.next().charAt(0);

		//loop through all characters in the string
		for(int i = 0; i < inputString.length(); i++){
			if(inputString.charAt(i) == myCharacter){
				numUses++;
			}//end if
		}//end for
		
		System.out.println("Number of uses: " + numUses);
	}//end main
}//end class