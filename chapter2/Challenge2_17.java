// cookie recipe ingredient calculator

import java.util.Scanner;
public class Challenge2_17{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int numCookies;
		double cupsSugarPerCookie = 1.5 / 48;
		double cupsButterPerCookie = 1.0 / 48;
		double cupsFlourPerCookie = 2.75 / 48;
		
		double sugarNeeded;
		double butterNeeded;
		double flourNeeded;
		
		//prompt the user for the number of cookies to make
		System.out.print("How many cookies would you like to make? ");
		numCookies = keyboard.nextInt();

		//calculate the amounts of ingredients
		sugarNeeded = numCookies * cupsSugarPerCookie;
		butterNeeded = numCookies * cupsButterPerCookie;
		flourNeeded = numCookies * cupsFlourPerCookie;
		
		System.out.println("------Ingredients Needed-----");
		System.out.println("Sugar: " + sugarNeeded);
		System.out.println("Butter: " + butterNeeded);
		System.out.println("Flour: " + flourNeeded);
	}//end main
}//end class