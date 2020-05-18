//program that displays a square with dimensions of 1-15, based on user input
import java.util.Scanner;
public class Challenge4_20{
	public static void main(String[] args){
		int input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the size of the square (1-15): ");
		input = keyboard.nextInt();

		//print the number of rows
		for(int i = 0; i < input; i++){
			//print the stars for the row
			for(int j = 0; j < input; j++){
				System.out.print("*");
			}//end inner for
			
			System.out.println();  //go to the next line
		}//end outer for	
	}//end main
}//end class