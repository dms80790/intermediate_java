//program that determines the distance an object has fallen after a given amount of time

public class Challenge5_5{
	public static double fallingDistance(int i){
		final double GRAVITY_CONSTANT = 9.8;
		
		return .5 * GRAVITY_CONSTANT * Math.pow((i+1), 2);
	}//end fallingDistance
	
	public static void displayResult(int i, double distance){
		System.out.printf("%8d%12.1f\n", (i+1), distance);
	}//end displayResults
	
	public static void main(String[] args){
		double distance;
		
		//table setup
		System.out.printf("%8s%12s\n", "Time", "Distance");
		System.out.print("--------------------\n");
		
		//loop through 10 times
		for(int i = 0; i < 10; i++){
			distance = fallingDistance(i);
			
			//display the distance traveled at time i+1
			displayResult(i, distance);
		}//end for
	
		System.exit(0);  //exit without error
	}//end main
}//end class