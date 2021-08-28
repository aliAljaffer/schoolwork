import java.util.Random;

public class Player {
	Random rng = new Random();
	private String name;
	private int health;
	private int maxDamage;
  
	public Player(String name, int health, int maxDamage) {
		this.name = name;
		this.health = health;
		this.maxDamage = maxDamage;
	}
	
	public void hit(Player other) {
		other.health -= rng.nextInt(maxDamage)+1;
	}
	
	public String toString() {
		return name + " (" + health + ")";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getMaxDamage() {
		return maxDamage;
	}
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}
}
