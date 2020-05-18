//program that demonstrates the Payroll class from Challenge 7_2
import java.util.Scanner;
public class Challenge7_2Demo{
	public static void main(String[] args){
		int[] employees = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
		int currentEmployee;
		int currentHours;
		double currentRate;
		
		Scanner keyboard = new Scanner(System.in);
		
		//create a new Payroll object
		Challenge7_2 payroll = new Challenge7_2(employees);
		
		//display all employee ids and enter hours and wages
		for(int i = 0; i < employees.length; i++){
			System.out.println(payroll.getEmployeeID(i));
			
			System.out.print("Enter hours: ");
			payroll.setHours(i, keyboard.nextInt());
			
			System.out.print("Enter pay rate: ");
			payroll.setPayRate(i, keyboard.nextDouble());			
		}//end for
		
		//display all employee wages
		System.out.println("\nWages:");
		for(int i = 0; i < employees.length; i++){
			System.out.println(payroll.getEmployeeID(i) + ": $" + payroll.getIndividualWages(payroll.getEmployeeID(i)));
		}//end for
	}//end main
}//end class