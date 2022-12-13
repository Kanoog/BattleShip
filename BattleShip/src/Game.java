import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author kanoog
 *
 */
public class Game {
	
	public static int numberOfShips() {
		Random random = new Random();
		
		int ships = random.nextInt(3) + 3; 
		
//		System.out.println(ships + "\n");
		return ships; 

	}
	
	public static void displayStats(Player player, int sunk) {
		
		System.out.println("Thank you for playing " + player.getName());
		System.out.println("You were able to correctly guess " + player.getWinPoints() + " coordinate points of the computer's ships\n");
		System.out.println("You incorrectly guessed " + player.getLossPoints() + " coordinate points of the computer's ships\n");
		System.out.println("You were able to sink " + sunk + " of the computer's ships\n");
	}

	public static void main(String[] args) {
		
		// introduction to the game
		int guessAvailable = 15;
		int x = -1, y = -1;
		boolean check;
		
		System.out.println("Welcome to BattleShip!\n");
		System.out.println("This is a simple one-way Battle Ship game. " + 
							"You, the user, will be able to guess where my ships are hidden on the 10x10 board.\n");
		System.out.println("You have " + guessAvailable + " chances to guess where the boats are\n");
		
		int ships = numberOfShips();
		
		Computer computer = new Computer(ships); // populate the number of ships on the board
		computer.placeShipsOnBoard();
		
		System.out.println("There are " + ships + " ships located on the computer's board");
		System.out.println("Ready to PLAY?");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in your name: ");
		String name= input.nextLine();
		
		Player player = new Player(name);
		
		System.out.println("Here is the board: ");
		
		while(guessAvailable > 0 ) {
			System.out.println("guesses available: " + guessAvailable);	
			
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
				
				if((x > 10) || (x < 0) || (y > 10) || (y < 0)) {
//					inputX.close();
//					inputY.close();
					throw new IndexOutOfBoundsException();
				}
				guessAvailable--;
				
			}catch(NumberFormatException nfe) {
				System.out.println("You did not input a valid number. Please try again.\n");
			}catch(IndexOutOfBoundsException oob) {
				System.out.println("You entered in a number that is out or range. Please try again.\n");
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
		System.out.println("Here is the board reveal:");
		computer.revealBoard();
		
		// closing out
		input.close();
		
		
		
	}

}
