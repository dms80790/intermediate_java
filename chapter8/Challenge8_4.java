//class representing the dimensions of a tract of land.
//has methods to return the area, an equals method, and a toString method
public class Challenge8_4{
	private double length;
	private double width;

	//constructor
	public Challenge8_4(double len, double wid){
		this.length = len;
		this.width = wid;
	}//end constructor

	//method that returns the area of the tract of land
	public double area(){
		return this.length * this.width;
	}//end area

	//return a String representation of the data in this object
	public String toString(){
		return "Length: " + this.length + "\n" +
			   "Width: " + this.width + "\n";
	}//end toString
	
	//method that checks if another object has the same data as this
	public boolean equals(Challenge8_4 other){
		if(this. length == other.getLength() && this.width == other.getWidth())
			return true;
		else
			return false;
	}//end equals
	
	public double getLength(){
		return this.length;
	}
	
	public double getWidth(){
		return this.width;
	}
}//end class