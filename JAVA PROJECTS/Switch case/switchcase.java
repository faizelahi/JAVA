import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
            while (repeat) {
                System.out.println(" 1: For Addition\n 2: For Multiplication\n 3: For Division\n");
                int choice = scanner.nextInt();

                // Switch expression //
                switch (choice) {

                    // Case statement

                    case 1:
                        add(scanner);
                        break;
                    case 2:
                        multiply(scanner);
                        break;
                    case 3:
                        division(scanner);
                        break;
                    case 4:
                        repeat = false;
                        break;
                    default:
                        System.out.println("You entered wrong");

                }
            
        }
        scanner.close();
    }

    private static void multiply(Scanner scanner) {

        System.out.println("Enter first value ");
            int a = scanner.nextInt();
            System.out.println("Enter second value");
            int b = scanner.nextInt();

            int c = a * b;
            System.out.println(c);
        
    }

    private static void add(Scanner scanner) {
        System.out.println("Enter first value");
         
            int a = scanner.nextInt();
            System.out.println("Enter second value");
            int b = scanner.nextInt();

            int c = a + b;
            System.out.println(c);
        
    }

    private static void division(Scanner scanner) {
        System.out.println("Enter first value ");
       
            int a = scanner.nextInt();
            System.out.println("Enter second value ");
            int b = scanner.nextInt();

            int c = a / b;
            System.out.println(c);
        

    }
}
