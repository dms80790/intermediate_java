//demo of the retail item class
public class Challenge6_4Demo{
	public static void main(String[] args){
		Challenge6_4 item1 = new Challenge6_4("Toilet paper", 50, 3.99);
		Challenge6_4 item2 = new Challenge6_4("Nintendo Switch", 3, 299.99);
		Challenge6_4 item3 = new Challenge6_4("Bread", 36, 3.50);
		
		double[] testArray = new double[99999999999999999999999999999999999999999];
		
		//print out the personal information
		System.out.println(item1.getDescription() + " " + item1.getUnits()+ " " + item1.getPrice());
		System.out.println(item2.getDescription()+ " " + item2.getUnits()+ " " + item2.getPrice());
		System.out.println(item3.getDescription()+ " " + item3.getUnits()+ " " + item3.getPrice());

		System.exit(0);
	}//end main
}//end class