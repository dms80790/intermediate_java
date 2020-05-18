// program that takes three names and prints them in alphabetical order

import java.util.Scanner;
public class Challenge3_7{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		String names[] = new String[3];
		
		System.out.print("Enter a name: ");
		names[0] = keyboard.nextLine();
		
		System.out.print("Enter a name: ");
		names[1] = keyboard.nextLine();
		
		System.out.print("Enter a name: ");
		names[2] = keyboard.nextLine();
		
		//selection sort
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				String temp = names[j];
			
				if(names[j].compareTo(names[j+1]) > 0){
					names[j] = names[j+1];
					names[j+1] = temp;
				}//end if
			}//end for
		}//end for
		
		for(int i = 0; i < 3; i++){
			System.out.println(names[i]);
		}//end for

	}//end main
}//end class