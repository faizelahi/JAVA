import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        String name =" ";
        try (Scanner scanner = new Scanner(System.in)) {
          while(name.isBlank())   // while code first checks the condition then execuites the code if condition is true
          {
            System.out.println("Enter your name");
            name = scanner.nextLine();
          }
        }
      
        System.out.println("Hello "+name);

    }
}
