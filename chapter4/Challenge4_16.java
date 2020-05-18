//program that calculates how much the user is over or under their monthly budget, given their expenses

import java.util.Scanner;
public class Challenge4_16{
	public static void main(String[] args){
		double budget;
		double expense;
		
		Scanner keyboard = new Scanner(System.in);
		
		//obtain the user's monthly budget
		System.out.print("Enter your monthly budget: $");
		budget = keyboard.nextDouble();

		//obtain the user's expenses
		do{
			System.out.print("Enter expense amount (or -1 if finished): $");
			expense = keyboard.nextDouble();
			
			//subtract the expense from the user's budget
			if(expense != -1){
				budget -= expense;
			}
		}while(expense != -1);
		
		System.out.println("\nFunds remaining after expenses: $" + budget);
		
		if(budget < 0){
			System.out.println("You are overbudget. Consider reducing your expenses.");
		}
		else if(budget == 0){
			System.out.println("Your budget is balanced.");
		}
		else{
			System.out.println("You have excess funds after your expenses! Good job!");
		}
	}//end main
}//end class