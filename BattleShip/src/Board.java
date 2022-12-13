/**
 * 
 * @author kanoog
 *
 */
public class Board {
	
	private int x;
	private int y;
	
	public Board(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showBoard() {
		
		int check;
		
		for(int num = 0; num < this.y; num++) {
			System.out.print("     " + num + "  ");
		}
		
		System.out.println();
		
		for(int i = 0; i < this.x; i++) {
			
			System.out.print(i + " ");
			for(int j = 0; j < this.y; j++) {
				
				check = checkPosition();
				if(check == 0) {
					System.out.print("  MISS |");
				}else if(check == 1) {
					System.out.print("  HIT  |");
				}else {
					System.out.print(" (" + i + "," + j + ") |");
				}
				
			}
//			System.out.println("\n   ---------------------------------------");
			System.out.println("\n");
		}
	}
	
	public static int checkPosition() {
		// check to see if the position on the board has already been guessed
		// if it was guessed and hit part of the ship, then return 1
		// if it was guessed, but missed. Then return 0
		// if the position has not been guessed yet then return 2
		
		return 0;
	}
	
//	public static void main(String[] args){
//		Board board = new Board(10,10);
//		
//		board.showBoard();
//	}
}
