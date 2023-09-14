package Arrays;

/*public class Cars {
    public static void main(String[] ars)
    {
        // Array -- It is a variavle that stores nultiple values 
        // 1 way to write arrays 
        String[] cars= {"","Benz","","Farrari"};
        System.out.println(cars[1]);
    }
}*/
//  ANOTHER METHOD OF WRITE ARRAYS ARE 

public class Cars {
    public static void main(String[] ars)
    {
        // Array -- It is a variavle that stores nultiple values 
       String[] cars = new String[4];
       cars[0]="Maruti";
       cars[1]="Range Rover";
       cars[2]="Land Rover";
       cars[3]="Gang Rover";

       for(int i=0;i<=cars.length;i++)
       {
        System.out.println(cars[i]);
       }
    }
}
