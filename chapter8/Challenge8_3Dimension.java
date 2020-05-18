public class Challenge8_3Dimension{
	private double width;
	private double length;
	
	public Challenge8_3Dimension(double len, double wid){
		this.length = len;
		this.width = wid;
	}
	
	public double area(){
		return this.length * this.width;
	}
}