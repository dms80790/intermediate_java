//CS401 intermediate java
//Assignment 3
//Adventure Game with methods (see pdf)
import java.util.Scanner;   //used for user input
import java.util.Random;    //used to generate random numbers for attacks
public class AdventureGameV2{
	public static void main(String[] args){
		int choice;
		String pathName = "";
		int numEnemies = 0;
		int spellNum;
		int currentEnemyHP;

		String[] characterNames = new String[2];  //0. character name  1. weapon name
		int[] characterAttributes = new int[5];   //0. HP  1. strength  2. weapon min  3. weapon max  4. coins

		String[] enemyNames = new String[3];      //0. character name  1. weapon name  2. number enemies
		int[] enemyAttributes = new int[5];       //0. HP  1. strength  2. weapon min  3. weapon max  4. numEnemies

		Scanner keyboard = new Scanner(System.in);  //object for user input

		//welcome message
		System.out.println("Adventure Game - Start!\n");

		//obtain character choice
		getCharacter(characterAttributes, characterNames);
		
		//print out character choice
		System.out.println("You chose: " + characterNames[0] + "\n");
		
		//narration text
		System.out.println("The Evil Wizard must be defeated! He is in The Castle. To get to The Castle, you must travel through either:\n" +
						   "1. The Forest\n" +
						   "2. The Graveyard\n");
		
		//obtain path choice and set corresponding enemy attributes
		getEnemy(enemyAttributes, enemyNames);
		
		//narration text
		System.out.println("\nYou chose: " + enemyNames[2]);
		System.out.println("Once you enter " + enemyNames[2] + ", you encounter " + enemyAttributes[4] + " " + enemyNames[0] + "s! Time for battle!\n");
		
		//simulate fights with enemies along path you chose
		battleMinions(characterNames, characterAttributes, enemyNames, enemyAttributes);
		
		//narration text
		System.out.println("--" + characterNames[0] + " wins the battle!--\n");
		System.out.println("Your HP is:" + characterAttributes[0] + "\n");
		
		//go to The Item Shop
		itemShop(characterNames, characterAttributes);
		
		//narration text
		System.out.println("\nYou have now reached The Castle! Time to battle The Evil Wizard!\n");

		//simulate the battle with the wizard
		battleWizard(characterNames, characterAttributes, enemyNames, enemyAttributes);
	}//end main
	

	/**
		method that asks the user for which character they want to use and sets them up
		@param attributes -- the array for holding the player's attributes
		@param names -- the array for holding the player's name and weapon name
	*/
	public static void getCharacter(int[] attributes, String[] names){
		int choice;
		
		//weapon constant stats
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
		
		//character constant attributes
		final int ROGUE_HP = 55;
		final int ROGUE_STRENGTH = 8;
		final int PALADIN_HP = 35;
		final int PALADIN_STRENGTH = 14;
		final int JACKIE_CHAN_HP = 45;
		final int JACKIE_CHAN_STRENGTH = 10;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Here are the characters:");
		System.out.println("1. Rogue\n" +
					   "2. Paladin\n" +
					   "3. Jackie Chan\n");
		
		//obtain character choice -- assumption: valid input
		System.out.print("Which character do you choose?:");
		choice = keyboard.nextInt();
		
		//set the user's stats, based on character choice
		switch(choice){
			case 1:
				names[0] = "Rogue";
				names[1] = "Short Sword";
				attributes[0] = ROGUE_HP;
				attributes[1] = ROGUE_STRENGTH;
				attributes[2] = SHORT_SWORD_MIN_DMG;
				attributes[3] = SHORT_SWORD_MAX_DMG;
				break;
			case 2:
				names[0] = "Paladin";
				names[1] = "Long Sword";
				attributes[0] = PALADIN_HP;
				attributes[1] = PALADIN_STRENGTH;
				attributes[2] = LONG_SWORD_MIN_DMG;
				attributes[3] = LONG_SWORD_MAX_DMG;
				break;
			case 3:
				names[0] = "Jackie Chan";
				names[1] = "Jump Kick";
				attributes[0] = JACKIE_CHAN_HP;
				attributes[1] = JACKIE_CHAN_STRENGTH;
				attributes[2] = JUMP_KICK_MIN_DMG;
				attributes[3] = JUMP_KICK_MAX_DMG;
				break;
			default:
				System.out.print("Invalid choice!");
				System.exit(0);
		}//end switch		
		
		//start the character off with 500 gold
		attributes[4] = 500;
	}//end getCharacter
	
	public static void getEnemy(int[] attributes, String[] names){
		int choice;
		
		//enemy constant stats
		final int GOBLIN_HP = 25;
		final int GOBLIN_STRENGTH = 4;
		final int SKELETON_HP = 25;
		final int SKELETON_STRENGTH = 3;

		//weapon constant stats
		final int SHORT_SWORD_MIN_DMG = 1;
		final int SHORT_SWORD_MAX_DMG = 4;
		final int AXE_MIN_DMG = 2;
		final int AXE_MAX_DMG = 6;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Which path will you take?: ");
		choice = keyboard.nextInt();
		
		switch(choice){
			case 1:
				names[0] = "Goblin";
				names[1] = "Axe";
				names[2] = "The Forest";
				attributes[0] = GOBLIN_HP;
				attributes[1] = GOBLIN_STRENGTH;
				attributes[2] = AXE_MIN_DMG;
				attributes[3] = AXE_MAX_DMG;
				attributes[4] = 3;    //numEnemies
				break;
			case 2:
				names[0] = "Skeleton";
				names[1] = "Short Sword";
				names[2] = "The Graveyard";
				attributes[0] = SKELETON_HP;
				attributes[1] = SKELETON_STRENGTH;
				attributes[2] = SHORT_SWORD_MIN_DMG;
				attributes[3] = SHORT_SWORD_MAX_DMG;
				attributes[4] = 5;
				break;
			default:
				System.out.print("Invalid choice!");
				System.exit(0);
		}//end switch
	}//end getEnemy
	
	public static void battleMinions(String[] cNames, int[] cAttributes, String[] eNames, int[] eAttributes){
		int currentEnemyHP;
		
		//loop for each new enemy
		for(int i = 0; i < eAttributes[4]; i++){
			//reset HP for next enemy
			currentEnemyHP = eAttributes[0];
			
			//formatting
			System.out.println("***" + cNames[0] + " vs " + eNames[0] + " " + (i+1));
			
			//loop until character or enemy is defeated
			while(cAttributes[0] > 0){
				//**********character attacks***************//
				currentEnemyHP = attack(cNames, cAttributes, eNames, eAttributes, currentEnemyHP);
				
				//determine if enemy defeated
				if(currentEnemyHP <= 0){
					System.out.println(cNames[0] + " defeated " + eNames[0] + " " + (i+1) + "!\n");
					
					break;  //go to the next enemy
				}//end if
				
				//**********enemy attacks***************//
				cAttributes[0] = attack(eNames, eAttributes, cNames, cAttributes, cAttributes[0]);

				//determine if character defeated
				if(cAttributes[0] <= 0){
					System.out.println("--" + cNames[0] + " is defeated in  battle!--\n");
					
					System.out.println("GAME OVER");
					
					System.exit(0);  //exit without error
				}//end if
			}//end enemy while
		}//end total enemy while
	}//end battleMinions
	
	public static void battleWizard(String[] cNames, int[] cAttributes, String[] eNames, int[] eAttributes){
		int choice;
		int spellNum;
		
		//wizard constant stats
		final int WIZARD_HP = 40;
		final int WIZARD_STRENGTH = 8;
		
		//wizard weapon stats
		final int FIRE_BLAST_MIN_DMG = 4;
		final int FIRE_BLAST_MAX_DMG = 10;
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("***" + cNames[0] + " vs The Evil Wizard***");

		//set enemy attributes
		eNames[0] = "Wizard";
		eNames[1] = "Fire Blast";
		eAttributes[0] =  WIZARD_HP;
		eAttributes[1] = WIZARD_STRENGTH;
		eAttributes[2] = FIRE_BLAST_MIN_DMG;
		eAttributes[3] = FIRE_BLAST_MAX_DMG;
		
		//loop until character or enemy is defeated
		while(cAttributes[0] > 0){
			//***********character attacks***********//
			System.out.println("Choose your action:\n" +
							   "1. Attack\n" +
							   "2. Attempt Spell Cast\n");
			
			choice = keyboard.nextInt();

			//regular attack
			if(choice == 1){
				//generate weapon attack strength
				eAttributes[0] = attack(cNames, cAttributes, eNames, eAttributes, eAttributes[0]);
			}//end if
			//cast spell
			else if(choice == 2){
				spellNum = rand.nextInt(5) + 1;
				
				System.out.print("\nEnter your guess: ");
				choice = keyboard.nextInt();
				
				//if the spell is correctly cast
				if(choice == spellNum){
					System.out.println("Correct!\n");
					eAttributes[0] = 0;

					System.out.println(cNames[0] + "'s spell is cast successfully! The Wizard's HP is now 0!\n");
				}//end if
				else{
					System.out.println("Incorrect.\n");
					
					System.out.println(cNames[0] + "'s spell is cast unsuccessfully! The Wizard will now attack.\n");
				}//end else
			}//end else if

			//determine if enemy defeated
			if(eAttributes[0] <= 0){
				System.out.println("--" + cNames[0] + " wins the battle!--\n");
					
				System.out.println("You win! Congratulations!");
				System.exit(0);
			}//end if

			//**********wizard attacks***************//
			//generate random weapon attack strength
			cAttributes[0] = attack(eNames, eAttributes, cNames, cAttributes, cAttributes[0]);
		
			if(cAttributes[0] <= 0){
				System.out.println("--" + cNames[0] + " is defeated in  battle!--\n");

				System.out.println("GAME OVER");

				System.exit(0);  //exit without error
			}//end if
		}//end while
	}//end battleWizard
	
	/**
		private inner method used to simulate a single attack
		@attribute oNames ... name strings of offense
		@attribute oAttributes ... attributes of offense
		@attribute dNames... name strings of defense
		@attribute dAttributes... attributes of defense
		@attribute dHP... HP of current defense
	*/
	private static int attack(String[] oNames, int[] oAttributes, String[] dNames, int[] dAttributes, int dHP){
		int weaponATK;
		int totalATK;
		
		Random rand = new Random();
		
		//generate weapon attack strength
		weaponATK = rand.nextInt(oAttributes[3] - oAttributes[2]) + oAttributes[2] + 1;
				
		//sum total attack stength
		totalATK = oAttributes[1] + weaponATK;
				
		System.out.println(oNames[0] + " attacks with ATK = " + oAttributes[1] + " + " + weaponATK + " = " + totalATK);

		//display defender HP
		System.out.println(dNames[0] + " HP is now " + dHP + " - " + totalATK + " = " + (dHP - totalATK) + "\n");
				
		//decrease defender HP after attack
		dHP -= totalATK;
		
		return dHP;
	}//end attack
	
	public static void itemShop(String[] cNames, int[] cAttributes){
		int repeat = 0;
		
		int itemNum;    //item menu choice number
		int itemPrice;  //price of the item
		int itemQuantity;  //number of units to buy
		int discount = 0;
		int subtotal;  //total before discount
		int total;  //subtotal - discount
		String itemName = "";
		
		//constants for item attributes
		final int SHORT_SWORD_MIN_DMG = 1;
		final int SHORT_SWORD_MAX_DMG = 4;
		final int LONG_SWORD_MIN_DMG = 3;
		final int LONG_SWORD_MAX_DMG = 7;
		final int MACE_MIN_DMG = 2;
		final int MACE_MAX_DMG = 5;

		//constants for item prices
		final int LONG_SWORD_PRICE = 120;
		final int SHORT_SWORD_PRICE = 90;
		final int MACE_PRICE = 80;
		final int MAGIC_RING_PRICE = 150;
		final int HEALING_POTION_PRICE = 10;
		
		final double DISCOUNT_RATE = .10;   //discount rate of 10%
		
		Scanner keyboard = new Scanner(System.in);   //user input object
		
		//welcome message
		System.out.println("Welcome to the Item Shop, " + cNames[0] + "!");
		
		do{
			System.out.println("\nHere's what we have for sale (all prices are in units of gold):\n");
			
			//display menu
			System.out.println("1. Long Sword\t\t" + LONG_SWORD_PRICE + "\n" +
							   "2. Short Sword\t\t" + SHORT_SWORD_PRICE + "\n" +
							   "3. Mace\t\t\t" + MACE_PRICE + "\n" +
							   "4. Magic Ring\t\t" + MAGIC_RING_PRICE + "\n" +
							   "5. Healing Potion\t" + HEALING_POTION_PRICE + "\n");
							   
			//obtain user item choice
			System.out.print("Enter the item number: ");
			itemNum = keyboard.nextInt();
			
			//set the item cost, depending on item choice
			switch(itemNum){
				case 1:
					itemPrice = LONG_SWORD_PRICE;
					itemName = "Long Sword";
					break;
				case 2:
					itemPrice = SHORT_SWORD_PRICE;
					itemName = "Short Sword";
					break;
				case 3:
					itemPrice = MACE_PRICE;
					itemName = "Mace";
					break;
				case 4:
					itemPrice = MAGIC_RING_PRICE;
					itemName = "Magic Ring";
					break;
				case 5:
					itemPrice = HEALING_POTION_PRICE;
					itemName = "Healing Potion";
					break;
				default:
					itemPrice = 0;
					break;
			}//end switch
			
			//obtain item quantity
			System.out.print("Enter the quantity: ");
			itemQuantity = keyboard.nextInt();
			
			//calculate cost
			subtotal = itemPrice * itemQuantity;
			
			//determine discount if number of items is 3 or more
			if(itemQuantity >= 3){
				discount = (int)(subtotal * DISCOUNT_RATE);
			}//end if
			
			//determine final total
			total = subtotal - discount;
			
			//display output
			System.out.println("\nTotal cost: " + subtotal + " gold\n" +
							   "Discount: " + discount + " gold\n" +
							   "Final cost: " + total + " gold\n");
			
			//check for sufficient funds
			if(total > cAttributes[4]){
				System.out.println(cNames[0] + " - you have insufficient funds!");
			}
			else{
				switch(itemNum){
					case 1:
						cAttributes[2] = LONG_SWORD_MIN_DMG;
						cAttributes[3] = LONG_SWORD_MAX_DMG;
						break;
					case 2:
						cAttributes[2] = SHORT_SWORD_MIN_DMG;
						cAttributes[3] = SHORT_SWORD_MAX_DMG;
						break;
					case 3:
						cAttributes[2] = MACE_MIN_DMG;
						cAttributes[3] = MACE_MAX_DMG;
						break;
					case 4:
						cAttributes[1] += 5 * itemQuantity;
						break;
					case 5:
						cAttributes[0] += 10 * itemQuantity;
						break;
					default:
						itemPrice = 0;
						break;
				}//end switch
				
				cAttributes[4] -= total;
						
				if(itemNum == 5)
					System.out.println("You purchased: " + itemName + ". Your HP is now : " + cAttributes[0]);
				else if(itemNum == 4)
					System.out.println("You purchased: " + itemName + ". Your strength is now : " + cAttributes[1]);
				else
					System.out.println("You purchased: " + itemName + ". Your weapon damage is now : " + cAttributes[2] + " - " + cAttributes[3]);
			
				//narrative text
				System.out.println("Thank you, " + cNames[0] + "! Your transaction is complete!\n");
				System.out.println("Your remaining funds: " + cAttributes[4] + "\n");
			}//end else
				
			System.out.println("Enter 1 to make another purchase or 0 to continue on your journey: ");
			repeat = keyboard.nextInt();
		}while(repeat == 1);
	}//end itemShop
}//end class