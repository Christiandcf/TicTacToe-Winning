package mini3;

import java.util.Random;

public class TicTacToeTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
	  playIterations(1000);
	  
  }
  

  
  /**
   * Play two automated players against each other for multiple iterations.
   */
  private static void playIterations(int numIters)
  {
    int[] counts = new int[3];
    for (int i = 0; i < numIters; ++i)
    {
      Player[] players = {new RandomPlayer(), new MyPlayer()};
      TicTacToeGame game = new TicTacToeGame(players);
      game.run();
      int index = game.getWinner() + 1; // returns -1, 0, or 1
      counts[index] += 1;
    }
    System.out.println("Wins:   " + counts[2]);
    System.out.println("Losses: " + counts[1]);
    System.out.println("Ties:   " + counts[0]);
  }
}
