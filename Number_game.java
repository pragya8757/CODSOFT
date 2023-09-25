import java.util.Random;
import java.util.Scanner;

public class Number_game {
    public static void guessingGame() {
        Random randomNumber = new Random();
        int numberTOGuess = randomNumber.nextInt(100)+1; // Generate a random number between 1 and 100.
        int numberOfTries = 0; // Initialize the number of tries to 0.
        Scanner sc = new Scanner(System.in);
        boolean win = false; // Initialize the win flag to false.


        System.out.println("Welcome to Number Game! In this GAme you have to predict the correct number generated by computer in betwwen range 1 to 100.");
        System.out.println("The player will get 10 attempts to predict the correct number.");

        while(win == false) { // Continue the game until the player wins or runs out of attempts.
            System.out.println("Guess the number in between range 1 to 100:- ");
            System.out.print("Enter the number:- ");
            int guessNumber = sc.nextInt();
            numberOfTries++;

            if(guessNumber == numberTOGuess) {
                win = true;  // The player has guessed the correct number.
            }
            else if(guessNumber > numberTOGuess) {
                System.out.println("Your guess is too high!");
            }
            else if(guessNumber < numberTOGuess) {
                System.out.println("Your guess is too low!");
            }
            if(numberOfTries == 10) {
                break; // The player has used all their attempts, exit the loop.
            }
        }

        if(win == true) {
            System.out.println("Hurry! You won the game.");
            System.out.println("The correct number is "+numberTOGuess);
            System.out.println("You predict the correct number in "+numberOfTries+" tries.");
            System.out.println("Your score is "+(10-numberOfTries+1)+" out of 10 as you predict the correct number in "+numberOfTries+" tries.");
        }
        else if(numberOfTries == 10) {
            System.out.println("Oops! You lost the game as your number of tries exhausted.");
            System.out.println("The correct number is "+numberTOGuess);
            System.out.println("Your score is 0 out of 10.");
        }
        System.out.println();

        sc.close();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        guessingGame(); // Start the guessing game.
        boolean game = true;

        while(game == true) {
            System.out.println("Do you want to play the game again ?? Press 1 for yes and 0 for no");
            int number = sc.nextInt();

            if(number == 1) { 
                guessingGame(); // Start a new round of the guessing game.
            }
            else {
                game = false;  // Exit the loop if the player chooses not to play again.
            }
        }

        System.out.println("Game Over !!");

        sc.close();
    }
}