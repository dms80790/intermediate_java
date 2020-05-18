//program that calculates an object's kinetic energy
//ke = .5 * mass * velocity^2
//units = kg*m^2/s^2 (Joule)
import java.util.Scanner;
public class Challenge5_12{
	public static double getKineticEnergy(double mass, double velocity){
		return .5 * mass * Math.pow(velocity, 2);
	}//end getKineticEnergy
	
	public static void main(String[] args){
		double mass, velocity, energy;
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter mass: ");
		mass = keyboard.nextDouble();
		
		System.out.print("Enter velocity: ");
		velocity = keyboard.nextDouble();
		
		//calculate the kinetic energy
		energy = getKineticEnergy(mass, velocity);
		
		//output results
		System.out.println("Kinetic energy: " + energy);
	
		System.exit(0);
	}//end main
}//end class