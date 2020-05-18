/*Design a class that holds the following personal data: name, address, age, and phone number.
Write appropriate accessor and mutator methods. Demonstrate the class by writing a
program that creates three instances of it. One instance should hold your information, and
the other two should hold your friends’ or family members’ information.
*/
public class Challenge6_3{
	private String name;
	private String address;
	private int age;
	private String phone;
	
	//constructor
	public Challenge6_3(String name, String address, int age, String phone){
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setAge(int Age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){
		return this.phone;
	}
}//end class