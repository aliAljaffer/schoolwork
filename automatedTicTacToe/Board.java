class Board {
	private char[][] board;

	public Board() {
		board = new char[3][3];
		int count = 1;
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[i].length; j++) {
				board[i][j] = ("" + count++).charAt(0);
			}
		}
	}

	public boolean validateMove(int square) {
		if (square > 0 && square < 10) {
			// available to move to (not X or O currently)
			int row = getRow(square); 
			int col = getCol(square); 
			return board[row][col] != 'X' && board[row][col] != 'O';
		} else {
			return false; // not on board
		}
	}

	public void makeMove(int square, char symbol) {
		if (validateMove(square)) {
			int row = getRow(square); 
			int col = getCol(square); 
			board[row][col] = symbol;
		}
		// TODO throw an exception on invalid moves
	}

	private int getRow(int square) {
		return (square-1) / 3;
	}

	private int getCol(int square) {
		return (square-1) % 3;
	}

	// return values:
	// X -> X has won
	// O -> O has won
	// T -> Game ended in a tie
	// N -> Game is not yet over
	public char isGameOver() {

		// three across
		for (int i=0; i<board.length; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return board[i][0];
			}
		}

		// three vertical
		for (int i=0; i<board.length; i++) {
			if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return board[0][i];
			}
		}

		// diagonal (upper left to lower right)
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			return board[1][1];
		}

		// diagonal (upper right to lower left)
		if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return board[1][1];
		}

		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[i].length; j++) {
				if (Character.isDigit(board[i][j])) {
					return 'N';
				}
			}
		}

		return 'T';
	}

	@Override
	public String toString() {
		String s = "";
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[i].length; j++) {
				s += "\t" + board[i][j];
			}
			s += "\n";
		}
		return s;
	}
}
