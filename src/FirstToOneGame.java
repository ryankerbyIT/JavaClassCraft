import java.util.Scanner;

/**
 * FirstToOneGame
 * This program simulates the "First to One Game" for two players.
 * Players take turns rolling a die, and the game continues until one player
 * has exactly 1 point remaining.
 */
public class FirstToOneGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Die die = new Die(6); // 6-sided die

        // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Simulate the game loop
        boolean gameWon = false;
        while (!gameWon) {
            // Player 1's turn
            player1.rollDie(die);
            if (player1.hasWon()) {
                System.out.println(player1.getName() + " wins with 1 point remaining!");
                gameWon = true;
                break;
            }

            // Player 2's turn
            player2.rollDie(die);
            if (player2.hasWon()) {
                System.out.println(player2.getName() + " wins with 1 point remaining!");
                gameWon = true;
                break;
            }
        }

        scanner.close();
    }
}
