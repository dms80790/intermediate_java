//program that determines a book club members' rewards for a given month based on number of books bought

import java.util.Scanner;
public class Challenge3_16{
	public static void main(String[] args){
		int numBooks;
		int points;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of books: ");
		numBooks = keyboard.nextInt();
	
		switch(numBooks){
			case 0:
				points = 0;
				break;
			case 1:
				points = 5;
				break;
			case 2:
				points = 15;
				break;
			case 3:
				points = 30;
				break;
			default:
				points = 60;
				break;
		}//end switch
		
		System.out.println("Points earned this month: " + points);
	}//end main
}//end class