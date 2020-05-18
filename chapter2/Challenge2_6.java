//calculate the total number of acres in a tract of land

public class Challenge2_6{
	public static void main(String[] args){
		double size_in_feet = 389767;
		final double FEET_IN_ACRE = 43560;
		double size_in_acres = size_in_feet / FEET_IN_ACRE;
		
		System.out.println("There are " + size_in_acres + " acres in " + size_in_feet + " square feet.");
	}//end main
}//end class