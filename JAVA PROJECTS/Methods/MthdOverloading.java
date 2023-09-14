package Methods;

public class MthdOverloading {
public static void main(String[] args)
{
    int m1 = myFunction(32, 43);
   String m2 = myFunction("40","34");
    System.out.println("int"+m1);
    System.out.println("String"+m2);
}



    public static int myFunction(int x, int y)
    {
       return (x+x*2/y-x);
    }
    public static String myFunction(String x, String y)
    {
       return (x+y);
    }
}
