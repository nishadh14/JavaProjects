import java.util.Scanner;
import java.util.Random;

public class NumGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;2
        int score = 0;

        System.out.println("Welcome to Number Game!");

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("\nI've picked a number between " + minRange + " and " + maxRange + ". Guess it!");

            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed it right!");
                    score += attempts - attempt + 1;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("low Number ! Try again.");
                } else if(randomNumber+1 > randomNumber){
                    System.out.println("You Are Too close ! Try again.");
                } else if(randomNumber-1 < randomNumber){
                    System.out.println("You Are Too close ! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempt == attempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game Over! Your total score is: " + score);
        scanner.close();
    }
}