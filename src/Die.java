import java.util.Random;

/**
 * Die Class
 * This class simulates a die with a given number of sides.
 * It provides a method to roll the die and return the result.
 */
public class Die {
    private int sides;
    private Random random;

    // Constructor to initialize the die with the number of sides
    public Die(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    // Method to roll the die and return a random result
    public int roll() {
        return random.nextInt(sides) + 1;
    }
}
