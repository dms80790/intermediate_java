//write a class named Employee
//package Challenge6_1;
public class Challenge6_1{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	//constructor
	public Challenge6_1(){
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position = "";
	}
	
	//constructor
	public Challenge6_1(String name, int id, String dep, String pos){
		this.name = name;
		this.idNumber = id;
		this.department = dep;
		this.position = pos;
	}
	
	//constructor
	public Challenge6_1(String name, int id){
		this.name = name;
		this.idNumber = id;
		this.department = "";
		this.position = "";
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getIdNumber(){
		return this.idNumber;
	}
	
	public void setIdNumber(int id){
		this.idNumber = id;
	}
	
	public String getDepartment(){
		return this.department;
	}
	
	public void setDepartment(String dep){
		this.department = dep;
	}
	
	public String getPosition(){
		return this.position;
	}
	
	public void setPosition(String pos){
		this.position = pos;
	}
}//end class