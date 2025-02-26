import java.util.Random;

public class TwoDice {
    private static final Random random = new Random();

    public static int rollDie() {
        return random.nextInt(6) + 1; // Generates a number between 1 and 6
    }

    public static int rollUntilDouble() {
        int count = 0;
        int die1, die2;

        do {
            die1 = rollDie();
            die2 = rollDie();
            count++;
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
        } while (die1 != die2);

        System.out.println("You rolled a double!");
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Rolling the dice...");
        int attempts = rollUntilDouble();
        System.out.println("After " + attempts + " tries, both dice reached the same value.");
    }
}
