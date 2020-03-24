import java.util.Random;

public class GuessNumber {
    private int guessNumber;
    private int guessedNumber;

    public void setGuessedNumber(int guessedNumber) {
        this.guessedNumber = guessedNumber;
    }

    public GuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public String toString() {
        return "GuessNumber{" +
                "guessNumber='" + guessNumber +
                '}';
    }
}
