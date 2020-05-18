//write a class that has three overloaded static methods for calculating the areas of circles, rectangles, and cylinders

public class Challenge8_1{
	//method for rectangle area
	public static double calculateArea(int length, int width){
		return length * (double)width;
	}
	
	public static double calculateArea(double radius){
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static double calculateArea(double height, double radius){
		return calculateArea(radius) * height;
	}
}//end class