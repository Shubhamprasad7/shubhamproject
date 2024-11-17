import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            // Display the menu
            System.out.println("\n--- Menu Driven Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
            
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                // Input two numbers
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                if (choice == 1) {
                    System.out.println("Result: " + (num1 + num2));
                } else if (choice == 2) {
                    System.out.println("Result: " + (num1 - num2));
                } else if (choice == 3) {
                    System.out.println("Result: " + (num1 * num2));
                } else if (choice == 4) {
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
            } else if (choice == 5) {
                // Exit the loop
                System.out.println("Exiting the calculator. Goodbye!");
                continueCalculating = false;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
