//program that has a method which accepts two arguments: an array and an integer n
//the method should display all array elements larger than n
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge7_5{
	public static ArrayList<Integer> largerThanN(int[] numbers, int min){
		ArrayList<Integer> largeArray = new ArrayList<>();
		
		for(int num: numbers){
			if(num > min){
				largeArray.add(num);
			}//end if
		}//end for
		
		return largeArray;
	}//end largerThanN

	public static void main(String[] args){
		int[] array = new int[10];
		int min;
		ArrayList<Integer> largeArray;
		
		Scanner keyboard = new Scanner(System.in);
		
		//fill in the array with values
		for(int i = 0; i < array.length; i++){
			System.out.print("Enter number " + (i+1) + ": ");
			array[i] = keyboard.nextInt();
		}//end for

		//get the minimum value
		System.out.print("Enter minimum value: ");
		min = keyboard.nextInt();
		
		//get all numbers in the array larger than given value
		largeArray = largerThanN(array, min);
		
		System.out.println("Numbers in the array larger than " + min + ":");
		
		//print out all numbers larger than minimum value
		for(int num: largeArray){
			System.out.println(num);
		}//end for
	}//end main
}//end class