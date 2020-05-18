// program that determines if the month times the day equals the year in two-digit format

import java.util.Scanner;
public class Challenge3_2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int day, month, year;
		boolean magic = false;
		
		System.out.print("Day: ");
		day = keyboard.nextInt();
		
		System.out.print("Month: ");
		month = keyboard.nextInt();
		
		System.out.print("Year(two digits): ");
		year = keyboard.nextInt();
		
		if(day * month == year)
			magic = true;
		
		if(magic){
			System.out.println("This is a magic date!");
		}//end if
		else{
			System.out.println("This date is not magic :(");
		}//end else		
	}//end main
}//end class