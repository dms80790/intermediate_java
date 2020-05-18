//class that simulates a grade book
public class Challenge7_8{
	private String[] names;
	private double[][] gradeBook;

	//constructor
	public Challenge7_8(String[] names, double[][] gradeBook){
		this.names = names;
		this.gradeBook = gradeBook;
	}//end constructor

	//returns the student's average test score
	public double getAverage(String name){
		int total = 0;  //accumulator for scores
		double low;
		double average;
		
		//find the index of the student
		int index = 0;
		
		for(int i = 0; i < names.length; i++){
			if(names[i].equals(name)){
				index = i;
				break;
			}
		}
		
		low = gradeBook[index][0];
		
		//now that we know the index, add up all the student's test grades
		for(int i = 0; i < gradeBook[index].length; i++){
			if(gradeBook[index][i] < low)
				low = gradeBook[index][i];
			
			total += gradeBook[index][i];
		}
		
		//remove lowest grade
		total -= low;
		average = total / (gradeBook[index].length - 1.0);
		
		return average;
	}//end getAverage
	
	//returns the letter grade for the given student
	public char getLetterGrade(String name){
		char letterGrade;
		
		double average;
		
		//get the average score for the student
		average = getAverage(name);
		
		if(average < 60){
			letterGrade = 'F';
		}
		else if(average < 70){
			letterGrade = 'D';
		}
		else if(average < 80){
			letterGrade = 'C';
		}
		else if(average < 90){
			letterGrade = 'B';
		}
		else
			letterGrade = 'A';
		
		return letterGrade;
	}//end getLetterGrade
}//end class