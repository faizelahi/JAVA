package Methods;

public class mthd {
    
   public static int min( int x, int y, int z){
        return Math.min(Math.min(x, y),z);

    }
    public static void main(String[] args)
    {
       System.out.println(min(34, 430, 30));
    }
    
}
