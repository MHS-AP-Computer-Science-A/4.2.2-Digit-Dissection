public class DigitDissection {

    // Postcondition: Returns the number of digits in the given number.
    public static int countDigits(int number) {
        // TODO: Implement this method
        return 0;
    }

    // Postcondition: Returns the sum of the even digits in the given number.
    public static int sumEvenDigits(int number) {
        // TODO: Implement this method
        return 0;
    }

    // Postcondition: Returns the average of the digits in the given number.
    public static double averageOfDigits(int number) {
        // TODO: Implement this method
        return 0.0;
    }



    public static void main(String[] args) {
        Random rand = new Random();

        int testNum = rand.nextInt(99991) + 10; // Random number between 10 and 100000
        System.out.println("Random number: " + testNum);

        System.out.println("Number of digits: " + countDigits(testNum));
        System.out.println("Sum of even digits: " + sumEvenDigits(testNum));
        System.out.println("Average of all digits: " + averageOfDigits(testNum));
    }
}
