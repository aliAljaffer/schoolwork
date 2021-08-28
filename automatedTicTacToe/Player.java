import java.util.Random;

class Player {
	private Random rng;
	private char symbol;
	private String name;

	public Player(String name, char symbol) {
		this.name = name;
		this.symbol = '*';
		setSymbol(symbol);
	}

	public int move(Board board) {
		int move = 0;
    rng = new Random();
		do {
			System.out.println(board);
			move = rng.nextInt(9) + 1; // a random integer 1-9
		} while (!board.validateMove(move));

		return move; 
	}

	public String toString() {
		return name;
	}

	public char getSymbol() { return symbol; }
  public String getName(){
    return name;
  }
	public void setSymbol(char symbol) { 
		// discard invalid symbols -- TODO throw exception here
		if (!(symbol == 'O' || symbol == 'X')) return;
		this.symbol = symbol; 
	}
}
