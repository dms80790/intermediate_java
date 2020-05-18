//program that asks the user for 5 test scores and returns the average and letter grade
import java.util.Scanner;
public class Challenge5_7{
	public static double getAverage(double[] scores){
		double total = 0;
		
		for(int i = 0; i < scores.length; i++){
			total += scores[i];
		}//end for
		
		return total / 5.0;  //average of test scores
	}//end getAverage

	public static char getLetterGrade(double score){
		if(score < 60){
			return 'F';
		}
		else if(score < 70){
			return 'D';
		}
		else if(score < 80){
			return 'C';
		}
		else if(score < 90){
			return 'B';
		}
		else{
			return 'A';
		}
	}//end getLetterGrade
	
	public static void displayResults(double[] scores, char[] grades, double average, char totalGrade){
		for(int i = 0; i < scores.length; i++){
			System.out.printf("%8.0f%8s\n", scores[i], grades[i]);
		}//end for
		
		System.out.printf("\nAverage score: %8.2f\n", average);
		System.out.println("Average letter grade: " + totalGrade);
	}//end displayResult
	
	public static void main(String[] args){
		double[] scores = new double[5];
		char[] grades = new char[5];
		double average;
		char totalGrade;
		
		Scanner keyboard = new Scanner(System.in);
		
		//welcome
		System.out.println("Test Score Calculator");
		System.out.println("---------------------");
	
		//obtain 5 test scores
		for(int i = 0; i < 5; i++){
			System.out.print("Enter test score " + (i+1) + ": ");
			scores[i] = keyboard.nextDouble();
			
			//get the letter grade
			grades[i] = getLetterGrade(scores[i]);
		}//end for

		//calculate average score
		average = getAverage(scores);
		
		//get average letter grade
		totalGrade = getLetterGrade(average);
		
		//display the scores, grade, and average
		displayResults(scores, grades, average, totalGrade);
	
		System.exit(0);  //exit without error
	}//end main
}//end Challenge5_7