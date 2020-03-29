package com.startjava.Lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

    public static void main(String[] args) {

        Random guessNumber = new Random();
        int guessedNumber = guessNumber.nextInt(100);

        Scanner player = new Scanner(System.in);
        System.out.println("Game started!");
        System.out.print("Enter the name of the first member: ");
        String name = player.nextLine();

        Scanner playerTwo = new Scanner(System.in);
        System.out.print("Enter the name of the second member: ");
        String nameTwo = playerTwo.nextLine();

        String answer = "Yes";
        while (answer.equals("Yes")) {
            System.out.print("Enter a number from 0 to 100 that the first participant will make: ");
            int number = player.nextInt();
            if (number != guessedNumber) {
                System.out.println("You did not guess the guessed number by computer.");
            } else {
                System.out.println("Hurrah. You guessed!");
            }
            do {
                System.out.print("Want to continue? [Yes/Not]: ");
                answer = player.next();
            } while (!answer.equals("Yes") && !answer.equals("Not"));

        }

        String answerTwo = "Yes";
        while (answerTwo.equals("Yes")) {
            System.out.print("Enter a number from 0 to 100 that the second participant will make: ");
            int number = playerTwo.nextInt();
            if (number != guessedNumber) {
                System.out.println("You did not guess the guessed number by computer.");
            } else {
                System.out.println("Hurrah. You guessed!");
            }
            do {
                System.out.print("Want to continue? [Yes/Not]: ");
                answerTwo = playerTwo.next();
            } while (!answerTwo.equals("Yes") && !answerTwo.equals("Not"));

        }
        System.out.println("Game over!");
    }
}


        