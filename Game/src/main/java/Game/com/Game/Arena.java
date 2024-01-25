package Game.com.Game;

public class Arena {
    private Player playerA;
    private Player playerB;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    // Method to simulate a match between two players
    public void playMatch() {
        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            // Player with lower health attacks first
            Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
            Player defender = (attacker == playerA) ? playerB : playerA;

            int attackResult = attacker.rollDice() * attacker.getAttack();
            int defendResult = defender.rollDice() * defender.getStrength();

            int damage = Math.max(0, attackResult - defendResult);

            // Reduce defender's health
            defender.setHealth(defender.getHealth() - damage);

            // Print the match details (you can modify this based on your needs)
            System.out.println(attacker.getName() + " attacks " + defender.getName() + " with damage " + damage);
            System.out.println("Current health - " + playerA.getName() + ": " + playerA.getHealth() +
                    ", " + playerB.getName() + ": " + playerB.getHealth());
        }

        // Print the winner
        Player winner = (playerA.getHealth() > 0) ? playerA : playerB;
        System.out.println(winner.getName() + " wins!");
    }
}
