// CS1180
// detailed explanations for how classes and their methods work
public class Main {
	public static void main(String[] args) {
		String winner = ""; // where we'll store the winner's name
		Player playerOne = new Player("Patrick Star", 20, 10); // name, health, damage
		Player playerTwo = new Player("King Kong", 150, 60); // a fair fight

    		System.out.println(playerOne.toString() + "\t\t" + playerTwo.toString()); // print initial values
		
		while(playerOne.getHealth()>0 && playerTwo.getHealth()>0) {
			
			playerOne.hit(playerTwo); // player 1 hit
			System.out.println(playerOne.toString() + "\t\t" + playerTwo.toString());
			if(playerTwo.getHealth()<=0) { // check if player1 won, this check is needed because if we dont have it, then playerTwo could be dead after getting hit, but they'd still attack from "the grave" which doesnt make sense here. this is because "while" only checks its condition after the code inside it has been fully executed.
				winner = playerOne.getName();
				break; // break if won
			}
			
			playerTwo.hit(playerOne);// player 2 hit

			System.out.println(playerOne.toString() + "\t\t" + playerTwo.toString());
      
			if(playerOne.getHealth()<=0) { // checks if playerOne died, goes into if{} if dead
				if(playerOne.getName().startsWith("Super Saiyan")){ // checks if the one who died is a super saiyan, if it is, then we go to (A), if it isnt we transform in (B)
		  			winner = playerTwo.getName(); // (A) if we get to here, then its a super saiyan that died. Now this is playerOne's second death(pre-Super Saiyan and post-Super Saiyan), and the game ends and sets winner to PlayerTwo
				}  else { // (B) transformation code
				  String oldName = playerOne.getName(); // stores original player1 name so we can use it later in print
				  playerOne.setName("Super Saiyan " + playerOne.getName()); // adds "super saiyan" before the original name
				  playerOne.setHealth(400); // our player1 is now a super saiyan, so we sets health to 400
				  playerOne.setMaxDamage(200); // and set max damage to 200
				  System.out.println(oldName + " has resurrected himself and transformed into " + playerOne.getName() + "!"); // declares transformation
				}
			}
		}
		System.out.println(winner + " wins!");
	}

}
