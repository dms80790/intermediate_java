//demo program for car objects
public class Challenge6_2Demo{
	public static void main(String[] args){
		Challenge6_2 car = new Challenge6_2("Chevy", "1966");
		
		//5 rounds of acceleration
		for(int i = 0; i < 5; i++){
			car.accelerate();
			System.out.println("Speed: " + car.getSpeed());
		}
		
		//5 rounds of deceleration
		for(int i = 0; i < 5; i++){
			car.brake();
			System.out.println("Speed: " + car.getSpeed());
		}
		
		System.exit(0);  //exit without error
	}//end main
}//end class