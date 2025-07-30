
import java.util.Random;

public class DigitDissection {

    /**
     * Returns the number of digits in the given number.
     * Postcondition: result >= 1 (since number has at least one digit)
     */
    public static int countDigits(int number) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Returns the sum of the even digits in the given number.
     * Postcondition: result >= 0
     */
    public static int sumEvenDigits(int number) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Returns the average of the digits in the given number.
     * Postcondition: result is >= 0.0 and <= 9.0
     */
    public static double averageOfDigits(int number) {
        // TODO: Implement this method
        return 0.0;
    }

    public static void main(String[] args) {
        int testNum = (int)(Math.random() * 999991) + 10; // Random number between 10 and 1000000
        System.out.println("Random number: " + testNum);

        System.out.println("Number of digits: " + countDigits(testNum));
        System.out.println("Sum of even digits: " + sumEvenDigits(testNum));
        System.out.println("Average of digits: " + averageOfDigits(testNum));
    }
}
