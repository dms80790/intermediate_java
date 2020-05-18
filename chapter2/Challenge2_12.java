// ask user to input their favorite city then do string manipulations to display its characteristics

import java.util.Scanner;
public class Challenge2_12{
	public static void main(String[] args){
		String city;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Name of your favorite city: ");
		city = keyboard.nextLine();
		
		System.out.println(city.length());
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println(city.charAt(0));
	}//end main
}//end class