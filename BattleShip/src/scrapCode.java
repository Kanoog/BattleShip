import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class scrapCode {
	
	
	public static void main(String args[]) {
//		int[][] array = new int[3][2];
//		
//		int x = 0;
//		for(int i = 0; i < 3; i++) {
//			array[i][0] = 8;
//			array[i][1] = 9;
//		}
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 2; j++) {
//				System.out.print(array[i][j]);
//			}
//		}
		
//		boolean doneChecking = false;
//		
//		do {
//			
//			for(int j = 0; j < shipSize; j++) {
//				if(this.computerBoard[tempX][tempY] != -1) { // then no free space
//					x = random.nextInt(this.BOARD_LENGTH); 
//					y = random.nextInt(this.BOARD_LENGTH);
//					
//				}
//			}
//			
//		}while(!doneChecking);
//		int shipSize = 3;
//		int x = 3;
//		int y = 3;
//		
//		int[][] array = {{-1,-1},{3,3},{4,3}};
//		
//		boolean doneChecking = false;
//		
//		while(!doneChecking) {
//
//			int tempX = x;
//			int tempY = y;
//			
//			for(int i = 0; i < shipSize; i++) {
//				if(array[][]) {
//					
//				}
//			}
//		}
		
		Random random = new Random();
		
		System.out.println( random.nextInt(8));
		
	}
	
	
	// Generate the number of ships that will be placed on the board. 
	// Min # of ships = 3. Max # of ships = 5.
//	public void numberOfShips() {
//		Random random = new Random();
//		
//		this.ships = random.nextInt(3) + 3; 
//		
////		System.out.println(this.ships + "\n");
//
//	}
	
//	
//	ArrayList<List<Integer>> coordinates = new ArrayList<List<Integer>>();
//	
//	List<Integer> section1 = new ArrayList<Integer>();
//	
//	section1.add(1);
//	section1.add(2);
//	
//	coordinates.add(section1);
//	
//	List<Integer> section2 = new ArrayList<Integer>();
//	section2.add(1);
//	section2.add(3);
//	
//	coordinates.add(section2);
//	
//	List<Integer> section3 = new ArrayList<Integer>();
//	section3.add(1);
//	section3.add(4);
//	
//	coordinates.add(section3);
	
	
//	if((x + shipSize > this.BOARD_LENGTH) || (x - shipSize < this.BOARD_LENGTH) || (this.computerBoard[x][y] == -1)) {
//		x = random.nextInt(this.BOARD_LENGTH);
//	}
	
	
	
//	if(position == 0) {
//	if((y + shipSize) > this.BOARD_LENGTH){
//		right = true;
//	}else if((y - shipSize) < this.BOARD_LENGTH) {
//		left = true;
//	}
//}

//boolean initialSpace = true;
//while(!initialSpace) {
//	x = random.nextInt(this.BOARD_LENGTH); 
//	y = random.nextInt(this.BOARD_LENGTH);
//	
//	if(this.computerBoard[x][y] == -1) {
//		initialSpace = false;
//	}
//}
	
	
//	public void placeShipsOnBoard() {
//		populateInitialBoard();
//		
//		Random random = new Random();
//		int x = -1;
//		int y = -1;
//		int position = -1;
//		int shipSize = 0;
////		boolean plus, minus = false;
//
//
//		
//		// start of for-loop to create each ship
//		for(int i = 0; i < this.numOfShips; i++) { // for loop will place each ship on the board
//			System.out.println("Inside loop to create ship");
//			
//			shipSize = random.nextInt(3) + 1; // randomly generate a size for the ship. 1 < size < 3
//			System.out.println("Ship size is " + shipSize);
//			position = shipPosition(); // 0 for horizontal ship or 1 for vertical ship placement on the board
//			int[][] shipSections = new int[shipSize][2]; // array to hold each coordinate (x,y) of the ship section(s);
//			String shipName = "Ship " + (i+1); // create the name of the ship	
//			boolean plus, minus = false;
//			
//			x = random.nextInt(this.BOARD_LENGTH); 
//			y = random.nextInt(this.BOARD_LENGTH);
//			
//			System.out.println("Position is " + position);
//			System.out.println("Initial x " + x + " and y " + y);
//			
//			// generate the x,y coordinates for the ship up to the size it was given
//			// and check the board for collisions before placing the ship down in those spaces
//			
//			if(position == 1) { // ship is going to have vertical position on the board
//				
//				System.out.println("--------- VERTICAL PLACEMENT ----------");
//				
//				if((x + shipSize) > this.BOARD_LENGTH && x >= 3) { // this conditional position will determine if the ship orientation will
//					System.out.println("Have to minus from x");
//					minus = true;						   // be placed at x++ or x-- for vertical and or y++ or y-- for horizontal
//				}else if((x - shipSize) < 0) {
//					System.out.println("Have to add to x");
//					plus = true;
//				}else {
//					// default orientation will be down
//					plus = true;
//				}
//				
//				if(minus == true) {
//					
//					boolean doneChecking = false;
//					
//					while(!doneChecking) {
//						
//						System.out.println("In check while loop");
//						
//						int tempX = x;
//						int tempY = y;
//						int count = 0;
//						
//						for(int j = 0; j < shipSize; j++) {
//							System.out.println("temp x " + tempX + " and temp y " + tempY);
//							if(this.computerBoard[tempX][tempY] == -1) { // then free space
//								tempX--;
//								count++;
////								continue;
//							}else {
//								System.out.println("CREATING NEW X AND Y COORDINATES");
//								x = random.nextInt(7) + 3; 
//								y = random.nextInt(this.BOARD_LENGTH);
//								break;
//							}
//						}
//						
//						if(count == shipSize) {
//							doneChecking = true;
//						}
//						
//					}
//					
//					for(int j = 0; j < shipSize; j++) {
//						System.out.println("Made it to adding ship to board loop");
//						if(this.computerBoard[x][y] == -1) { // then free space
//							shipSections[j][0] = x;
//							shipSections[j][1] = y;
//							this.computerBoard[x][y] = 0; // mark the space taken
//						}
//						x--;
//					}
//					
//					for(int k = 0; k < shipSize; k++) {
//						for(int j = 0; j < 2; j++) {
//							System.out.print(shipSections[k][j]);
//						}
//						System.out.println();
//					}
//					
//
//				}else {
//					System.out.println("I'm here IN THE PLUS OPTION");
//					boolean doneChecking = false;
//					
//					while(!doneChecking) {
//						
//						System.out.println("In check while loop for PLUS");
//						
//						int tempX = x;
//						int tempY = y;
//						int count = 0;
//						
//						for(int j = 0; j < shipSize; j++) {
//							System.out.println("PLUS SECTION temp x " + tempX + " and temp y " + tempY);
//							if(this.computerBoard[tempX][tempY] == -1) { // then free space
//								tempX++;
//								count++;
////								continue;
//							}else {
//								System.out.println("CREATING NEW X AND Y COORDINATES PLUS");
//								x = random.nextInt(8); 
//								y = random.nextInt(this.BOARD_LENGTH);
//								break;
//							}
//						}
//						
//						if(count == shipSize) {
//							doneChecking = true;
//						}
//						
//					}
//					
//					for(int j = 0; j < shipSize; j++) {
//						System.out.println("Made it to adding ship to board loop PLUS");
//						if(this.computerBoard[x][y] == -1) { // then free space
//							shipSections[j][0] = x;
//							shipSections[j][1] = y;
//							this.computerBoard[x][y] = 0; // mark the space taken
//						}
//						x++;
//					}
//					
//					for(int k = 0; k < shipSize; k++) {
//						for(int j = 0; j < 2; j++) {
//							System.out.print(shipSections[k][j]);
//						}
//						System.out.println();
//					}
//				}
//	
//				// while loop to check the validity of the spaces for the ships
//				
//			}else{ // ship is going to have horizontal position on the board
//				//continue;
//				
//				System.out.println("--------- HORIZONTAL PLACEMENT ----------");
//				
//				if((y + shipSize) > this.BOARD_LENGTH && y >= 3) { // this conditional position will determine if the ship orientation will
//					System.out.println("Have to minus from x");
//					minus = true;						   // be placed at x++ or x-- for vertical and or y++ or y-- for horizontal
//				}else if((y - shipSize) < 0) {
//					System.out.println("INSIDE HORIZONTAL PLUS");
//					plus = true;
//				}else {
//					// default orientation will be down
//					System.out.println("INSIDE HORIZONTAL PLUS DEFAULT");
//					plus = true;
//				}
//				
//				if(minus == true) {
//					System.out.println("Inside HORIZONTAL MINUS CONDITION");
//					boolean doneChecking = false;
//					
//					while(!doneChecking) {
//						
//						System.out.println("In check while loop");
//						
//						int tempX = x;
//						int tempY = y;
//						int count = 0;
//						
//						for(int j = 0; j < shipSize; j++) {
//							System.out.println("temp x " + tempX + " and temp y " + tempY);
//							if(this.computerBoard[tempX][tempY] == -1) { // then free space
//								tempY--;
//								count++;
////								continue;
//							}else {
//								System.out.println("CREATING NEW X AND Y COORDINATES");
//								x = random.nextInt(this.BOARD_LENGTH); 
//								y = random.nextInt(7) + 3;
//								break;
//							}
//						}
//						
//						if(count == shipSize) {
//							doneChecking = true;
//						}
//						
//					}
//					
//					for(int j = 0; j < shipSize; j++) {
//						System.out.println("Made it to adding ship to board loop");
//						if(this.computerBoard[x][y] == -1) { // then free space
//							shipSections[j][0] = x;
//							shipSections[j][1] = y;
//							this.computerBoard[x][y] = 0; // mark the space taken
//						}
//						y--;
//					}
//					
//					for(int k = 0; k < shipSize; k++) {
//						for(int j = 0; j < 2; j++) {
//							System.out.print(shipSections[k][j]);
//						}
//						System.out.println();
//					}
//					
//
//				}else {
//					System.out.println("I'm here IN THE HORIZONTAL PLUS OPTION");
//					boolean doneChecking = false;
//					
//					while(!doneChecking) {
//						
//						System.out.println("In check while loop for HORIZONTAL PLUS");
//						
//						int tempX = x;
//						int tempY = y;
//						int count = 0;
//						
//						for(int j = 0; j < shipSize; j++) {
//							System.out.println("HORIZONTAL PLUS SECTION temp x " + tempX + " and temp y " + tempY);
//							if(this.computerBoard[tempX][tempY] == -1) { // then free space
//								tempY++;
//								count++;
////								continue;
//							}else {
//								System.out.println("CREATING NEW X AND Y COORDINATES HORIZONTAL PLUS");
//								x = random.nextInt(this.BOARD_LENGTH); 
//								y = random.nextInt(8);
//								break;
//							}
//						}
//						
//						if(count == shipSize) {
//							doneChecking = true;
//						}
//						
//					}
//					
//					for(int j = 0; j < shipSize; j++) {
//						System.out.println("Made it to adding ship to board loop HORIZONTAL PLUS");
//						if(this.computerBoard[x][y] == -1) { // then free space
//							shipSections[j][0] = x;
//							shipSections[j][1] = y;
//							this.computerBoard[x][y] = 0; // mark the space taken
//						}
//						y++;
//					}
//					
//					for(int k = 0; k < shipSize; k++) {
//						for(int j = 0; j < 2; j++) {
//							System.out.print(shipSections[k][j]);
//						}
//						System.out.println();
//					}
//					
//				}
//	
//			} // ELSE SECTION FOR HORIZONTAL ----------------------------------------
//			
//			for(int k = 0; k < this.BOARD_LENGTH; k++) {
//				for(int j = 0; j < this.BOARD_LENGTH; j++) {
//					System.out.print(this.computerBoard[k][j] + " ");
//				}
//				
//				System.out.println();
//			}
//			
//			
//		} // end of the for-loop for placing each ship on the board
//		
//		
//		//System.out.println(shipSize);
//	}
	
	
	
//	public void placeShipsOnBoard() {
//		populateInitialBoard();
//		
//		Random random = new Random();
//		int x = -1;
//		int y = -1;
//		int position = -1;
//		int shipSize = 0;
////		boolean plus, minus = false;
//
//
//		
//		// start of for-loop to create each ship
//		for(int i = 0; i < this.numOfShips; i++) { // for loop will place each ship on the board
//			System.out.println("Inside loop to create ship");
//			
//			shipSize = random.nextInt(3) + 1; // randomly generate a size for the ship. 1 < size < 3
//			System.out.println("Ship size is " + shipSize);
//			position = shipPosition(); // 0 for horizontal ship or 1 for vertical ship placement on the board
//			int[][] shipSections = new int[shipSize][2]; // array to hold each coordinate (x,y) of the ship section(s);
//			String shipName = "Ship " + (i+1); // create the name of the ship	
//			boolean plus, minus = false;
//			
//			x = random.nextInt(this.BOARD_LENGTH); 
//			y = random.nextInt(this.BOARD_LENGTH);
//			
//			System.out.println("Position is " + position);
//			System.out.println("Initial x " + x + " and y " + y);
//			
//			// generate the x,y coordinates for the ship up to the size it was given
//			// and check the board for collisions before placing the ship down in those spaces
//			
//			if(position == 1) { // ship is going to have vertical position on the board
//				
//				System.out.println("--------- VERTICAL PLACEMENT ----------");
//				
//				if((x + shipSize) > this.BOARD_LENGTH && x >= 3) { // this conditional position will determine if the ship orientation will
//					System.out.println("Have to minus from x");
//					minus = true;						   // be placed at x++ or x-- for vertical and or y++ or y-- for horizontal
//				}else if((x - shipSize) < 0) {
//					System.out.println("Have to add to x");
//					plus = true;
//				}else {
//					// default orientation will be down
//					plus = true;
//				}
//				
//				if(minus == true) {
//					
//					boolean doneChecking = false;
//					
//					while(!doneChecking) {
//						
//						System.out.println("In check while loop");
//						
//						int tempX = x;
//						int tempY = y;
//						int count = 0;
//						
//						for(int j = 0; j < shipSize; j++) {
//							System.out.println("temp x " + tempX + " and temp y " + tempY);
//							if(this.computerBoard[tempX][tempY] == -1) { // then free space
//								tempX--;
//								count++;
////								continue;
//							}else {
//								System.out.println("CREATING NEW X AND Y COORDINATES");
//								x = random.nextInt(7) + 3; 
//								y = random.nextInt(this.BOARD_LENGTH);
//								break;
//							}
//						}
//						
//						if(count == shipSize) {
//							doneChecking = true;
//						}
//						
//					}
//					
//					for(int j = 0; j < shipSize; j++) {
//						System.out.println("Made it to adding ship to board loop");
//						if(this.computerBoard[x][y] == -1) { // then free space
//							shipSections[j][0] = x;
//							shipSections[j][1] = y;
//							this.computerBoard[x][y] = 0; // mark the space taken
//						}
//						x--;
//					}
//					
//					for(int k = 0; k < shipSize; k++) {
//						for(int j = 0; j < 2; j++) {
//							System.out.print(shipSections[k][j]);
//						}
//						System.out.println();
//					}
//					
//
//				}else {
//					System.out.println("I'm here IN THE PLUS OPTION");
//					boolean doneChecking = false;
//					
//					while(!doneChecking) {
//						
//						System.out.println("In check while loop for PLUS");
//						
//						int tempX = x;
//						int tempY = y;
//						int count = 0;
//						
//						for(int j = 0; j < shipSize; j++) {
//							System.out.println("PLUS SECTION temp x " + tempX + " and temp y " + tempY);
//							if(this.computerBoard[tempX][tempY] == -1) { // then free space
//								tempX++;
//								count++;
////								continue;
//							}else {
//								System.out.println("CREATING NEW X AND Y COORDINATES PLUS");
//								x = random.nextInt(8); 
//								y = random.nextInt(this.BOARD_LENGTH);
//								break;
//							}
//						}
//						
//						if(count == shipSize) {
//							doneChecking = true;
//						}
//						
//					}
//					
//					for(int j = 0; j < shipSize; j++) {
//						System.out.println("Made it to adding ship to board loop PLUS");
//						if(this.computerBoard[x][y] == -1) { // then free space
//							shipSections[j][0] = x;
//							shipSections[j][1] = y;
//							this.computerBoard[x][y] = 0; // mark the space taken
//						}
//						x++;
//					}
//					
//					for(int k = 0; k < shipSize; k++) {
//						for(int j = 0; j < 2; j++) {
//							System.out.print(shipSections[k][j]);
//						}
//						System.out.println();
//					}
//				}
//	
//				// while loop to check the validity of the spaces for the ships
//				
//			}else{ // ship is going to have horizontal position on the board
//				//continue;
//				
//				System.out.println("--------- HORIZONTAL PLACEMENT ----------");
//				
//				if((y + shipSize) > this.BOARD_LENGTH && y >= 3) { // this conditional position will determine if the ship orientation will
//					System.out.println("Have to minus from x");
//					minus = true;						   // be placed at x++ or x-- for vertical and or y++ or y-- for horizontal
//				}else if((y - shipSize) < 0) {
//					System.out.println("INSIDE HORIZONTAL PLUS");
//					plus = true;
//				}else {
//					// default orientation will be down
//					System.out.println("INSIDE HORIZONTAL PLUS DEFAULT");
//					plus = true;
//				}
//				
//				if(minus == true) {
//					System.out.println("Inside HORIZONTAL MINUS CONDITION");
//					boolean doneChecking = false;
//					
//					while(!doneChecking) {
//						
//						System.out.println("In check while loop");
//						
//						int tempX = x;
//						int tempY = y;
//						int count = 0;
//						
//						for(int j = 0; j < shipSize; j++) {
//							System.out.println("temp x " + tempX + " and temp y " + tempY);
//							if(this.computerBoard[tempX][tempY] == -1) { // then free space
//								tempY--;
//								count++;
////								continue;
//							}else {
//								System.out.println("CREATING NEW X AND Y COORDINATES");
//								x = random.nextInt(this.BOARD_LENGTH); 
//								y = random.nextInt(7) + 3;
//								break;
//							}
//						}
//						
//						if(count == shipSize) {
//							doneChecking = true;
//						}
//						
//					}
//					
//					for(int j = 0; j < shipSize; j++) {
//						System.out.println("Made it to adding ship to board loop");
//						if(this.computerBoard[x][y] == -1) { // then free space
//							shipSections[j][0] = x;
//							shipSections[j][1] = y;
//							this.computerBoard[x][y] = 0; // mark the space taken
//						}
//						y--;
//					}
//					
//					for(int k = 0; k < shipSize; k++) {
//						for(int j = 0; j < 2; j++) {
//							System.out.print(shipSections[k][j]);
//						}
//						System.out.println();
//					}
//					
//
//				}else {
//					System.out.println("I'm here IN THE HORIZONTAL PLUS OPTION");
//					boolean doneChecking = false;
//					
//					while(!doneChecking) {
//						
//						System.out.println("In check while loop for HORIZONTAL PLUS");
//						
//						int tempX = x;
//						int tempY = y;
//						int count = 0;
//						
//						for(int j = 0; j < shipSize; j++) {
//							System.out.println("HORIZONTAL PLUS SECTION temp x " + tempX + " and temp y " + tempY);
//							if(this.computerBoard[tempX][tempY] == -1) { // then free space
//								tempY++;
//								count++;
////								continue;
//							}else {
//								System.out.println("CREATING NEW X AND Y COORDINATES HORIZONTAL PLUS");
//								x = random.nextInt(this.BOARD_LENGTH); 
//								y = random.nextInt(8);
//								break;
//							}
//						}
//						
//						if(count == shipSize) {
//							doneChecking = true;
//						}
//						
//					}
//					
//					for(int j = 0; j < shipSize; j++) {
//						System.out.println("Made it to adding ship to board loop HORIZONTAL PLUS");
//						if(this.computerBoard[x][y] == -1) { // then free space
//							shipSections[j][0] = x;
//							shipSections[j][1] = y;
//							this.computerBoard[x][y] = 0; // mark the space taken
//						}
//						y++;
//					}
//					
//					for(int k = 0; k < shipSize; k++) {
//						for(int j = 0; j < 2; j++) {
//							System.out.print(shipSections[k][j]);
//						}
//						System.out.println();
//					}
//					
//				}
//	
//			} // ELSE SECTION FOR HORIZONTAL ----------------------------------------
//			
//			for(int k = 0; k < this.BOARD_LENGTH; k++) {
//				for(int j = 0; j < this.BOARD_LENGTH; j++) {
//					System.out.print(this.computerBoard[k][j] + " ");
//				}
//				
//				System.out.println();
//			}
//			
//			for(int k = 0; k < shipSize; k++) {
//				for(int j = 0; j < 2; j++) {
//					System.out.print(shipSections[k][j]);
//				}
//				System.out.println();
//			}
//			
////			System.out.println("ship size is: " + shipSize);
////			System.out.println("ship name is: " + shipName);
////			
////			System.out.println("LENGTH OF SHIP ARRAY: " + this.shipArray.length + " and current i: " + i);
//			
//			this.shipArray[i] = new Ship(shipSize, shipName, shipSections);
//			
//			
//		} // end of the for-loop for placing each ship on the board
//		
////		for(int k = 0; k < this.shipArray.length; k++) {
////			System.out.println(this.shipArray[k].getName());
////		}
//		
//		//System.out.println(shipSize);
//	}
	
	
	
//	for(int i = 0; i < this.BOARD_LENGTH; i++) {
//		if(this.hitGuesses[i][0] == x && this.hitGuesses[i][1] == y) return 1;
//		
//		if(this.missedGuesses[i][0] == x && this.missedGuesses[i][1] == y) return 0;
//	}
	
//	for(int i = 0; i < this.guesses; i++) {
//		if(this.hitGuesses[i][0] == x && this.hitGuesses[i][1] == y) return 1;
//	
//		if(this.missedGuesses[i][0] == x && this.missedGuesses[i][1] == y) return 0;
//	}
	
//	
//	return 2;
	
	
	
	
	
	
}
