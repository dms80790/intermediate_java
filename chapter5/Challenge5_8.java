//program that asks the user to enter a length in meters and converts it to km, ft, or inches
import java.util.Scanner;
public class Challenge5_8{
	public static void showKilometers(double meters){
		double km = meters * .001;
		
		System.out.println(meters + " meters is " + km + " kilometers.\n");
	}//end showKilometers
	
	public static void showInches(double meters){
		double inches = meters * 39.37;
		
		System.out.println(meters + " meters is " + inches + " inches.\n");
	}//end showInches
	
	public static void showFeet(double meters){
		double feet = meters * 3.281;
		
		System.out.println(feet + " meters is " + feet + " feet.\n");
	}//end showFeet
	
	public static void main(String[] args){
		double meters;
		int choice = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a distance in meters: ");
		meters = keyboard.nextDouble();
		
		while(true){
			System.out.println("1. Convert to kilometers\n" +
							   "2. Convert to inches\n" +
							   "3. Convert to feet\n" +
							   "4. Exit\n");
			
			do{
				System.out.print("Enter your choice: ");
				choice = keyboard.nextInt();
				
				switch(choice){
					case 1:
						showKilometers(meters);
						break;
					case 2:
						showInches(meters);
						break;
					case 3:
						showFeet(meters);
						break;
					case 4:
						System.out.println("Thanks for using the Conversion Program!");
						System.exit(0);
					default:
						System.out.println("Invalid choice. Enter a number 1-4.");
				}//end switch
			}while(choice < 1 || choice > 4);
		}//end while
	}//end main
}//end class