import java.util.Scanner;
public class Table
{
    public static void main(String[] args)
    { 
        try (Scanner input = new Scanner(System.in)) {
            //WAP that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
            System.out.println("Enter the Number To Generate Table");
            int num = input.nextInt();
            for(int i=1; i<=10;i++)
            {
                System.out.println(num +" x "+i+" = "+(num*i));
            }
        }
    }
}