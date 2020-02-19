public class MyFirstGame {
    public static void main(String[] args) {
        int guessedNumber = 48;
        int guessNumber = 0;
        do {
            if (guessNumber < guessedNumber) {
                System.out.println("The number you entered is less than what the computer made: " + guessNumber);
                guessNumber++;
            } else if (guessNumber > guessedNumber) {
                System.out.println("The number you entered is greater than what the computer made: " + guessNumber);
                guessNumber--;
            }
        } while (guessNumber != guessedNumber);
        System.out.println("You guessed! " + guessedNumber);
    }
}