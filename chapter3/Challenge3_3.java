//program that determines a person's bmi

import java.util.Scanner;
public class Challenge3_3{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		double height, weight, bmi;
		
		System.out.print("Height(inches): ");
		height = keyboard.nextDouble();
		
		System.out.print("Weight(pounds): ");
		weight = keyboard.nextDouble();
		
		bmi = weight * 703 / (height * height);
		
		if(bmi < 18.5)
			System.out.println("Your bmi is " + bmi + ". You are underweight.");
		else if(bmi >= 18.5 && bmi <= 25)
			System.out.println("Your bmi is " + bmi + ". You are optimal weight!");
		else
			System.out.println("Your bim is " + bmi + ". You are overweight. :(");
	}//end main
}//end class