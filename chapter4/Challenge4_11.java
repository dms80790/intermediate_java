//program that displays the convervions from Celcius to Fahrenheit for 0-20 degrees Celcius
public class Challenge4_11{
	public static void main(String[] args){
		double fahrenheit;

		//table formatting
		System.out.printf("%12s%12s\n", "Celcius", "Fahrenheit");
		System.out.println("------------------------");
		
		for(int i = 0; i < 21; i++){
			//calculate temperature in Fahrenheit
			fahrenheit = (9/5.0) * i + 32;

			//print out the row
			System.out.printf("%12d%12.2f\n", i, fahrenheit);		
		}//end for
		
		//exit without error
		System.exit(0);
	}//end main
}//end class