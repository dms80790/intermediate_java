// program that determines the average grade on three tests and outputs the letter grade

import java.util.Scanner;
public class Challenge3_4{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int test1, test2, test3;
		double average;
		
		System.out.print("Test 1 score: ");
		test1 = keyboard.nextInt();
		System.out.print("Test 2 score: ");
		test2 = keyboard.nextInt();
		System.out.print("Test 3 score: ");
		test3 = keyboard.nextInt();
		
		average = (test1 + test2 + test3) / 3.0;
		System.out.println("Numerical average: " + average);
		
		if(average >= 90)
			System.out.println("Letter Grade: A");
		else if(average >= 80)
			System.out.println("Letter Grade: B");
		else if(average >= 70)
			System.out.println("Letter Grade: C");
		else if(average >= 60)
			System.out.println("Letter Grade: D");
		else
			System.out.println("Letter Grade: F");
	}//end main
}//end class