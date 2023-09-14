package Methods;

import java.util.Scanner;

public class hipatenous {
    public static void main(String[] args)
    {
        // To create a hypotenous of a triangle
        double x;
        double y;
        double z;
        try(Scanner scanner = new Scanner(System.in))
        {
             System.out.println("Enter the X side of a triangle");;
             x = scanner.nextInt();
             System.out.println("Enter the Y side value");;
             y = scanner.nextInt(); 
        }
       
         z = Math.sqrt((x*x)+(y*y));
         System.out.println(z);
    }
}
