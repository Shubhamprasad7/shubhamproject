import java.util.Scanner;
import java.math.BigInteger;

public class FactorialDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the factorial of the number
            BigInteger factorial = calculateFactorial(number);

            // Display the factorial
            System.out.println(number + "! = " + factorial);

            // Calculate the sum of the digits of the factorial
            int digitSum = sumOfDigits(factorial);

            // Display the sum of the digits
            System.out.println("The sum of the digits of " + number + "! is: " + digitSum);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the factorial of a number using BigInteger
    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE; // Start with 1
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i)); // Multiply by each number up to n
        }
        return result;
    }

    // Method to calculate the sum of the digits of a BigInteger
    public static int sumOfDigits(BigInteger number) {
        int sum = 0;

        // Convert the BigInteger to a string to access each digit
        String numberStr = number.toString();

        // Iterate through each character in the string
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Character.getNumericValue(numberStr.charAt(i)); // Convert character to integer and add to sum
        }

        return sum;
    }
}
