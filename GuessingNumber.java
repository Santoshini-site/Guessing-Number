import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {

        // Initiallize scanner and random number generator
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Specify the range and number of attempts
        int minRange = 10;
        int maxRange = 200;
        int attemptsAllowed = 10;

        // generate a random number within the specified range
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        System.out.println("welcome to the number guessing game :)");
        System.out.println("I have selected a number between " + minRange + "and" + maxRange + ".");
        System.out.println("You have" +  attemptsAllowed + "attempts to guess it.");

        // Intialize attempts counter
        int attempts = 0;

        // game loop

        while (attempts < attemptsAllowed) {
            System.out.println("Enter your guess:");
            int playerGuess = scanner.nextInt();
            attempts++;

            // check the player's guess
            if (playerGuess < minRange || playerGuess > maxRange) {
                System.out.println("please guess a number within the range" + minRange + "to" + maxRange + ".");
            } else if (playerGuess < randomNumber) {
                System.out.println("Too low!!!");
            } else if (playerGuess > randomNumber) {
                System.out.println("Too High!!");
            } else {
                System.out.println(
                        "congratulation!! You have guessed the number"  +  randomNumber  +  "in"  +  attempts  +  "attempts!");
                break;
            }
            
            //inform the player of remaining attempts
            int attemptsRemaining = attemptsAllowed-attempts;
            if (attemptsRemaining > 0){
                System.out.println("you have"+ attemptsRemaining + "attempts remainning");
        
            }else{
                System.out.println("Sorry you have used all your attempts.the number was" + randomNumber + ".");
            }

        }
        //close the scanner
        scanner.close();
    }
}
