//write a class that represents a retail item in a store
public class Challenge6_4{
	private String description;
	private int unitsInStock;
	private double price;
	
	//constructor
	public Challenge6_4(String desc, int units, double price){
		this.description = desc;
		this.unitsInStock = units;
		this.price = price;
	}
	
	public void setDescription(String desc){
		this.description = desc;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setUnits(int units){
		this.unitsInStock = units;
	}
	
	public int getUnits(){
		return this.unitsInStock;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return this.price;
	}
}//end class