import java.io.Console;
import java.util.Random;

public class loops {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(10) + 1;
        while (true) {
            String guessedNumberText = System.console().readLine("Guess the number between 1 and 10:");
            int guessedNumber = Integer.parseInt(guessedNumberText);
            if (guessedNumber == randomNumber) {
                System.out.printf("The random number was d%. You got it! %n", randomNumber);
            return;
            } else {
                System.out.printf(
                        "Tha random number was %d. You did not got it! %n4", randomNumber);
            }
        }
    }
}
