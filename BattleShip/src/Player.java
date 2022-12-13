/**
 * 
 * @author Kanoog
 * 
 * The Player class tracks the wins and losses of the player.
 * It also hold the player stats for them.
 *
 */
public class Player {
	
	private String name = "";
	private int wins = 0;
	private int losses = 0; 
	
	public Player(String name) {
		this.name = name;
	}
	
	public int getWinPoints() {
		return this.wins;
	}
	
	public int getLossPoints() {
		return this.losses;
	}
	
	public void increaseWins() {
		this.wins++;
	}
	
	public void increaseLosses() {
		this.losses++;
	}
	
	public String getName() {
		return this.name;
	}

}
