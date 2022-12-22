/**
 * 
 * @author Kanoog Moua and Adam Moua
 *
 */
public class Ship {
	
	/**
	 * The attributes of the ship class including the name of the ship,
	 * the size of the ship, it's life status, how many times it has
	 * been hit, and the coordinates of it's placement on the board
	 */
	private int size;
	private String name;
	private boolean isAlive;
	private int shipHit = 0;
	private int[][] shipCoords; 
	
	/**
	 * @param takes in the size, name, and coordinates of the ship
	 * and initializes them.
	 */
	public Ship(int size, String name, int[][] array) {
		this.size = size;
		this.name = name;
		this.isAlive = true;
		this.shipCoords = array;
	}
	
	/**
	 * return the size of the ship
	 */
	public int getSize() {
		return this.size;
	}
	
	/**
	 * returns the name of the ship
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * returns the life status of the ship
	 */
	public boolean isShipAlive() { 
		return this.isAlive;
	}
	
	/**
	 * Check the player's guess to see it has hit the ship
	 */
	public boolean checkShip(int checkX, int checkY) {
		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < this.size; i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					x = this.shipCoords[i][j];
				}else {
					y = this.shipCoords[i][j];
				}
			}
			
			if(x == checkX && y == checkY) {
				shipGotHit();
				return true;
			}
		}
		return false;	
	}
	
	/**
	 * Increase the number of hits the ship has received
	 */
	public void shipGotHit() {
		if(this.shipHit == (size-1)) {
			killShip();
		}else {
			shipHit++;
		}
		System.out.println("The ship was hit: " + shipHit);
	}
	
	/**
	 * Kill off the ship because the x,y
	 * coordinate(s) of this has been guessed already
	 */
	public void killShip() {
		this.isAlive = false;
		
		System.out.println("THIS SHIP IS DEAD");
	}
	
}
