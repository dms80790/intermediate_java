//program that demonstrates the Validation class in Challenge 7_3
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Challenge7_3Demo{
	public static void main(String[] args){
		boolean valid;
		
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Integer> accounts = new ArrayList<>(Arrays.asList(5658845, 4520125, 7895122,
							  8777541, 8451277, 1302850,
							  8080152, 4562555, 5552012,
							  5050552, 7825877, 1250255,
							  1005231, 6545231, 3852085,
							  7576651, 7881200, 4581002));
		
		Challenge7_3 validator = new Challenge7_3(accounts);
		
		System.out.print("Enter an account number: ");
		valid = validator.validate(keyboard.nextInt());
		
		if(valid){
			System.out.println("Account number valid!");
		}
		else{
			System.out.println("Account not found.");
		}
		
		System.exit(0);  //exit without error
	}//end main
}//end class