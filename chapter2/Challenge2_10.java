// program that calculates the average of three user-input test scores

import java.util.Scanner;
public class Challenge2_10{
	public static void main(String[] args){
		int test1, test2, test3;
		double average;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Score 1: ");
		test1 = keyboard.nextInt();
		
		System.out.print("Score 2: ");
		test2 = keyboard.nextInt();
		
		System.out.print("Score 3: ");
		test3 = keyboard.nextInt();
		
		//calculate the average of the three tests
		average = (test1 + test2 + test3) / 3.0;
		
		System.out.println("Average: " + average);
	
	}//end main
}//end class