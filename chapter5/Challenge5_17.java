//rock paper scissors game
import java.util.Scanner;
import java.util.Random;
public class Challenge5_17{
	public static String determineWinner(String player, String cpu){
		if(player.equals("rock") && cpu.equals("paper")){
			return "CPU";
		}
		else if(player.equals("rock") && cpu.equals("scissors")){
			return "Player";
		}
		else if(player.equals("paper") && cpu.equals("rock")){
			return "Player";
		}
		else if(player.equals("paper") && cpu.equals("scissors")){
			return "CPU";
		}
		else if(player.equals("scissors") && cpu.equals("rock")){
			return "CPU";
		}
		else if(player.equals("scissors") && cpu.equals("paper")){
			return "Player";
		}
		else
			return "Nobody";
	}//end determineWinner

	public static void main(String[] args){
		String player;
		int cpu;
		String cpuString = null;
		String winner;
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Enter rock, paper, or scissors: ");
		player = keyboard.nextLine();
	
		do{
			cpu = rand.nextInt(3) + 1;
			
			switch(cpu){
				case 1:
					cpuString = "rock";
					break;
				case 2:
					cpuString = "paper";
					break;
				case 3:
					cpuString = "scissors";
					break;
			}//end switch
		}while(player.equals(cpuString));
		
		System.out.println("Computer choice: " + cpuString);
		
		winner = determineWinner(player, cpuString);
		
		System.out.println("Winner: " + winner);
	}//end main

}//end class