//program that converts fahrenheit to celcius for temperatures 0-20

public class Challenge5_6{
	public static double celcius(int fahrenheit){
		return (fahrenheit - 32) * (5.0/9);
	}//end celcius
	
	public static void displayResult(int fahrenheit, double celcius){
		System.out.printf("%8d%12.2f\n", fahrenheit, celcius);
	}//end displayResult

	public static void main(String[] args){
		double newTemp;  //holds fahrenheit to celcius conversion
		
		//set up table
		System.out.printf("%8s%12s\n", "Fahrenheit", "Celcius");
		System.out.println("--------------------");
		
		//loop through 0-20
		for(int i = 0; i < 21; i++){
			//convert fahrenheit to celcius
			newTemp = celcius(i);
			
			//display the result... i is temp in fahrenheit
			displayResult(i, newTemp);
		}//end for
	}//end main
}//end class