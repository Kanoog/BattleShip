/**
 * 
 * @author kanoog
 *
 */




public class Ship {
	
	private int size;
	private String name;
	private boolean isAlive;
	private int shipHit = 0;
	private int[][] shipCoords; 
	
	public Ship(int size, String name, int[][] array) {
		this.size = size;
		this.name = name;
		this.isAlive = true;
		this.shipCoords = array;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isShipAlive() { // returns the status of if the ship is alive
		return this.isAlive;
	}
	
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
			
//			System.out.println("Current coordinate " + x + " , " + y);
			
			if(x == checkX && y == checkY) {
				
//				System.out.println("HIT");
				shipGotHit();
				return true;
			}
		}
		return false;
		
	}
	
	public void shipGotHit() {
		if(this.shipHit == (size-1)) {
			killShip();
		}else {
			shipHit++;
		}
		System.out.println("The ship was hit: " + shipHit);
	}
	
	public void killShip() {
		this.isAlive = false;
		
		System.out.println("THIS SHIP IS DEAD");
	}
	
	
	public static void main(String args[]) {
		
		int[][] array = {{3,6},{3,7},{3,8}};
		
		
		
		Ship ship = new Ship(3, "ship1", array);
		
		boolean hit = ship.checkShip(3, 7);
		
		System.out.println("Is the ship still alive? " + ship.isShipAlive());
		
		boolean hit2 = ship.checkShip(3, 6);
		System.out.println("Is the ship still alive? " + ship.isShipAlive());
		boolean hit3 = ship.checkShip(3, 8);
		System.out.println("Is the ship still alive? " + ship.isShipAlive());
		
		
//		System.out.println(hit);
		
		
	}
	
	
	
}
