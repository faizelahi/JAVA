import java.util.Scanner;

public class temp {
    public static void main(String[] args)
    {

        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is temperature outside");
            int temp = scanner.nextInt();
            
            if(temp >= 0 && temp < 15 )
            {
                System.out.println("It's Too Cold Outside");
            }
            else if(temp>15 && temp<30)
            {
                System.out.println("It's Warm Outside");
            }
            else
            {
                System.out.println("Its Too hot Out side");
            }
        }
    }
}
