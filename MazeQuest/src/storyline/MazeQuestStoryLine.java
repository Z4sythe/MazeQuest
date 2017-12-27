/* Designed and Written by Brock Forsythe and Zander Forsythe
 */
package storyline;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.omg.Messaging.SyncScopeHelper;

public class MazeQuestStoryLine {

	static Scanner playerInput; // Static makes this usable throughout the
	static Random randomGenerator = new Random();
	// program.
	static boolean playerAlive = true;
	static String playerGender;
	static String playerName;
	static String playerContinue;
	static int currentLevel = 1;
	static int playerSelection;
	static int playerHealth = 0; // need to specify the player health so it isnt always 0
	//should add French Soldier and his stats for the battle sequence on line 85
	//need an experience counter to tell when character has leveled up. Then show how the stats will increase
	//need reputation statistics: hated, hostile, uneasy, neutral, friendly, trusted, exalted
	//need BattleWarden stats as well
	//main menu to return to when BattleMaiden dies
	static int orcEnemyHealth = randomGenerator.nextInt(21) + 5;

	public static void main(String[] args) {
		while (playerAlive == true) {
			playerInput = new Scanner(System.in); // Opens the scanner up for
													// business.

			System.out.println("\n\nDungeon Crawler 1.0");
			System.out.println("It is 1579 in the continent of Europe, when rival kingdoms fight to be on top.");
			System.out.println("\nYou come from a long line of famous knights and calvarymen who have been massively successful, but you want something slightly different.");
			System.out.println("What is your name? Use the space below for your reponse.");
			playerName = playerInput.nextLine();

			System.out.println("Are you Male or Female?");
			playerGender = playerInput.nextLine();

			System.out.println("\nThe BattleWarden is a mighty force who drinks the blood of his foes and crushes the bones of his opposition.");
			System.out.println("This character is an indomitable wall of a person and has a large healthpool as a result.");
			System.out.println("Hit enter to begin your journey. If not, turn back now for there is no return.");
			playerContinue = playerInput.nextLine();
			
			System.out.println("You are " + playerName + " a level " + currentLevel  +  playerGender + " BattleWarden who comes from Gibralter");
			System.out.println("You have recieved a job from the King of Spain to clear out some hidden barrows of the French soldiers that have begun camping within.");
			System.out.println("The first barrow is slightly to the west of the kingdom in the evil forests of Darkwood.");
			System.out.println("Which would you like to do? \n1) Go to the Darkwood Barrow and begin your journey. \n2) Stay in town a little longer.");
			playerSelection = playerInput.nextInt();
			
		if (playerSelection == 1) {
				System.out.println("You head onwards to the Barrow.\nOn the road, you encounter a monster.");
				System.out.println("It is a grotesque looking fiend with red hair and a green body. This must be one of the dangerous orcs you had heard about in your school days.");
				System.out.println("You have " + playerHealth + " health and the orc has " + orcEnemyHealth + " health.");
				System.out.println("Would you like to\n1) Try your luck and attack the orc \n2) Run for your life");
				playerSelection = playerInput.nextInt();
		}
				else if (playerSelection == 2) {

				System.out.println("You continue to put off leaving to go to the Barrow through a series of rationalizations.");
				System.out.println("You are fired and replaced by the King and your life loses purpose.\nAn end.");
				System.exit(0);
				}
		if (playerSelection == 1) {
				// Battle sequence would occur here. Need Orc info and
				// BattleWarden info. (Orc Fight Sequence).
				System.out.println("Congratulations you have defeated your first enemy!");
				System.out.println("You have been awarded " /* + experience(double) */ + " experience");
				System.out.println("You reach the Barrow and two French Guards approach you.");
				System.out.println("Which would you like to do? \n1) Fight them both. \n2) Inform them of the King's intentions.");
				playerSelection = playerInput.nextInt();
			} 
				else if (playerSelection == 2) {
				System.out.println("You attempt to run away, but the Orc is much faster and cuts you down with a sweep of his blade.\nAn end");
				System.exit(0);
				}
		if (playerSelection == 1) {
				// Battle Sequence would occur here between French Soldier (Object) and the Battle Warden (Object)
				System.out.println("You have lost " + /*reputation counter goes here against France*/  " reputation with France and are now uneasy with them.");
				System.out.println("They will be on guard if they see you");
				System.out.println("You have gained " + /*reputation counter goes here for Spain*/ " reputation with Spain and are now friendly with them.");
				System.out.println("You are now able to purchase potions from Spain."); // need potions class for different potions
				System.out.println("You have earned " + /* experience(double)*/  " experience");
				System.out.println("You enter into the Duskwood Barrow and find three different paths to choose from");
				System.out.println("Which path will you take? \n1)The one on the left. \n2)The middle path. \n3)The path on the right."); 
				playerSelection = playerInput.nextInt();
				
		if (playerSelection == 1) {
				System.out.println("You head down the left path and it becomes darker and darker.");
				System.out.println("Hearing hissing noises, you put your sword up in preperation.");
				System.out.println("Five French soldiers run in with torches and begin killing what turned out to be massive spider.");
				System.out.println("They ask why you killed their guards.");
				System.out.println("What would you like to say? \n1) They attacked you and it was merely self defense \n2) You are here to kill them");
					playerSelection = playerInput.nextInt();
					
		if (playerSelection == 1) {
				System.out.println("The soldiers refuse to believe you and quickly strike you down. \nAn end");
				System.exit(0);
					}
				else if (playerSelection == 2) {
					System.out.println("You begin to fight the soldiers and take two down immediately");
					System.out.println("There are only three left. Lets see how you do against them.");
					//Enter a fight here between BattleWarden and the three soldiers
					System.out.println("You are victorious! You earn " + /* reputation counter */ "reputation with Spain");
					System.out.println("You have lost " + /* reputation counter */ "reputation with France.");
					System.out.println("You have earned " + /* experience counter */ "experience.");
					System.out.println("What will you do next? \n1) Continue down the tunnel. \n2) Lay down and rest for the night.");
					playerSelection = playerInput.nextInt();
		if (playerSelection == 1) {
				System.out.println("You begin to hear more noises. They arent noises of humans though.");
				System.out.println("You feel a chill run down your back but its too late.");
				System.out.println("A pack of orcs charge you and deliver blow after blow until you are downed. \nAn end");
					}
				else if (playerSelection == 2) { 
						System.out.println("You are killed in the night by a pack of orcs. \nAn end");
					}
	}
}	
				else if (playerSelection == 2) {
						System.out.println("You take the path in the middle");
						System.out.println("It is a dead end but as you turn around a boulder crushes you from above \nAn end");
						System.exit(0);
					}
				
				else if (playerSelection == 3) {
						System.out.println("You begin traveling down the right path and hear faint voices around the corner.");
						System.out.println("You raise your sword in preparation");
						System.out.println("What would you like to do? \n1) Sneak in and take them out one by one. \n2) Wait until the soldiers go to sleep");
						playerSelection = playerInput.nextInt();
						
		if (playerSelection == 1) {
				System.out.println("You attempt to sneak in but since you are a loud warrior, they shoot you down quickly \nAn end");
				System.exit(0);
						}
				else if(playerSelection == 2) {
						System.out.println("It is finally night time.");
						System.out.println("You carefully walk in and begin killing off the soldiers but the General wakes up ten feet away and draws his sword");
						System.out.println("What will you choose to do \n1) Fight the General \n2) Pick up the bow next to you");
								playerSelection = playerInput.nextInt();
		if (playerSelection == 1) {
				//battle sequence here between General and BattleWarden
				System.out.println("Congratulations you have beat the dungeon!");
				System.out.println("You are victorious! You earn " + /* reputation counter */ "reputation with Spain");
				System.out.println("You have lost " + /* reputation counter */ "reputation with France.");
				System.out.println("You have earned " + /* experience counter */ "experience.");
				System.out.println("You are now level 2 and have a new talent point!");
				//Spot to select talent
				System.out.println("Hit enter to return to Spain.");
				playerContinue = playerInput.nextLine();
				System.out.println("The king rewards your efforts with a level 2 Broadsword.");
				System.out.println("He asks you to head to Duneridge to clear out the cavern of the infesting orcs.");
				System.out.println("What would you like to do? \n1) Accept \n2) Decline");
							}
				else if (playerSelection == 2) {
						System.out.println("You don't know how to shoot a bow and the General strikes you down. \nAn end");
							}
							}
	}
}
				else if (playerSelection == 2) {
					System.out.println("The French soldiers welcome you into the Barrow and you are awarded a level 1 shield"); //class for armor to give it stats and equiping ability
					System.out.println("You decide to join the French in their task to attack Spain");
					System.out.println("You have gained "+ /* reputation counter goes here for France*/ " reputation with France and are now friendly with them.");
					System.out.println("You are now able to purchase potions from France.");
					System.out.println("You have lost " + /* reputation counter goes here for Spain*/ " reputation with Spain and are now uneasy with them.");
					System.out.println("They will be on guard if they see you");
					System.out.println("The French troops are leaving for a Spanish fort they have found, but you have the option of leaving for France instead. ");
					System.out.println("Which would you like to do? \n1) Attack the Spanish fort. \n2) Leave for France");
					playerSelection = playerInput.nextInt();
					
		if (playerSelection == 1) { 
				System.out.println("You attack the Spanish fort but you are easily defeated. \nAn end"); 
				System.exit(0);
			}
			
				else if (playerSelection == 2) {
					System.out.println("You head to France to meet with the king, but you see a nice tavern on your way.");
					System.out.println("What do you do? \n1) Continue to the king. \n2) Walk into the tavern.");
				playerSelection = playerInput.nextInt();
		if (playerSelection == 1) {
				System.out.println("You walk up to the king and he thanks you for warning his troops about the attack.");
				System.out.println("He asks you to go to the dungeons below to collect the debts from the prisoners. If they resist, then he wants you to kill them.");
				System.out.println("Do you accept this quest? \n1 Yes \n2) No");
				playerSelection = playerInput.nextInt();
		if (playerSelection == 1) {
				System.out.println("You enter the dungeon to discover a horrid stench coming from the cells.");
				System.out.println("Walking up to the first prisoner you ask if he is ready to pay.");
				//if else sequence here after random chance he pays. If not he fights you. 
				System.out.println("You continue asking prisoners to pay for several hours until you finally finish.");
				System.out.println("To your right you see a massive door.");
				System.out.println("Do you open the door? \n1) Yes \n2) No");
				playerSelection = playerInput.nextInt();
		if (playerSelection == 1) { 
				System.out.println("You open the door to find a disgusting orcish beast.");
				System.out.println("What would you like to do? \n1) Fight him \n2) Run away");
				playerSelection = playerInput.nextInt();
			}
				else if (playerSelection == 2) {
					System.out.println("You return to the King and he rewards you with 100 gold coins"); //coin system for buying and selling
					System.out.println("He asks you to head to the French fort nearby to talk with the General");
					System.out.println("Do you go? \n1) Yes \n2) No");
					playerSelection = playerInput.nextInt();
			}
		}
				else if (playerSelection == 2) {
					System.out.println("The king becomes upset and casts you out of France. My what a stinker. \nAn end");
		}
		}
				else if (playerSelection == 2) {
					System.out.println("You stay a little too long at the tavern and the king becomes upset with you, revoking his quest. \nAn end");
		}
				}
			}	
		}
	}
}
