//program that demonstrates the Rainfall class in Challenge7_1
import java.util.Scanner;
public class Challenge7_1Demo{
	//method that takes an integer and returns the corresponding month as a String
	public static String getMonthName(int i){
		String monthName;
		
		switch(i){
			case 0:
				monthName = "January";
				break;
			case 1:
				monthName = "February";
				break;
			case 2:
				monthName = "March";
				break;
			case 3:
				monthName = "April";
				break;
			case 4:
				monthName = "May";
				break;
			case 5:
				monthName = "June";
				break;
			case 6:
				monthName = "July";
				break;
			case 7:
				monthName = "August";
				break;
			case 8:
				monthName = "September";
				break;
			case 9:
				monthName = "October";
				break;
			case 10:
				monthName = "November";
				break;
			case 11:
				monthName = "December";
				break;
			default:
				monthName = "???";
		}//end switch
			
		return monthName;
	}//end getMonthName 
	
	public static void main(String[] args){
		final int NUM_MONTHS = 12;
		double[] months = new double[NUM_MONTHS];
		int input;
		String monthName;
	
		Scanner keyboard = new Scanner(System.in);
	
		//get the monthly data
		for(int i = 0; i < NUM_MONTHS; i++){
			//convert the index to a month name
			monthName = getMonthName(i);
			
			System.out.print("Enter the total rainfall for " + monthName + ": ");
			months[i] = keyboard.nextInt();
		}//end for
		
		//create the Rainfall object
		Challenge7_1 rainfall = new Challenge7_1(months);

		//continuous loop until user chooses option 5
		while(true){
			//formatting
			System.out.println("/nWhich data would you like:\n1. Total\n2. Average\n3. Minimum\n4. Maximum\n5. Exit");
			input = keyboard.nextInt();
			
			if(input == 1){
				System.out.println("Total Rainfall: " + rainfall.total() + "\n");
			}
			else if(input == 2){
				System.out.println("Monthly average: " + rainfall.average() + "\n");
			}
			else if (input == 3){
				System.out.println("Minimum rainfall: " + rainfall.min() + "\n");
			}
			else if (input == 4){
				System.out.println("Maximum rainfall: " + rainfall.max() + "\n");
			}
			else if (input == 5){
				System.exit(0);
			}
			else{
				System.out.println("Error. You must input a number 1-5!" + "\n");
			}
		}//end while
	}//end main
}