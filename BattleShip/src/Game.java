import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Kanoog Moua and Adam Moua
 * 
 * Description : This is the driver class for the BattleShip program.
 * This class should be run in order to get the game going
 *
 */
public class Game {
	
	/**
	 * this method generates the number of ships to be placed on the computer's
	 * board for guessing. The number of ships will vary from 3-5 for each new
	 * game  
	 */
	public static int numberOfShips() {
		Random random = new Random();
		
		int ships = random.nextInt(3) + 3; 

		return ships; 

	}
	
	/**
	 * This method determines if the player is guessing a 
	 * coordinate spot that they have already guesses 
	 *
	 */
	public static boolean isValid(int[][] array, int x, int y) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i][0] == x && array[i][1] == y) return true;
		}
		
		return false;
		
	}
	
	/**
	 * Displays the stats for the game iteration
	 *
	 */
	public static void displayStats(Player player, int sunk) {
		
		System.out.println("\nThank you for playing " + player.getName() + "\n");
		System.out.println("You were able to correctly guess " + player.getWinPoints() + " coordinate points of the computer's ships\n");
		System.out.println("You incorrectly guessed " + player.getLossPoints() + " coordinate points of the computer's ships\n");
		System.out.println("You were able to sink " + sunk + " of the computer's ships\n");
	}

	/**
	 * Main method to enter in to start the game
	 *
	 */
	public static void main(String[] args) {
		
		int guessAvailable = 15;
		int x = -1, y = -1;
		boolean check;
		int[][] alreadyGuessed = new int[15][2]; // TRACKS THE PLAYER'S GUESSES
		int count = 0;
		
		// initializes the alreadyGuessed array to -1 values
		for(int i = 0; i < guessAvailable; i++) {
			for(int j = 0; j < 2; j++) {
				alreadyGuessed[i][j] = -1;
			}
		}
		
		// introduction to the game
		System.out.println("Welcome to BattleShip!\n");
		System.out.println("This is a simple one-way Battle Ship game. " + 
							"You, the user, will be able to guess where my ships are hidden on the 10x10 board.\n");
		System.out.println("You have " + guessAvailable + " chances to guess where the boats are\n");
		
		int ships = numberOfShips();
		
		Computer computer = new Computer(ships); // populate the number of ships on the board
		computer.placeShipsOnBoard();
		
		System.out.println("There are " + ships + " ships located on the computer's board\n");
		System.out.println("Ready to PLAY?\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in your name: ");
		String name= input.nextLine();
		
		Player player = new Player(name);
		
		System.out.println("\nHere is the board: ");
		
		// THIS IS THE WHILE LOOP TO KEEP THE GAME GOING FOR THE NUMBER OF 
		// GUESSES STILL AVAILABEL IN THE GAME
		while(guessAvailable > 0 ) {
			System.out.println("\nguesses available: " + guessAvailable);	
			
			computer.showCurrentBoard();
			
			Scanner inputX  = new Scanner(System.in);
			System.out.print("Enter in your guess for X: ");
			String inX = inputX.nextLine();
			
			Scanner inputY = new Scanner(System.in);
			System.out.print("Enter in your guess for Y: ");
			String inY = inputY.nextLine();
			
			// ------------------- exception handling here -------------------------
			try{
				x = Integer.parseInt(inX);
				y = Integer.parseInt(inY);
				
				boolean guessed = isValid(alreadyGuessed, x, y);
				
				if((x >= 10) || (x < 0) || (y >= 10) || (y < 0) || guessed == true) {
					throw new IndexOutOfBoundsException();
				}
				alreadyGuessed[count][0] = x; 
				alreadyGuessed[count][1] = y;
				count++;
				guessAvailable--;
				
			}catch(NumberFormatException nfe) {
				System.out.println("You did not input a valid number. Please try again.\n");
			}catch(IndexOutOfBoundsException oob) {
				System.out.println("You entered in a number that is out of range. Please try again.\n");
			}
			
			// ------------------- end exception handling here -------------------------
			
			check = computer.checkUserGuess(x, y);
			if(check == true) {
				player.increaseWins();
				System.out.println("Yay! You hit part of a ship!\n");
			}else {
				player.increaseLosses();
				System.out.println("Boo! You did not hit part of a ship!\n");
			}
			
			System.out.println("You've sunk " + computer.shipsSunk + " out of " + ships + " ships on the board.\n");

			
		}
		
		displayStats(player, computer.shipsSunk);
		
		// REVEAL THE SHIPS ON THE BOARD TO THE PLAYER
		System.out.println("HERE IS THE BOARD REVEAL FOR THE ACTUAL PLACEMENT OF THE SHIPS:");
		computer.revealBoard();
		
		// closing out
		input.close();
			
	}

}
