//class that demonstrates the Phone Book Entry class, which is in Challenge7_17
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge7_17Demo{
	public static void main(String[] args){
		String name;
		String number;
		
		Scanner keyboard = new Scanner(System.in);
		
		//create an ArrayList to hold the phone book entries
		ArrayList<Challenge7_17> phoneBook = new ArrayList<>();
		
		//create 5 phone book entries
		for(int i = 0; i < 5; i++){
			System.out.print("Enter name " + (i+1) + ": ");
			name = keyboard.nextLine();
			
			System.out.print("Enter phone number " + (i+1) + ": ");
			number = keyboard.nextLine();
			
			phoneBook.add(new Challenge7_17(name, number));
		}//end for
		
		//display the contents of all entries in the ArrayList
		for(int i = 0; i < phoneBook.size(); i++){
			System.out.println(phoneBook.get(i).getName() + "\t" + phoneBook.get(i).getNumber());
		}
		
		
		//a couple extra tests
		System.out.println(phoneBook.indexOf("Dave"));  //returns -1
		
		Challenge7_17 person = new Challenge7_17("person", "1241412");   //need an object reference to use indexOf... arrayList isn't a dictionary
		phoneBook.add(2, person);  //inserting into index 2.. all other entries move down
		
		System.out.println(phoneBook.indexOf(person));   //returns 2
	}//end main
}//end class