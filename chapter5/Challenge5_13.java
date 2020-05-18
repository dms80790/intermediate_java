//write a program with a method called isPrime that takes an integer and returns true if the number is prime
import java.util.Scanner; //user input
public class Challenge5_13{
	public static boolean isPrime(int num){
		for(int i = 2; i < (num /2.0); i++){
			if(num % i == 0){
				return false;
			}
		}
		
		//number is prime
		return true;
	}//end isPrime
	
	public static void main(String[] args){
		int num;
		boolean prime;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = keyboard.nextInt();
		
		prime = isPrime(num);
		
		//print result
		if(prime || num == 1 || num == 2 || num == 3){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime");
		}
		
	}//end main
}//end class