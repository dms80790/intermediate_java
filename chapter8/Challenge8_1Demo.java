//program that demonstrates the static methods in the Challenge8_1 class
import java.util.Scanner;
public class Challenge8_1Demo{
	public static double rectangleArea(){
		double length;
		double width;
		
		Scanner keyboard = new Scanner(System.in);		
		System.out.print("Length: ");
		length = keyboard.nextDouble();
		
		System.out.print("Width: ");
		width = keyboard.nextDouble();
		
		return length * width;
	}
		
	public static double circleArea(){
		double radius;		
		
		Scanner keyboard = new Scanner(System.in);		
		System.out.print("Radius: ");
		radius = keyboard.nextDouble();
		
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static double cylinderArea(){
		double radius;	
		double height;
		
		Scanner keyboard = new Scanner(System.in);		
		System.out.print("Radius: ");
		radius = keyboard.nextDouble();
		
		System.out.print("Height: ");
		height = keyboard.nextDouble();
		
		return height * Challenge8_1.calculateArea(radius);
	}
	
	public static void main(String[] args){
		double area = 0;
		int choice;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("1. Rectangle\n" +
						   "2. Circle\n" +
						   "3. Cylinder");
		
		System.out.print("Enter shape number: ");
		choice = keyboard.nextInt();
		
		switch(choice){
			case 1:
				area = rectangleArea();
				break;
			case 2:
				area = circleArea();
				break;
			case 3:
				area = cylinderArea();
				break;
			default:
				System.out.println("Error. Choice must be a number 1-3.");
		}//end switch
		
		System.out.printf("Area: %.2f\n", area);
		
		System.exit(0);
	}//end main
}//end class