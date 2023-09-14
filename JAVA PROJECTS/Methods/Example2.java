package Methods;
    // Java method to compute the average of three numbers
public class Example2 {
    public static void main(String[] args)
    {
        System.out.println(average(23,24 ,25));
    }
    public static int average(int x, int y, int z)
    {
      int d = x+y+z;
      int result = d/3;
      return result;
       //this can also be written as  
        // return(x+y+z)/3;
    }
}
