import java.util.Scanner;

public class CharacterOccurrenceCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user for a character to search for
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        // Call the method to count occurrences of the character
        int count = countOccurrences(inputString, searchChar);

        // Display the result
        System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");

        // Close the scanner
        scanner.close();
    }

    // Method to count occurrences of a character in a string
    public static int countOccurrences(String str, char ch) {
        int count = 0;

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++; // Increment the count if the character matches
            }
        }

        return count; // Return the total count
    }
}
