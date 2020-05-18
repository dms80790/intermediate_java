// program that plays a word game with the user

import java.util.Scanner;
public class Challenge2_18{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
		
		System.out.print("Enter a name: ");
		name = keyboard.nextLine();
		
		System.out.print("Enter an age: ");
		age = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.print("Enter a city: ");
		city = keyboard.nextLine();
		
		System.out.print("Enter a college: ");
		college = keyboard.nextLine();
		
		System.out.print("Enter a profession: ");
		profession = keyboard.nextLine();
		
		System.out.print("Enter an animal: ");
		animal = keyboard.nextLine();
		
		System.out.print("Enter a pet's name: ");
		petName = keyboard.nextLine();
		
		System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after!");
	}//end main
}//end class