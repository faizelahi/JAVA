import java.util.Scanner;

public class dowhile {
    public static void main(String[] args)
    {
          String name =" ";
        try (Scanner scanner = new Scanner(System.in)) {
          do                  // Do Loop first execuites the code then check the condiotion
          {
            System.out.println("Enter your name");
            name = scanner.nextLine();
          }
          while(name.isBlank());
        }        
        System.out.println("Hello "+name);

    }
}
