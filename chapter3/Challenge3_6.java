// program that converts seconds into the appropriate minutes, days, and hours

import java.util.Scanner;
public class Challenge3_6{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int seconds;
		
		System.out.print("Enter number of seconds: ");
		seconds = keyboard.nextInt();
		
		if(seconds >= 60){
			double minutes = seconds / 60.0;
			System.out.println("Minutes: " + minutes);
		}//end if
		
		if(seconds >= 3600){
			double hours = seconds / 3600.0;
			System.out.println("Hours: " + hours);
		}//end if
		
		if(seconds >= 86400){
			double days = seconds / 86400.0;
			System.out.println("Days: " + days);
		}//end if
	}//end main
}//end class