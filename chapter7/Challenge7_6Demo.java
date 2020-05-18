//program that demonstrates the DriverExam class from Challenge7_6
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge7_6Demo{
	public static void main(String[] args){
		final int NUM_QUESTIONS = 20;
		char[] studentAnswers = new char[NUM_QUESTIONS];
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the following answers: ");
		
		//obtain the student's answers
		for(int i = 0; i < NUM_QUESTIONS; i++){
			System.out.print((i+1) + ". ");
			studentAnswers[i] = keyboard.nextLine().charAt(0);
		}//end for

		//create a new DriverExam object
		Challenge7_6 exam = new Challenge7_6(studentAnswers);
		
		//check to see if passed
		if(exam.passed())
			System.out.println("You passed! Congratulations!");
		else
			System.out.println("Sorry, you didn't pass :(");
		
		//print out stats
		System.out.println("Number correct: " + exam.totalCorrect());
		System.out.println("Number incorrect: " + exam.totalIncorrect());
		
		System.out.print("Incorrect question numbers: ");
		//obtain list of missed questions
		ArrayList<Integer> missedQuestions = exam.questionsMissed();

		//print out missed questions in list
		for(int question: missedQuestions){
			System.out.print(question + "  ");
		}//end for	
	}//end main
}//end class