package Test;

import org.junit.Test;

public class PlayerTest {
	  @Test
	    void testRollDice() {
	        Player player = new Player("TestPlayer", 100, 10, 5);

	        // Perform multiple rolls to ensure randomness
	        for (int i = 0; i < 100; i++) {
	            int result = player.rollDice();
	            assertTrue(result >= 1 && result <= 6, "Dice roll result should be between 1 and 6");
	        }
	    }

	    @Test
	    void testPlayerAttack() {
	        Player attacker = new Player("Attacker", 100, 10, 5);
	        Player defender = new Player("Defender", 100, 10, 5);

	        int attackResult = attacker.rollDice() * attacker.getAttack();
	        int defendResult = defender.rollDice() * defender.getStrength();

	        int damage = Math.max(0, attackResult - defendResult);

	        defender.setHealth(defender.getHealth() - damage);

	        assertTrue(defender.getHealth() >= 0, "Defender's health should not be negative after the attack");
	    }

}
