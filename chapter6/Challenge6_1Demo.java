//demo for Employee class
//package Challenge6_1;
public class Challenge6_1Demo{
	public static void main(String[] args){
		Challenge6_1 employee1 = new Challenge6_1("Susan Meyers", 47899, "Accounting", "Vice President");
		Challenge6_1 employee2 = new Challenge6_1("Mark Jones", 39119, "IT", "Programmer");
		Challenge6_1 employee3 = new Challenge6_1("Joy Rogers", 81774, "Manufacturing", "Engineer");
		
		//display employees
		System.out.printf("%-20s%-10s%-16s%-16s\n", "Name", "ID Number", "Department", "Position\n");
		System.out.println("------------------------------------------------------------");
	
		//employee1
		System.out.printf("%-20s%-10d%-16s%-16s\n", employee1.getName(), employee1.getIdNumber(), employee1.getDepartment(), employee1.getPosition());
		
		//employee2
		System.out.printf("%-20s%-10d%-16s%-16s\n", employee2.getName(), employee2.getIdNumber(), employee2.getDepartment(), employee2.getPosition());
		
		//employee3
		System.out.printf("%-20s%-10d%-16s%-16s\n", employee3.getName(), employee3.getIdNumber(), employee3.getDepartment(), employee3.getPosition());
	
		System.exit(0);  //exit without error
	}//end main
}//end class