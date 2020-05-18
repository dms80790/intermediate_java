/*
Write a program that is initialized with test data and has the following methods, and display them
• getTotal. This method should accept a one-dimensional array as its argument and
return the total of the values in the array.
• getAverage. This method should accept a one-dimensional array as its argument and
return the average of the values in the array.
• getHighest. This method should accept a one-dimensional array as its argument and
return the highest value in the array.
• getLowest. This method should accept a one-dimensional array as its argument and
return the lowest value in the array.
Demonstrate each of the methods in the program.
*/
public class Challenge7_11{
	public static int getTotal(int[] numbers){
		int total = 0;
		
		//loop through all values and add to total
		for(int num: numbers){
			total += num;
		}
		
		return total;
	}//end getTotal
	
	public static double getAverage(int[] numbers){
		return (getTotal(numbers) / (double)numbers.length);
	}//end getAverage
	
	public static int getHighest(int[] numbers){
		//set the current high value as the first one in the numbers array
		int high = numbers[0];

		//compare remaining array values to current high value
		for(int i = 1; i < numbers.length; i++){
			if(numbers[i] > high){
				high = numbers[i];
			}
		}//end for
		
		return high;
	}//end getHighest
	
	public static int getLowest(int[] numbers){
		//set the current low value as the first one in the numbers array
		int low = numbers[0];

		//compare remaining array values to current low value
		for(int i = 1; i < numbers.length; i++){
			if(numbers[i] < low){
				low = numbers[i];
			}
		}//end for
		
		return low;
	}//end getLowest
	
	public static void main(String[] args){
		//initialize an array
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		//display array contents
		for(int i = 0; i < numbers.length; i++){
			if(i != numbers.length - 1)	
				System.out.print(numbers[i] + ", ");
			else
				System.out.print(numbers[i]);
		}//end for
		
		//get the total
		System.out.println("\nTotal: " + getTotal(numbers));
		
		//display the average
		System.out.println("Average: " + getAverage(numbers));
		
		//display the highest value
		System.out.println("Max: " + getHighest(numbers));
		
		//display the minimum value
		System.out.println("Min: " + getLowest(numbers));
	}//end main	
}//end class