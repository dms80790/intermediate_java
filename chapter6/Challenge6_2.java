//write a car class
public class Challenge6_2{
	private String make;  //brand 
	private String yearModel;  //year of the car
	private int speed;
	
	//constructor
	public Challenge6_2(String make, String year){
		this.make = make;
		this.yearModel = year;
		this.speed = 0;
	}//end constructor
	
	public String getMake(){
		return this.make;
	}
	
	public String getYearModel(){
		return this.yearModel;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	//increase speed by 5
	public void accelerate(){
		this.speed += 5;
	}

	//decrease speed by 5
	public void brake(){
		this.speed -= 5;
	}
	
}//end class