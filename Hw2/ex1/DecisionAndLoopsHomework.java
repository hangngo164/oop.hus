package oop.Hw2.ex1;
import java.util.Scanner;
public class DecisionAndLoopsHomework {
    // Guess Number
    public static void guessNumber() {
        final int secretNumber = (int)(Math.random()*100);
        Scanner in = new Scanner(System.in);
        guessNumber(secretNumber, in);
    }
    public static void guessNumber( int number, Scanner in) {
        int guess;
        int trials = 0;
        System.out.println("Key in your guess: ");
        while (true) {
            guess = in.nextInt();
            trials++;

            if (guess < number) {
                System.out.println("Try higher");
            } else if (guess > number) {
                System.out.println("Try lower");
            } else {
                System.out.println("You got it in " + trials + " trials!");
                break;
            }
        }
    }

    // Guess Word
    public static void guessWord() {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the word to be guessed: ");
        String wordToGuess = in.nextLine().toLowerCase();
        guessWord(wordToGuess, in);
    }
    public static void guessWord(String guessedString, Scanner in) {
        int length = guessedString.length();
        boolean[] guessedPositions = new boolean[length];
        StringBuilder currentGuess = new StringBuilder("_".repeat(length));
        int trials = 0;
        while(true) {
            System.out.println("Trial" + (trials + 1) + ": " + currentGuess);
            System.out.print("Key in one character or your guess word: ");
            String input = in.nextLine().toLowerCase();
            trials++;
            if(input.length() ==1) {
                char guessedChar = input.charAt(0);
                boolean found = false;
                for(int i =0; i < length; i++) {
                    if(guessedString.charAt(i) == guessedChar && !guessedPositions[i]) {
                        guessedPositions[i] = true;
                        currentGuess.setCharAt(i, guessedChar);
                        found = true;
                    }
                }
                if(!found) {
                    System.out.println("Character not in word. Try again.");
                } else {
                    if(input.equals(guessedString)) {
                        System.out.println("Congratulations!");
                        System.out.println("You got it in " + trials + " trials!");
                        break;
                    } else {
                        System.out.println("Wrong guess.Try again.");
                    }
                }
                if(currentGuess.toString().equals(guessedString)) {
                    System.out.println("Congratulations!");
                    System.out.println("You got it in " + trials + " trials!");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        guessNumber();
        guessWord();
    }
}
