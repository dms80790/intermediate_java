// program that determines an object's mass
//Note: F = ma
// F in Newtons (kg*m/(s^2))
import java.util.Scanner;
public class Challenge3_5{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		final double ACC_GRAVITY = 9.8;
		double weight;
		double mass;
		
		System.out.print("Mass: ");
		mass = keyboard.nextDouble();
		
		weight = mass * ACC_GRAVITY;
		
		System.out.println("Weight in Newtons: " + weight);
		if(weight > 1000)
			System.out.println("The object is too heavy!");
		else if(weight < 10)
			System.out.println("The object is too light!");
	}//end main
}//end class