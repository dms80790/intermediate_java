/*Write a program that creates a two-dimensional array initialized with test data. Use any
primitive data type that you wish. The program should have the following methods:
• getTotal. This method should accept a two-dimensional array as its argument and
return the total of all the values in the array.
• getAverage. This method should accept a two-dimensional array as its argument and
return the average of all the values in the array.
• getRowTotal. This method should accept a two-dimensional array as its first argument
and an integer as its second argument. The second argument should be the subscript
of a row in the array. The method should return the total of the values in the
specified row.
• getColumnTotal. This method should accept a two-dimensional array as its first argument
and an integer as its second argument. The second argument should be the subscript
of a column in the array. The method should return the total of the values in the
specified column.
• getHighestInRow. This method should accept a two-dimensional array as its first
argument and an integer as its second argument. The second argument should be the
subscript of a row in the array. The method should return the highest value in the
specified row of the array.
• getLowestInRow. This method should accept a two-dimensional array as its first argument
and an integer as its second argument. The second argument should be the subscript
of a row in the array. The method should return the lowest value in the specified
row of the array.
*/
public class Challenge7_16{
	public static int getTotal(int[][] numbers){
		int total = 0;
		
		//loop through all values and add to total
		for(int row = 0; row < numbers.length; row++){
			for(int col= 0; col < numbers[row].length; col++){
				total += numbers[row][col];
			}//end col for
		}//end row for
		
		return total;
	}//end getTotal
	
	public static double getAverage(int[][] numbers){
		return (getTotal(numbers) / ((double)numbers.length * numbers[0].length));
	}//end getAverage
	
	public static int getRowTotal(int row, int[][] numbers){
		row = row -1;
		
		int total = 0;
		
		//loop through all values and add to total
		for(int col = 0; col < numbers[row].length; col++){
			total += numbers[row][col];
		}//end for
		
		return total;
	}//end getRowTotal
	
	public static int getColumnTotal(int col, int[][] numbers){
		col = col-1;
		
		int total = 0;
		
		//loop through all values and add to total
		for(int row = 0; row < numbers.length; row++){
			total += numbers[row][col];
		}//end for
		
		return total;
	}//end getColumnTotal
	
	public static int getRowHighest(int row, int[][] numbers){
		row = row -1;
		//set the current low value as the first one in the numbers array
		int high = numbers[row][0];

		//compare remaining array values to current low value
		for(int col = 1; col < numbers[row].length; col++){
			if(numbers[row][col] > high){
				high = numbers[row][col];
			}
		}//end for
		
		return high;
	}//end getRowHighest
	
	public static int getRowLowest(int row, int[][] numbers){
		row = row -1;
		
		//set the current low value as the first one in the numbers array
		int low = numbers[row][0];

		//compare remaining array values to current low value
		for(int col = 1; col < numbers[row].length; col++){
			if(numbers[row][col] < low){
				low = numbers[row][col];
			}
		}//end for
		
		return low;
	}//end getRowLowest
	
	public static void main(String[] args){
		//initialize an array
		int[][] numbers = {{1,2,3},
						  {4,5,6},
						  {7,8,9},
						  {10,11,12},
						  {13,14,15},
						  {16,17,18},
						  {19,20, 21}};
		
		//display array contents
		for(int row = 0; row < numbers.length; row++){
			for(int col = 0; col < numbers[row].length; col++){
				if(col != numbers[row].length - 1)	
					System.out.print(numbers[row][col] + ", ");
				else
					System.out.print(numbers[row][col] + "\n");
			}//end for
		}//end for
		
		//get the total
		System.out.println("\nTotal: " + getTotal(numbers));
		
		//display the average
		System.out.println("Average: " + getAverage(numbers));
		
		//display row total
		System.out.println("Total in row " + 2 + ": " + getRowTotal(2, numbers));
		
		//display column total
		System.out.println("Total in column " + 3 + ": " + getColumnTotal(3, numbers));
		
		//display the highest value in row
		System.out.println("Max in row " + 5 + ": " + getRowHighest(5, numbers));
		
		//display the minimum value row
		System.out.println("Min in row " + 7 + ": " + getRowLowest(7, numbers));
	}//end main	
	
}//end class