// an automated version of the ticTacToe activity from CS1181 week 1
import java.util.Random;
class Main {

	public static void main(String[] args) throws Exception {
    Random rng = new Random();
		Player p1 = new Player("Ali", 'X');
		Player p2 = new Player("Fay", 'O');
		Board board = new Board();
		
		Player currentTurn = p1;
    int count = 0; // round counter
		while (board.isGameOver() == 'N') { // N = an ongoing game
			int square = currentTurn.move(board);
      Thread.sleep(500); // for the sake of reading the board before going to the next move
			board.makeMove(square, currentTurn.getSymbol());
      count++;
			if (board.isGameOver() != 'N') {
				break; // this player won
			}
      currentTurn = p2;
      square = currentTurn.move(board);
      Thread.sleep(500);
			board.makeMove(square, currentTurn.getSymbol());
      count++;
      if (board.isGameOver() != 'N') {
				break; // this player won
			} else currentTurn = p1;
		}
    switch(board.isGameOver()){
      case 'X':
        System.out.println(board); // board print here to show the final board
        System.out.println(currentTurn.getName() + " has won! congrats! Game ended in: " + count + " rounds!");
        break;
      case 'O':
        System.out.println(board);
        System.out.println(currentTurn.getName() + " has won! congrats! Game ended in: " + count + " rounds!");
        break;
      case 'T':
        System.out.println(board);
        System.out.println("The game ended in a tie :( Game ended in: " + count + " rounds!");
        break;
    }
	}
}
