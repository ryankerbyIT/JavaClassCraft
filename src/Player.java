/**
 * Player Class
 * This class simulates a player in the "First to One Game."
 * Each player starts with 50 points and can roll a die to subtract from their score.
 */
public class Player {
    private String name;
    private int points;

    // Constructor to initialize the player with a name and 50 starting points
    public Player(String name) {
        this.name = name;
        this.points = 50;
    }

    // Method to simulate rolling the die and adjusting points
    public void rollDie(Die die) {
        int rollResult = die.roll();
        if (points - rollResult < 1) {
            points += rollResult; // Add back points if the roll would drop the score below 1
        } else {
            points -= rollResult;
        }
        System.out.println(name + " rolled a " + rollResult + ". Current points: " + points);
    }

    // Method to check if the player has exactly 1 point remaining
    public boolean hasWon() {
        return points == 1;
    }

    // Getter for the player's name
    public String getName() {
        return name;
    }

    // Getter for the player's points
    public int getPoints() {
        return points;
    }
}
