// program that gets the sum of all numbers from 1 through the user input

import java.util.Scanner;
public class Challenge4_1{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int max;
		int sum = 0;
		
		System.out.print("Enter the number to count up to: ");
		max = keyboard.nextInt();
		
		for(int i = 1; i <= max; i++){
			sum += i;
		}//end for
		
		System.out.println("Sum: " + sum);
	}//end main
}//end class