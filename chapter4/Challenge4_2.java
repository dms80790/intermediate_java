// program that shows the distance traveled for every hour given a speed and time traveled

import java.util.Scanner;
public class Challenge4_2{
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		int speed, time, distance;
		
		System.out.print("Enter speed: ");
		speed = keyboard.nextInt();
		
		if(speed < 0){
			System.out.println("Must enter a non-negative speed!");
			System.exit(1);   //exit with error
		}
		
		System.out.print("Enter time traveled: ");
		time = keyboard.nextInt();

		if(time < 1){
			System.out.println("Must enter a of at least 1!");
			System.exit(1);   //exit with error
		}
		
		System.out.printf("%-12s%18s\n", "Hour", "Distance Traveled");
		System.out.printf("%30s\n", "------------------------------");
		
		for(int i = 1; i <= time; i++){
			distance = i * speed;
			System.out.printf("%-12d%18d\n", i, distance);
		}
	}//end main
}//end class