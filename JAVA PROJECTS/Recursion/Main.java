package Recursion;

public class Main {
    public static void main(String[] args)
    {    // pass the value in a recursion functon
        int result = sum(10);
        System.out.println(result);

    }
    public static int sum(int i)
    {
        if(i>0)
        {
            return i + sum(i-1);         
            //what happens here 
            // 10 + sum(9)         
            // 10 + ( 9 + sum(8) )
            // 10 + ( 9 + ( 8 + sum(7) ) )
            // and soo on.....
            // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
            // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 
        }
        else
        {
            return 0 ;
        }
    }
}
