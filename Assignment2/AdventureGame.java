//CS401 intermediate java
//Assignment 2
//Adventure Game (see pdf)
import java.util.Scanner;   //used for user input
import java.util.Random;    //used to generate random numbers for attacks
public class AdventureGame{
	public static void main(String[] args){
		int characterChoice;
		int pathChoice;
		String pathName = "";
		int rewardChoice;
		int numEnemies = 0;
		int characterATK;
		int weaponATK;
		int enemyATK;
		int spellNum;
		
		String characterName = "";
		int characterHP = 0;
		int characterStrength = 0;
		String characterWeaponName = "";
		int characterWeaponMin = 0;
		int characterWeaponMax = 0;
		
		String enemyName = "";
		int enemyHP = 0;
		int enemyStrength = 0;
		String enemyWeaponName = "";
		int enemyWeaponMin = 0;
		int enemyWeaponMax = 0;
		int currentEnemyHP;
		
		//constant stats
		final int ROGUE_HP = 55;
		final int ROGUE_STRENGTH = 8;
		final int PALADIN_HP = 35;
		final int PALADIN_STRENGTH = 14;
		final int JACKIE_CHAN_HP = 45;
		final int JACKIE_CHAN_STRENGTH = 10;
		final int GOBLIN_HP = 25;
		final int GOBLIN_STRENGTH = 4;
		final int SKELETON_HP = 25;
		final int SKELETON_STRENGTH = 3;
		final int WIZARD_HP = 40;
		final int WIZARD_STRENGTH = 8;
		final int SHORT_SWORD_MIN_DMG = 1;
		final int SHORT_SWORD_MAX_DMG = 4;
		final int LONG_SWORD_MIN_DMG = 3;
		final int LONG_SWORD_MAX_DMG = 7;
		final int JUMP_KICK_MIN_DMG = 2;
		final int JUMP_KICK_MAX_DMG = 6;
		final int AXE_MIN_DMG = 2;
		final int AXE_MAX_DMG = 6;
		final int FIRE_BLAST_MIN_DMG = 4;
		final int FIRE_BLAST_MAX_DMG = 10;
		
		Scanner keyboard = new Scanner(System.in);  //object for user input
		Random rand = new Random();   //object for generating attack random numbers

		//welcome message
		System.out.println("Adventure Game - Start!\n");
		
		System.out.println("Here are the characters:");
		System.out.println("1. Rogue\n" +
						   "2. Paladin\n" +
						   "3. Jackie Chan\n");
		
		//obtain character choice -- assumption: valid input
		System.out.print("Which character do you choose?:");
		characterChoice = keyboard.nextInt();
		
		//set the user's stats, based on character choice
		switch(characterChoice){
			case 1:
				characterName = "Rogue";
				characterHP = ROGUE_HP;
				characterStrength = ROGUE_STRENGTH;
				characterWeaponName = "Short Sword";
				characterWeaponMin = SHORT_SWORD_MIN_DMG;
				characterWeaponMax = SHORT_SWORD_MAX_DMG;
				break;
			case 2:
				characterName = "Paladin";
				characterHP = PALADIN_HP;
				characterStrength = PALADIN_STRENGTH;
				characterWeaponName = "Long Sword";
				characterWeaponMin = LONG_SWORD_MIN_DMG;
				characterWeaponMax = LONG_SWORD_MAX_DMG;
				break;
			case 3:
				characterName = "Jackie Chan";
				characterHP = JACKIE_CHAN_HP;
				characterStrength = JACKIE_CHAN_STRENGTH;
				characterWeaponName = "Jump Kick";
				characterWeaponMin = JUMP_KICK_MIN_DMG;
				characterWeaponMax = JUMP_KICK_MAX_DMG;
				break;
			default:
				System.out.print("Invalid choice!");
				System.exit(0);
		}//end switch
		
		//print out character choice
		System.out.println("You chose: " + characterName + "\n");
		
		//narration text
		System.out.println("The Evil Wizard must be defeated! He is in The Castle. To get to The Castle, you must travel through either:\n" +
						   "1. The Forest\n" +
						   "2. The Graveyard\n");
		System.out.print("Which path will you take?: ");
		pathChoice = keyboard.nextInt();
		
		switch(pathChoice){
			case 1:
				numEnemies = 3;
				pathName = "The Forest";
				enemyName = "Goblin";
				enemyHP = GOBLIN_HP;
				enemyStrength = GOBLIN_STRENGTH;
				enemyWeaponName = "Axe";
				enemyWeaponMin = AXE_MIN_DMG;
				enemyWeaponMax = AXE_MAX_DMG;
				break;
			case 2:
				numEnemies = 5;
				pathName = "The Graveyard";
				enemyName = "Skeleton";
				enemyHP = SKELETON_HP;
				enemyStrength = SKELETON_STRENGTH;
				enemyWeaponName = "Short Sword";
				enemyWeaponMin = SHORT_SWORD_MIN_DMG;
				enemyWeaponMax = SHORT_SWORD_MAX_DMG;
				break;
		}//end switch
		
		//narration text
		System.out.println("\nYou chose: " + pathName);
		System.out.println("Once you enter " + pathName + ", you encounter " + numEnemies + " " + enemyName + "s! Time for battle!\n");
		
		//simulate the corresponding number of battles with appropriate enemy, given path choice
		int i = 0;
		while(numEnemies > 0){
			//reset HP for next enemy
			currentEnemyHP = enemyHP;
			
			//formatting
			System.out.println("***" + characterName + " vs " + enemyName + " " + (i+1));
			
			//loop until character or enemy is defeated
			while(characterHP > 0){
				//***********character attacks***********//
				//generate weapon attack strength
				weaponATK = rand.nextInt(characterWeaponMax - characterWeaponMin) + characterWeaponMin + 1;
				
				//sum total attack stength
				characterATK = characterStrength + weaponATK;
				
				System.out.println(characterName + " attacks with ATK = " + characterStrength + " + " + weaponATK + " = " + characterATK);

				//display enemy HP
				System.out.println(enemyName + " HP is now " + currentEnemyHP + " - " + characterATK + " = " + (currentEnemyHP - characterATK) + "\n");
				
				//decrease enemy HP after attack
				currentEnemyHP -= characterATK;
				
				//determine if enemy defeated
				if(currentEnemyHP <= 0){
					System.out.println(characterName + " defeated " + enemyName + " " + (i+1) + "!\n");
					
					i++;  //increment index
					
					//decrement number of enemies
					numEnemies --;
					break;  //go to the next enemy
				}//end if
				
				//**********enemy attacks***************//
				//generate random weapon attack strength
				weaponATK = rand.nextInt(enemyWeaponMax - enemyWeaponMin) + enemyWeaponMin + 1;
				
				//sum total attack stength
				enemyATK = enemyStrength + weaponATK;
				
				System.out.println(enemyName + " attacks with ATK = " + enemyStrength + " + " + weaponATK + " = " + enemyATK);

				//display enemy HP
				System.out.println(characterName + " HP is now " + characterHP + " - " + enemyATK + " = " + (characterHP - enemyATK) + "\n");
				
				//decrease character HP after attack
				characterHP -= enemyATK;
			}//end enemy while
			
			//determine if character defeated
			if(characterHP <= 0){
				System.out.println("--" + characterName + " is defeated in  battle!--\n");
					
				System.out.println("GAME OVER");
				
				System.exit(0);  //exit without error
			}//end if
		}//end total enemy while
		
		//narration text
		System.out.println("--" + characterName + " wins the battle!--\n");
		System.out.println("Your HP is:" + characterHP + "\n");
		
		System.out.println("Please choose a reward.\n" +
					     "1. Healing Potion\n" +
						 "2. Ring of Strength\n");
		System.out.print("Which do you choose?: ");
		rewardChoice = keyboard.nextInt();
	
		//healing potion
		if(rewardChoice == 1){
			System.out.println("\nYou chose: Healing Potion\n");
			
			System.out.println("Your HP has increased to " + characterHP + " + 10 = " + (characterHP+10) + "!");
			
			//consume the healing potion
			characterHP += 10;
		}//end if
		//ring of strength
		else if(rewardChoice == 2){
			System.out.println("\nYou chose: Ring of Strength\n");
			
			System.out.println("Your strength has increased to " + characterStrength + " + 5 = " + (characterStrength+5) + "!");
			
			//put on the ring of strength
			characterStrength += 5;
		}//end if
		
		//narration text
		System.out.println("\nYou have now reached The Castle! Time to battle The Evil Wizard!\n");
		System.out.println("***" + characterName + " vs The Evil Wizard***");
		
		//set enemy attributes
		enemyName = "Wizard";
		enemyHP =  WIZARD_HP;
		enemyStrength = WIZARD_STRENGTH;
		enemyWeaponName = "Fire Blast";
		enemyWeaponMin = FIRE_BLAST_MIN_DMG;
		enemyWeaponMax = FIRE_BLAST_MAX_DMG;
		
		//simulate the battle with the wizard
		//loop until character or enemy is defeated
		while(characterHP > 0){
			//***********character attacks***********//
			System.out.println("Choose your action:\n" +
							   "1. Attack\n" +
							   "2. Attempt Spell Cast\n");
			
			characterChoice = keyboard.nextInt();
			
			//regular attack
			if(characterChoice == 1){
				//generate weapon attack strength
				weaponATK = rand.nextInt(characterWeaponMax - characterWeaponMin) + characterWeaponMin;
						
				//sum total attack stength
				characterATK = characterStrength + weaponATK;
						
				System.out.println(characterName + " attacks with ATK = " + characterStrength + " + " + weaponATK + " = " + characterATK);

				//display enemy HP
				System.out.println(enemyName + " HP is now " + enemyHP + " - " + characterATK + " = " + (enemyHP - characterATK) + "\n");
						
				//decrease enemy HP after attack
				enemyHP -= characterATK;
			}//end if
			//cast spell
			else if(characterChoice == 2){
				spellNum = rand.nextInt(5) + 1;
				
				System.out.print("\nEnter your guess: ");
				characterChoice = keyboard.nextInt();
				
				//if the spell is correctly cast
				if(characterChoice == spellNum){
					System.out.println("Correct!\n");
					enemyHP = 0;
					
					System.out.println(characterName + "'s spell is cast successfully! The Wizard's HP is now 0!\n");
				}//end if
				else{
					System.out.println("Incorrect.\n");
					
					System.out.println(characterName + "'s spell is cast unsuccessfully! The Wizard will now attack.\n");
				}//end else
			}//end else if
			
			//determine if enemy defeated
				if(enemyHP <= 0){
					System.out.println("--" + characterName + " wins the battle!--\n");
					
					System.out.println("You win! Congratulations!");
					System.exit(0);
				}//end if
					
			//**********enemy attacks***************//
			//generate random weapon attack strength
			weaponATK = rand.nextInt(enemyWeaponMax - enemyWeaponMin) + enemyWeaponMin;
					
			//sum total attack stength
			enemyATK = enemyStrength + weaponATK;
					
			System.out.println(enemyName + " attacks with ATK = " + enemyStrength + " + " + weaponATK + " = " + enemyATK);

			//display enemy HP
			System.out.println(characterName + " HP is now " + characterHP + " - " + enemyATK + " = " + (characterHP - enemyATK) + "\n");
					
			//decrease character HP after attack
			characterHP -= enemyATK;
		}//end while
		
		if(characterHP <= 0){
			System.out.println("--" + characterName + " is defeated in  battle!--\n");
					
			System.out.println("GAME OVER");
				
			System.exit(0);  //exit without error
		}//end if
	}//end main
}//end class