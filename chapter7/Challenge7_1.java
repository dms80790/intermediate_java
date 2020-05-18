//class that stores the rainfall for 12 months in an array
//also has methods that return total rainfall, average, most, and least rainfall

public class Challenge7_1{
	private double[] months;
	
	//default constructor
	public Challenge7_1(){
		this.months = new double[12];  //create a new double array in memory
	}//end constructor

	//constructor that takes a passed double array
	public Challenge7_1(double[] months){
		this.months = months;
	}//end constructor

	//accessor method for months variable
	public double[] getMonths(){
		return this.months;
	}//end getMonths

	//mutator method for months variable
	public void setMonths(double[] months){
		this.months = months;
	}//end setMonths

	//return the sum of all array elements
	public double total(){
		double total = 0;  //accumulator
		
		//enhanced for loop to total the array contents
		for(double month: this.months){
			total += month;
		}
		
		return total;
	}//end total
	
	//return the average value in the array
	public double average(){
		double average;
		
		average = this.total() / this.months.length;
		
		return average;
	}//end average
	
	//return the minimum value in the array
	public double min(){
		double min = months[0];  //start with the minimum as the first element
		
		//loop through whole array starting at second element
		for(int i = 1; i < months.length; i++){
			//if you find a new minimum value, store it
			if(months[i] < min){
				min = months[i];
			}
		}
		
		return min;
	}//end min
	
	//return the maximum value in the array
	public double max(){
		double max = months[0];  //start with the max as the first element
		
		//loop through whole array starting at second element
		for(int i = 1; i < months.length; i++){
			//if you find a new minimum value, store it
			if(months[i] > max){
				max = months[i];
			}
		}
		
		return max;
	}//end max
}//end class