//class that stores Payroll information for 7 employees
public class Challenge7_2{
	private int[] employeeID;
	private int[] hours;
	private double[] payRate;
	private double[] wages;
	
	//default constructor
	public Challenge7_2(){
		this.employeeID = null;
		this.hours = null;
		this.payRate = null;
		this.wages = null;
	}//end constructor
	
	//constructor with info passed
	//NOTE: arrays are passed by reference... this method accesses the original arrays
	public Challenge7_2(int[] ids){
		this.employeeID = ids;
		this.hours = new int[ids.length];
		this.payRate = new double[ids.length];
		this.wages = new double[ids.length];
	}//end constructor
	
	public void setEmployeeID(int[] ids){
		this.employeeID = ids;
	}//end setEmployeeID
	
	public int[] getEmployeeID(){
		return this.employeeID;
	}//end getEmployeeID
	
	public int getEmployeeID(int index){
		return this.employeeID[index];
	}//end getEmployeeID
	
	public void setHours(int[] hours){
		this.hours = hours;
	}//end setHours
	
	public void setHours(int index, int hours){
		this.hours[index] = hours;
	}//end setHours
	
	public int[] getHours(){
		return this.hours;
	}//end getHours
	
	public void setPayRate(double[] rates){
		this.payRate = rates;
	}//end setPayRate
	
	public void setPayRate(int index, double rate){
		this.payRate[index] = rate;
	}//end setPayRate
	
	public double[] getPayRate(){
		return this.payRate;
	}//end getPayRate
	
	public void setWages(double[] wages){
		this.wages = wages;
	}//end setWages
	
	public double[] getWages(){
		return this.wages;
	}//end getWages
	
	public double getIndividualWages(int id){
		int index = -1;  //matching index for employee id
		boolean found = false;
		
		for(int i = 0; i < employeeID.length; i++){
			if (employeeID[i] == id){
				index = i;
				found = true;
				break;
			}//end if
		}//end for
		
		if(!found){
			System.out.print("Employee not found!");
			return 0;
		}
		else{
			wages[index] = hours[index] * payRate[index];
			return wages[index];
		}
	}//end getIndividualWages
}//end class