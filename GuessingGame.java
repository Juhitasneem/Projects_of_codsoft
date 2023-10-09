import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomnumber = new Random();

        System.out.println("Welcome to the Number Guessing Game");

        int outcome = 0;
        boolean Replay = true;

        while (Replay) {
            int target = randomnumber.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 8;

            System.out.println("Guess a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guessnumber: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempts++;

                if (userGuess == target) {
                    System.out.println("Congratulations! You guessed the number " + target + " in " + attempts + " attempts.");
                    outcome++;
                    break;
                } else if (userGuess < target) {
                    System.out.println("Too low!Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + target + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String ReplayInput = scanner.nextLine();
            Replay = ReplayInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + outcome);

        scanner.close();
    }
}