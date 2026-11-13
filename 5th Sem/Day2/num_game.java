/*Simulate basic number guessing game, computer randommly selects a taget number 1 and 100, and the player has to guess the correct number
within a limited nummber of attempts*/
import java.util.*;
public class num_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int targetNumber = rand.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 10;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int playerGuess = sc.nextInt();
            attempts++;

            if (playerGuess < 1 || playerGuess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
                continue;
            }

            if (playerGuess == targetNumber) {
                hasWon = true;
                break;
            } else if (playerGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (hasWon) {
            System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
            System.out.println("It took you " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
        }

        sc.close();
    }
}