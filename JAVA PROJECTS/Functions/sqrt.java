import java.util.Scanner;

public class sqrt {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    double number = scanner.nextDouble();

    double squareRoot = Math.sqrt(number);

    System.out.println("Square root of " + number + " is " + squareRoot);

    // Don't forget to close the scanner to release resources
    scanner.close();
  }
}
