// CS1180 review for classes, fields, and methods inside them
class Player{
	private String name;
	private int health;
	private int coins;
	
	public Player(String name){
		this.name = name;
		health = 100;
		coins = 0;
	}
	public Player(String name, int initialHealth, int initialCoins){
		this.name = name;
		health = initialHealth;
		coins = initialCoins;
	}
	
	public void eat(){
		health+=10;
		if(health>100){
			health = 100;
		}
	}
	public void earnCoins(int amount){
		coins+=amount;
	}
	public boolean canAfford(int price){
		return coins >= price;
	}
	
	public void spendCoins(int amount){
		coins-=amount;
	}

	public String toString(){
		return "Name: " + name + " (Health: " + health + " Coins: " + coins + ")";
	}

  // TODO setters/getters under here
}
