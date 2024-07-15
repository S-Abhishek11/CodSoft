import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    private static final int MAX_ATTEMPTS = 20;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int won_rounds = 0;
        System.out.println("welcome to the game");
        int attempts = 0;
        boolean guessCorrectly = false;
        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            int numberToGuess = random.nextInt(101);
            System.out.println("Enter the guess : ");
            int userGuess = input.nextInt();
            attempts++;
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations !! you guess correct number. ");
                guessCorrectly = true;
                won_rounds++;
                break;
            } else if (userGuess<numberToGuess) {
                System.out.println("your guess is too low");
            } else {
                System.out.println("your guess is too high");
            }
            if (!guessCorrectly){
                System.out.println("Attempts left : " + (MAX_ATTEMPTS-attempts));
            }
            if (!guessCorrectly) {
                System.out.println("Oops!! you completed your attempts ");
                System.out.println("The correct number was "+numberToGuess);
            }
        }
        
        System.out.println("Thank you for playing!! ");
        System.out.println("Your final score is "+won_rounds);
    }
}

