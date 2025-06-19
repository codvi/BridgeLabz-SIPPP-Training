import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void playGame() {
        int low = 1, high = 100;
        boolean correct = false;

        System.out.println("number between 1 and 100");

        while (!correct && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is it " + guess + "? (Enter: high/low/correct): ");
            String feedback = getUserFeedback();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                correct = true;
                System.out.println("Yay! I guessed your number.");
            } else {
                System.out.println("Invalid input. Please type high, low, or correct.");
            }
        }
    }

    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback() {
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        playGame();
    }
}
