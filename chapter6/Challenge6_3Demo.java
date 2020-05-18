//demo of the personal information class
public class Challenge6_3Demo{
	public static void main(String[] args){
		Challenge6_3 person1 = new Challenge6_3("Dave Stropkey", "1462 Milan Ave", 29, "4126382921");
		Challenge6_3 person2 = new Challenge6_3("Jeremy Irvin", "5421 Sunset Drive", 29, "4123356767");
		Challenge6_3 person3 = new Challenge6_3("George Sotereanos", "1212 Grandview Ave", 89, "4124311400");
		
		//print out the personal information
		System.out.println(person1.getName() + " " + person1.getAddress()+ " " + person1.getAge()+ " " + person1.getPhone());
		System.out.println(person2.getName()+ " " + person2.getAddress()+ " " + person2.getAge()+ " " + person2.getPhone());
		System.out.println(person3.getName()+ " " + person3.getAddress()+ " " + person3.getAge()+ " " + person3.getPhone());

		System.exit(0);
	}//end main
}//end class