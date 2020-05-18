//class that holds the answers to a drivers exam and methods associated with scoring the exam
import java.util.ArrayList;
public class Challenge7_6{
	private final char[] correctAnswers = {'B', 'D', 'A', 'A', 'C',
								    'A', 'B', 'A', 'C', 'D',
									'B', 'C', 'D', 'A', 'D',
									'C', 'C', 'B', 'D', 'A'};

	private char[] studentAnswers;
	
	//constructor
	public Challenge7_6(char[] answers){
		this.studentAnswers = answers;
	}
	
	public boolean passed(){
		if(totalCorrect() >= 15)
			return true;
		else
			return false;
	}//end passed
	
	public int totalCorrect(){
		int total = 0;
		
		for(int i = 0; i < correctAnswers.length; i++){
			if(studentAnswers[i] == correctAnswers[i]){
				total++;
			}
		}
		
		return total;
	}//end totalCorrect
	
	public int totalIncorrect(){
		int total = 0;
		
		for(int i = 0; i < correctAnswers.length; i++){
			if(studentAnswers[i] != correctAnswers[i]){
				total++;
			}
		}
		
		return total;
	}//end totalIncorrect
	
	public ArrayList<Integer> questionsMissed(){
		ArrayList<Integer> missedQuestions = new ArrayList<Integer>();
		
		for(int i = 0; i < correctAnswers.length; i++){
			if(studentAnswers[i] != correctAnswers[i]){
				missedQuestions.add(i+1);
			}
		}
		
		return missedQuestions;
	}//end questionsMissed
}//end class