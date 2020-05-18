//program that calculates area given the length and width of a rectangle
import java.util.Scanner;
public class Challenge5_3{
	public static void main(String[] args){
		double length;
		double width;
		double area;
		
		length = getLength();  //get the length from the user
		width = getWidth();   //get the width from the user
		area = getArea(length, width);    //calculate the area from the length and width
		displayData(length, width, area);   //display data
		
		System.exit(0);  //exit without error
	}//end main
	
	public static double getLength(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		return keyboard.nextDouble();
	}//end getLength
	
	public static double getWidth(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter width: ");
		return keyboard.nextDouble();
	}//end getWidth
	
	public static double getArea(double len, double wid){
		return len * wid;
	}//end getArea
	
	public static void displayData(double len, double wid, double area){
		System.out.println("Length: " + len + "\n" +
						   "Width: " + wid + "\n" +
						   "Area: " + area);
	}//end displayData
}//end class