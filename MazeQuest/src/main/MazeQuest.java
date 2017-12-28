package main;

import java.util.Scanner;

public class MazeQuest {
	
	static Scanner playerInput;
	
	static boolean validResponse = false;

	public static void main(String[] args) {
		
		playerInput = new Scanner(System.in);
		
		System.out.println("<><><><><><><><><><><><><><><><><><><>");
		System.out.println("<>                                  <>");
		System.out.println("<>        Welcome to MazeQuest      <>");
		System.out.println("<>                                  <>");
		System.out.println("<>                                  <>");
		System.out.println("<>               Play               <>");
		System.out.println("<>                                  <>");
		System.out.println("<>               Exit               <>");
		System.out.println("<>                                  <>");
		System.out.println("<><><><><><><><><><><><><><><><><><><>");

		String playRequest = new String();

		validResponse = false;
		while(validResponse == false) {

			playRequest = playerInput.nextLine();

			//Initialize game start
			if(playRequest.equalsIgnoreCase("Play")) {
				validResponse = true;
			}
			//Exit the game
			else if(playRequest.equalsIgnoreCase("Exit")) {
				System.out.println("Logging off...");
				validResponse = true;
				System.exit(0);
			}
			//Backup Case
			else {
				System.out.println("Not a valid response.");
			}


		}
	}
}
