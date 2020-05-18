//write a program that determines the present value of money you'd need to invest in order to achieve a future final value
//using the present value equation P = F / (1+r)^need
import java.util.Scanner;
public class Challenge5_16{
	public static double presentValue(double future, double rate, int years){
		return future / (Math.pow((1 + rate), years));   //present value formula
	}//end presentValue

	public static void main(String[] args){
		double future, rate, present;
		int years;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the final value: $");
		future = keyboard.nextDouble();
		
		System.out.print("Annual interest rate: ");
		rate = keyboard.nextDouble();
		
		System.out.print("Number of years: ");
		years = keyboard.nextInt();
		
		present = presentValue(future, rate, years);
		
		System.out.println("Present value: $" + present);
		
		System.exit(0);
	}//end main
}//end class