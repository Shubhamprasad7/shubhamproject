import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of integers
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        // Check for valid input
        if (n < 2) {
            System.out.println("Please enter at least 2 integers to find the second largest number.");
        } else {
            // Initialize an array to store the integers
            int[] numbers = new int[n];

            // Prompt the user to enter n integers
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Call the method to find the second largest number
            int secondLargest = findSecondLargest(numbers);

            // Display the second largest number
            System.out.println("The second largest number is: " + secondLargest);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to find the second largest number in an array
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the largest and second largest
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num;           // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;    // Update second largest
            }
        }

        return secondLargest;
    }
}
