import java.util.Scanner;

public class CalculatorWithLoop  // Creating calculator in loop (We use loop because java does not support jump statement like goto label)
 {

    public static void main(String[] args) {
        // The main method handles the loop and user interaction
        boolean repeat = true; // Gives the value to the while loop to contionusly repeat
        Scanner scanner = new Scanner(System.in); // Create a scanner to take user input
        
        while (repeat) { // Keep running as long as repeat is true
            System.out.println(" 1: For Addition\n 2: For Multiplication\n 3: For Division\n 4: Exit");
            int choice = scanner.nextInt(); // Get the user's choice from the scanner

            switch (choice) {
                case 1:
                    add(scanner); // Call the add method and give it the scanner
                    break;
                case 2:
                    multiply(scanner); // Call the multiply method and give it the scanner
                    break;
                case 3:
                    division(scanner); // Call the division method and give it the scanner
                    break;
                case 4:
                    repeat = false; // Set repeat to false, so the loop will stop
                    break;
                default:
                    System.out.println("Wrong Input"); // Displayed when none of the above cases match
            }
        }
        
        scanner.close(); // Close the scanner when done to free up resources
    }

    // Method to perform multiplication
    private static void multiply(Scanner scanner) { //i move the creation of the Scanner object outside the individual methods and reuse the same Scanner object throughout the program.
        System.out.println("Enter first value ");
        int a = scanner.nextInt(); // Get the first number from the user
        System.out.println("Enter second value");
        int b = scanner.nextInt(); // Get the second number from the user

        int c = a * b; // Multiply the two numbers
        System.out.println("Result: "+c); // Display the result
    }

    // Method to perform addition
    private static void add(Scanner scanner) {
        System.out.println("Enter first value");
        int a = scanner.nextInt(); // Get the first number from the user
        System.out.println("Enter second value");
        int b = scanner.nextInt(); // Get the second number from the user

        int c = a + b; // Add the two numbers
        System.out.println("Result :"+c); // Display the result
    }

    // Method to perform division
    private static void division(Scanner scanner) {
        System.out.println("Enter first value ");
        int a = scanner.nextInt(); // Get the first number from the user
        System.out.println("Enter second value ");
        int b = scanner.nextInt(); // Get the second number from the user

        int c = a / b; // Divide the two numbers
        System.out.println("Result :"+c); // Display the result
    }
}
