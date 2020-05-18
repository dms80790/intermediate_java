// program that calculates the percentages of male and female students in a class

import java.util.Scanner;
public class Challenge2_14{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		int numFemale;
		int numMale;
		int totalStudents;
		
		double percentFemale;
		double percentMale;
		
		System.out.print("Number of females: ");
		numFemale = keyboard.nextInt();
		
		System.out.print("Number of males: ");
		numMale = keyboard.nextInt();
		
		totalStudents = numFemale + numMale;
		
		percentFemale = 100 * (numFemale / (double)totalStudents);
		percentMale = 100 * (numMale / (double)totalStudents);
		
		System.out.println("Percent female: " + percentFemale);
		System.out.println("Percent male: " + percentMale);
	}//end main
}//end class