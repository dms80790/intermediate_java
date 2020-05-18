//program demonstrating the Dimension and Carpet classes for Challenge8_3
import java.util.Scanner;
public class Challenge8_3Demo{
	public static void main(String[] args){
		double length;
		double width;
		double costPerFoot;
		double total;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Length: ");
		length = keyboard.nextDouble();
		
		System.out.print("Width: ");
		width = keyboard.nextDouble();
		
		System.out.print("Cost per foot: ");
		costPerFoot = keyboard.nextDouble();
		
		//create the carpet object
		Challenge8_3Carpet carpet = new Challenge8_3Carpet(length, width, costPerFoot);

		total = carpet.total();
		
		System.out.println("Total cost: $" + total);
	}//end main
}//end class