package Recursion;

public class exp1 {
    public static void main(String[] args)
    {
        hello(15);
    }


    private static void hello(int count)
    {
        System.out.println("hello");
        if(count<=1)
       { return;
            
        }
        hello(count-1);
        
    }
}
