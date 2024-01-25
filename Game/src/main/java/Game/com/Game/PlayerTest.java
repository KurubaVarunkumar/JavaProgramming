package Game.com.Game;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class PlayerTest {
	  @Test
	  public void testPlayMatch() {
	        Player playerA = new Player("Player A", 50, 5, 10);
	        Player playerB = new Player("Player B", 100, 10, 5);

	        Arena arena = new Arena(playerA, playerB);
	        arena.playMatch();

	        // Check that the match ended with a winner
	        assertTrue( "Match should have a winner",playerA.getHealth() <= 0 || playerB.getHealth() <= 0);

	        // Check that the winner has non-negative health
	        Player winner = (playerA.getHealth() > 0) ? playerA : playerB;
	        assertTrue("Winner's health should not be negative",winner.getHealth() >= 0);
	    }
	    

}
