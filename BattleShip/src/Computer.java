
import java.util.Random;

/**
 * 
 * @author kanoog
 *
 */
public class Computer {
	
	public int BOARD_LENGTH = 10;
	
	public int[][] computerBoard = new int[BOARD_LENGTH][BOARD_LENGTH];
	public int[][] hitGuesses = new int[BOARD_LENGTH][2];
	public int[][] missedGuesses = new int[BOARD_LENGTH][2];
	public Ship[] shipArray;
	public int numOfShips;
	public int shipsSunk;
	public int hitTracker = 0;
	public int missTracker = 0;
	
	public Computer(int ships) { // number of ships to be placed on the board
		this.numOfShips = ships;
		this.shipArray = new Ship[this.numOfShips];
	}
	
	
	public void populateInitialBoard() {
		
		for(int i = 0; i < this.BOARD_LENGTH; i++) {
			for(int j = 0; j < this.BOARD_LENGTH; j++) {
				this.computerBoard[i][j] = -1;
			}
		}
	}
	
	public boolean spaceTaken(int x, int y) {
		if(this.computerBoard[x][y] == -1) {
			return false;
		}
		
		return true;
	}
	
	public void placeShipsOnBoard() {
		populateInitialBoard();
		
		Random random = new Random();
		int x = -1;
		int y = -1;
		int position = -1;
		int shipSize = 0;
		
		// start of for-loop to create each ship
		for(int i = 0; i < this.numOfShips; i++) { // for loop will place each ship on the board
			
			shipSize = random.nextInt(3) + 1; // randomly generate a size for the ship. 1 < size < 3
			position = shipPosition(); // 0 for horizontal ship or 1 for vertical ship placement on the board
			int[][] shipSections = new int[shipSize][2]; // array to hold each coordinate (x,y) of the ship section(s);
			String shipName = "Ship " + (i+1); // create the name of the ship	
			boolean plus, minus = false;
			
			x = random.nextInt(this.BOARD_LENGTH); 
			y = random.nextInt(this.BOARD_LENGTH);
			
			// generate the x,y coordinates for the ship up to the size it was given
			// and check the board for collisions before placing the ship down in those spaces
			if(position == 1) { // ship is going to have vertical position on the board
				
				if((x + shipSize) > this.BOARD_LENGTH && x >= 3) { // this conditional position will determine if the ship orientation will
					minus = true;						   // be placed at x++ or x-- for vertical and or y++ or y-- for horizontal
				}else if((x - shipSize) < 0) {
					plus = true;
				}else {
					// default orientation will be down
					plus = true;
				}
				
				if(minus == true) {
					
					boolean doneChecking = false;
					
					while(!doneChecking) {
						
						int tempX = x;
						int tempY = y;
						int count = 0;
						
						for(int j = 0; j < shipSize; j++) {
							if(this.computerBoard[tempX][tempY] == -1) { // then free space
								tempX--;
								count++;
							}else {
								x = random.nextInt(7) + 3; 
								y = random.nextInt(this.BOARD_LENGTH);
								break;
							}
						}
						
						if(count == shipSize) {
							doneChecking = true;
						}
						
					}
					
					for(int j = 0; j < shipSize; j++) {
						if(this.computerBoard[x][y] == -1) { // then free space
							shipSections[j][0] = x;
							shipSections[j][1] = y;
							this.computerBoard[x][y] = 0; // mark the space taken
						}
						x--;
					}
					
				}else {
					boolean doneChecking = false;
					
					while(!doneChecking) {

						int tempX = x;
						int tempY = y;
						int count = 0;
						
						for(int j = 0; j < shipSize; j++) {
							if(this.computerBoard[tempX][tempY] == -1) { // then free space
								tempX++;
								count++;
							}else {
								x = random.nextInt(8); 
								y = random.nextInt(this.BOARD_LENGTH);
								break;
							}
						}
						
						if(count == shipSize) {
							doneChecking = true;
						}
						
					}
					
					for(int j = 0; j < shipSize; j++) {
						if(this.computerBoard[x][y] == -1) { // then free space
							shipSections[j][0] = x;
							shipSections[j][1] = y;
							this.computerBoard[x][y] = 0; // mark the space taken
						}
						x++;
					}
				}
	
				// while loop to check the validity of the spaces for the ships
				
			}else{ // SHIP IS GOING TO HAVE HORIZONTAL POSITION ON THE BOARD
				
				if((y + shipSize) > this.BOARD_LENGTH && y >= 3) { // this conditional position will determine if the ship orientation will
					minus = true;						   // be placed at x++ or x-- for vertical and or y++ or y-- for horizontal
				}else if((y - shipSize) < 0) {
					plus = true;
				}else {
					// default orientation will be down
					plus = true;
				}
				
				if(minus == true) {
					boolean doneChecking = false;
					
					while(!doneChecking) {
						
						int tempX = x;
						int tempY = y;
						int count = 0;
						
						for(int j = 0; j < shipSize; j++) {
							if(this.computerBoard[tempX][tempY] == -1) { // then free space
								tempY--;
								count++;
							}else {
								x = random.nextInt(this.BOARD_LENGTH); 
								y = random.nextInt(7) + 3;
								break;
							}
						}
						
						if(count == shipSize) {
							doneChecking = true;
						}
						
					}
					
					for(int j = 0; j < shipSize; j++) {
						if(this.computerBoard[x][y] == -1) { // then free space
							shipSections[j][0] = x;
							shipSections[j][1] = y;
							this.computerBoard[x][y] = 0; // mark the space taken
						}
						y--;
					}
					
				}else {
					boolean doneChecking = false;
					
					while(!doneChecking) {
						
						int tempX = x;
						int tempY = y;
						int count = 0;
						
						for(int j = 0; j < shipSize; j++) {
							if(this.computerBoard[tempX][tempY] == -1) { // then free space
								tempY++;
								count++;
							}else {
								x = random.nextInt(this.BOARD_LENGTH); 
								y = random.nextInt(8);
								break;
							}
						}
						
						if(count == shipSize) {
							doneChecking = true;
						}
						
					}
					
					for(int j = 0; j < shipSize; j++) {
						if(this.computerBoard[x][y] == -1) { // then free space
							shipSections[j][0] = x;
							shipSections[j][1] = y;
							this.computerBoard[x][y] = 0; // mark the space taken
						}
						y++;
					}
				}
	
			} // ELSE SECTION FOR HORIZONTAL END ----------------------------------------
			
			// create and add new ship object to shipArray
			this.shipArray[i] = new Ship(shipSize, shipName, shipSections);
			
		} // end of the for-loop for placing each ship on the board
	}
	
	public int shipPosition() {
		Random random = new Random();
		
		return random.nextInt(2); // 0 for horizontal ship or 1 for vertical ship
		
	}
	
	
	public int sunkedShips() {
		return this.shipsSunk;
	}
	
	
	public boolean checkUserGuess(int checkX, int checkY) {
		
		Ship current;
		boolean hit = false;
		
		for(int i = 0; i < this.numOfShips; i++) {
			current = this.shipArray[i];
			
			hit = current.checkShip(checkX, checkY);
			
			if(hit) {
				this.hitGuesses[this.hitTracker][0] = checkX;
				this.hitGuesses[this.hitTracker][1] = checkY;
				this.hitTracker++;
				
				if(current.isShipAlive() == false) {
					System.out.println("You hit and sunk " + current.getName());
					this.shipsSunk++;
				}else {
					System.out.println("You hit a section of " + current.getName());
				}
				
				break;
			}else {
				this.missedGuesses[this.missTracker][0] = checkX;
				this.missedGuesses[this.missTracker][1] = checkY;
				this.missTracker++;
			}
		}
		return hit;
	}
	
	
	public void showCurrentBoard() {
		
		int check;
		
		for(int num = 0; num < this.BOARD_LENGTH; num++) {
			System.out.print("     " + num + "  ");
		}
		
		System.out.println();
		
		for(int i = 0; i < this.BOARD_LENGTH; i++) {
			
			System.out.print(i + " ");
			for(int j = 0; j < this.BOARD_LENGTH; j++) {
				
				check = checkPosition(i, j);
				if(check == 0) {
					System.out.print("  MISS |");
				}else if(check == 1) {
					System.out.print("  HIT  |");
				}else {
					System.out.print(" (" + i + "," + j + ") |");
				}
				
			}
			System.out.println("\n");
		}
		
		for(int k = 0; k < this.BOARD_LENGTH; k++) {
			for(int j = 0; j < this.BOARD_LENGTH; j++) {
				System.out.print(this.computerBoard[k][j] + " ");
			}
		
			System.out.println();
		}
		
		
	}
	
	public int checkPosition(int x, int y) {
		// check to see if the position on the board has already been guessed
		// if it was guessed and hit part of the ship, then return 1
		// if it was guessed, but missed. Then return 0
		// if the position has not been guessed yet then return 2
		
		for(int i = 0; i < this.BOARD_LENGTH; i++) {
			if(this.hitGuesses[i][0] == x && this.hitGuesses[i][1] == y) return 1;
			
			if(this.missedGuesses[i][0] == x && this.missedGuesses[i][1] == y) return 0;
		}
		
		return 2;
	}
	
	
	
	
	public static void main(String args[]) {
		int ships = 5;
		
		Computer comp = new Computer(ships);
		
		comp.placeShipsOnBoard();
		
		comp.showCurrentBoard();
		
		boolean guess = comp.checkUserGuess(1, 9);
		
		comp.showCurrentBoard();
		
		guess = comp.checkUserGuess(8, 8);
		
		comp.showCurrentBoard();
		
	
	}

}
                                                            