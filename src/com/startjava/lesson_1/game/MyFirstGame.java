package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int guessedNumber = 48;
        int guessNumber = 7;

        System.out.println("Start!");

        while (guessNumber != guessedNumber) {
            if (guessNumber > guessedNumber) {
                System.out.println("You entered the number = " + guessNumber + "The number you entered is greater than what the computer made: ");
                guessNumber--;
            }
            if (guessNumber < guessedNumber) {
                System.out.println("You entered the number = " + guessNumber + "The number you entered is less than what the computer made: ");
                guessNumber++;
            }
        }
        System.out.println("You guessed! " + guessedNumber);
        System.out.println("You won! " + guessedNumber);
    }
}