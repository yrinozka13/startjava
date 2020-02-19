public class MyFirstGame {	
    public static void main(String[] args) {
        int guessedNumber = 48;
        int i = 0;
        do {
            if(i < guessedNumber) {
                System.out.println("The number you entered is less than what the computer made: " + i);
                i++;
            } else if(i > guessedNumber) {
                System.out.println("The number you entered is greater than what the computer made: " + i);
                i--;
            } 
        } while(i != guessedNumber);
                System.out.println("You guessed! " + guessedNumber);
    }
}