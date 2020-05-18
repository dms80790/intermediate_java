public class Challenge8_3Carpet{
	private Challenge8_3Dimension room;
	private double cost;
	
	//constructor that creates a new room object
	public Challenge8_3Carpet(double length, double width, double cost){
		this.room = new Challenge8_3Dimension(length, width);
		this.cost = cost;
	}
	
	public double total(){
		return this.room.area() * cost;
	}
}//end class