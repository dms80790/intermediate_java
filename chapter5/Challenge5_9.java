//program that takes time and speed as arguments and returns the distance traveled
import java.util.Scanner;
public class Challenge5_9{
	public static void main(String[] args){
		double speed;
		double time;
		double distance;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the speed (in mi/hr): ");
		speed = keyboard.nextDouble();
		
		System.out.print("Enter the time traveled (in hours): ");
		time = keyboard.nextDouble();
		
		distance = getDistance(time, speed);
		
		System.out.println("Distance traveled: " + distance + " miles");
	}//end main
	
	public static double getDistance(double time, double speed){
		return speed * time;
	}//end getDistance
}//end class