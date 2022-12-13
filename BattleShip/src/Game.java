import java.util.Random;

/**
 * 
 * @author kanoog
 *
 */
public class Game {
	
	public static int numberOfShips() {
		Random random = new Random();
		
		int ships = random.nextInt(3) + 3; 
		
		
		
		System.out.println(ships + "\n");
		return ships; 

	}

	public static void main(String[] args) {
		
		// preliminary code 
		
		System.out.println("Welcome to BattleShip!\n");
		System.out.println("This is a simple one-way Battle Ship game. " + 
							"You, the user, will be able to guess where my ships are hidden on the 10x10 board.\n");
		System.out.println("You have 6 chances to guess where the boats are\n");
		
		Board board = new Board(10,10);
		
		int ships = numberOfShips();
		
		Computer computer = new Computer(ships); // populate the number of ships on the board
		
		System.out.println("There are " + ships + " ships located on the computer's board");
		
//		board.showBoard();
		
		
		
	}

}
