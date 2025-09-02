import java.util.*;

public class Project0 {
    public static void main(String[]args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        int randomNum = rand.nextInt(10) + 1;
        int userGuess = 0;

        while (userGuess != randomNum) {
            System.out.print("Guess a number between 1 and 10: ");
            userGuess = scnr.nextInt();

            if (userGuess < randomNum) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNum) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }
    }
}