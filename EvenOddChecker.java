import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        // Get the integer input from the user
        int number = getIntegerInput();

        // Check if the number is even or odd and get the result message
        String result = checkEvenOrOdd(number);

        // Display the result message to the user
        System.out.println(result);
    }

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Validate that the user enters a valid integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input
        }

        // Return the valid integer input
        return scanner.nextInt();
    }

    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        // Use modulo operator to check if the number is even or odd
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
