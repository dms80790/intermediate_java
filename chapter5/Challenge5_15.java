//program that generates 100 random numbers and then determines how many of them are even and how many odd
import java.util.Random;
public class Challenge5_15{
	public static boolean isEven(int num){
		if(num % 2 == 0)
			return true;
		
		return false;  //if not even, must be odd
	}//end isEven
	
	public static void main(String[] args){
		int num;
		int numEven = 0;
		boolean even;
		
		Random rand = new Random();
		
		//generate the 100 random numbers
		for(int i = 0; i < 100; i++){
			num = rand.nextInt(1000);

			//print the randomly-generated number
			System.out.printf("%-8d", num);

			//determine if the number is even
			even = isEven(num);

			//if the number is even, increment the number of even numbers
			if(even){
				numEven++;
				System.out.println("Even");
			}//end if
			else{
				System.out.println("Odd");
			}//end else
		}//end for
		
		//print final tallies
		System.out.println("Number even: " + numEven);
		System.out.println("Number odd: " + (100-numEven));
		
		System.exit(0);
	}//end main
}//end class