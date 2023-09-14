import java.util.Scanner;
public class fun1{
    public static void main(String[] args)
     {
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.println("Enter The choice");
            System.out.println("1. Add");
            System.out.println("2. Multiply");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                    
                case 2:
                multiply();
                break; 
            
                default:
                System.out.println("Invalid choice");
                    break;
            }
        }
     }
     public static void add()
     {
        
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.println("Enter The First Variable");
              int a = scanner.nextInt();

            System.out.println("Enter The Second Variable");
            int b = scanner.nextInt();

            int c = a + b;
            System.out.println("The Sum of these nubmers is "+ c );
        }
     }
    //  Function to multiply the Numbers 
     public static void multiply()
     {
        try (Scanner scan = new Scanner(System.in)) 
        {
            System.out.println("Enter the first number");
            int a = scan.nextInt();
             
            System.out.println("Enter the Second number");
            int b = scan.nextInt();
             int c = a*b;
              System.out.println("The Multiply of these numbers is " + c );
        }
     }
}