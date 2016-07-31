package mini3;

import java.util.Random;

public class Interactive {

  /**
   * @param args
   */
  public static void main(String[] args) {
	  
     playInteractive();
  }
  
  /**
   * Play interactively with a random player.
   */
  private static void playInteractive()
  {
    int seed = (int) System.currentTimeMillis() % 1000;
    System.out.println("Using seed " + seed);
    Random rand = new Random(seed);
    Player[] players = {new RandomPlayer(rand), new InteractivePlayer()};
    TicTacToeGame game = new TicTacToeGame(players);
    game.run();
    game.printCurrentStatus();
  }
  
}