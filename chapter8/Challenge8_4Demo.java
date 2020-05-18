//program that demonstrates the LandTract class in Challenge8_4
import java.util.Scanner;
public class Challenge8_4Demo{
	public static void main(String[] args){
		double length, width;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Length: ");
		length = keyboard.nextDouble();
		
		System.out.print("Width: ");
		width = keyboard.nextDouble();

		//create new object representing the tract of land
		Challenge8_4 tract = new Challenge8_4(length, width);
		
		System.out.print("Length: ");
		length = keyboard.nextDouble();
		
		System.out.print("Width: ");
		width = keyboard.nextDouble();
		
		Challenge8_4 tract2 = new Challenge8_4(length, width);
		
		System.out.println("Tract 1 area: " + tract.area());
		System.out.println("Tract 2 area: " + tract2.area());
		System.out.println("Are the tracts identical? " + tract.equals(tract2));
		
		System.out.println("Are the tracts the same size? " + (tract.area() == tract2.area()));
		
		System.out.println("State of tract1: \n" + tract.toString());
	}//end main	
}//end class