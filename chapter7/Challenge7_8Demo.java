//program that demonstrates the GradeBook class in Challenge7_8
import java.util.Scanner;
public class Challenge7_8Demo{
	public static void main(String[] args){
		String[] names = new String[5];
		double[][] grades = new double[5][4];
		
		Scanner keyboard = new Scanner(System.in);

		//enter all student names
		for(int i = 0; i < names.length; i++){
			System.out.print("Enter student name: ");
			
			names[i] = keyboard.nextLine();
		}//end for
		
		//enter student test scores
		for(int i = 0; i < grades.length; i++){
			for(int j = 0; j < grades[i].length; j++){
				System.out.print("Enter grade " + (j+1) + " for " + names[i] + ": ");
				
				grades[i][j] = keyboard.nextDouble();
			}//end grade for
			
			//formatting
			System.out.println();
		}//end student for
		
		//create the GradeBook object
		Challenge7_8 gradebook = new Challenge7_8(names, grades);
		
		//display average score and letter grade for each student
		System.out.printf("%-25s%10s%10s\n", "Name", "Average", "Grade");
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i < names.length; i++){
			System.out.printf("%-25s%10.2f%10s\n", names[i], gradebook.getAverage(names[i]), gradebook.getLetterGrade(names[i]));
		}
	}//end main
}//end class