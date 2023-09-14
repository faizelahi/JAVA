import java.util.Scanner;

public class game {
    
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" If you want to quit the game press 'Q' or 'q' ");
            String response = scanner.nextLine();
            if(response.equals("Q") || response.equals("q"))
            System.out.println("You have quit the game");
            else 
            {
                System.out.println("You still play the game ");
            }
        }


    }
}
