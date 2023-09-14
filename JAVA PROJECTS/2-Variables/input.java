import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is your name");
            String name = scanner.nextLine();

            System.out.println("What is your age");
            int age = scanner.nextInt();
            
            System.out.println("hello! " + name + " how are you today?");
            if(age>100)
            {
                System.out.println("Age should no be greater than 100");

            }
            else
            System.out.println("You are " + age + " years old");
        }

    }
}


