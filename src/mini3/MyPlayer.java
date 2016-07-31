package mini3;

import java.util.ArrayList;
import java.util.Random;

public class MyPlayer implements Player {
	private static int counter = 0;
	private Random rand;
	private String myName;
	private int[][] preferredMoves = { { 1, 1 }, { 0, 0 }, { 0, 2 }, { 2, 0 },
			{ 2, 2 }, { 0, 1 }, { 1, 0 }, { 1, 2 }, { 2, 1 } };

	public MyPlayer() {
		this(new Random());
	}

	public MyPlayer(Random givenRand) {
		rand = givenRand;
		myName = "MyPlayer-" + counter++;
		
	}

	@Override
	public Move play(TicTacToeGame g) {
		char[][] b = g.getBoard();
		ArrayList<Move> all = g.getAllLegalMoves();
		int index = rand.nextInt(all.size());
		Move m = null;
		

		// [0][0]
		if (b[0][0] == b[0][1] && b[0][0] != '-') {
			m = new Move(0, 2);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][0] == b[0][2] && b[0][0] != '-') {
			m = new Move(0, 1);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][0] == b[1][0] && b[0][0] != '-') {
			m = new Move(2, 0);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][0] == b[2][0] && b[0][0] != '-') {
			m = new Move(1, 0);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][0] == b[1][1] && b[0][0] != '-') {
			m = new Move(2, 2);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][0] == b[2][2] && b[0][0] != '-') {
			m = new Move(1, 1);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
			// [0][1]
		} else if (b[0][1] == b[0][2] && b[0][1] != '-') {
			m = new Move(0, 0);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][1] == b[1][1] && b[0][1] != '-') {
			m = new Move(2, 1);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][1] == b[2][1] && b[0][1] != '-') {
			m = new Move(1, 1);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
			// [0][2]
		} else if (b[0][2] == b[0][0] && b[0][2] != '-') {
			m = new Move(0, 1);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][2] == b[1][2] && b[0][2] != '-') {
			m = new Move(2, 2);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][2] == b[2][2] && b[0][2] != '-') {
			m = new Move(1, 2);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][2] == b[1][1] && b[0][2] != '-') {
			m = new Move(2, 0);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[0][2] == b[2][0] && b[0][2] != '-') {
			m = new Move(1, 1);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
			// [1][0]
		} else if (b[1][0] == b[2][0] && b[1][0] != '-') {
			m = new Move(0, 0);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[1][0] == b[1][1] && b[1][0] != '-') {
			m = new Move(1, 2);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[1][0] == b[1][2] && b[1][0] != '-') {
			m = new Move(1, 1);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
			// [1][2]
		} else if (b[1][2] == b[2][2] && b[1][2] != '-') {
			m = new Move(0, 2);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[1][2] == b[1][1] && b[1][2] != '-') {
			m = new Move(1, 0);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
			// [2][0]
		} else if (b[2][0] == b[1][1] && b[2][0] != '-') {
			m = new Move(0, 2);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[2][0] == b[2][1] && b[2][0] != '-') {
			m = new Move(2, 2);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[2][0] == b[2][2] && b[2][0] != '-') {
			m = new Move(2, 1);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
			// [2][1]
		} else if (b[2][1] == b[1][1] && b[2][1] != '-') {
			m = new Move(0, 1);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else if (b[2][1] == b[2][2] && b[2][1] != '-') {
			m = new Move(2, 0);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
			// [2][2]
		} else if (b[2][2] == b[1][1] && b[2][2] != '-') {
			m = new Move(0, 0);
			if (g.isLegal(m)) {
				return m;
			} else {
				for (int[] move : preferredMoves) {
					if (b[move[0]][move[1]] == '-') {
						m = new Move(move[0], move[1]);
						return m;
					} else {
						m = all.get(index);
						return m;
					}
				}
			}
		} else {
			for (int[] move : preferredMoves) {
				if (b[move[0]][move[1]] == '-') {
					m = new Move(move[0], move[1]);
					return m;
				} else {
					m = all.get(index);
					return m;
				}
			}
		}
		return m;
	}

	@Override
	public String getName() {
		return myName;
	}

	@Override
	public void gameOver(TicTacToeGame g) {
		// Do nothing
	}

}
