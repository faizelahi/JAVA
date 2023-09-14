package Arrays;

public class sum {
    public static void main (String[] args)
    {
       // Write a Java program to find the sum of all elements in an integer array
       // declare an array
    int[] num = {1,43,54,43,566,545,23,1};
    // decleare sum = 0
    int sum = 0;
        // start for loop and etract the length of the array 
    for(int i=0; i<num.length; i++)
    {
        
       sum += num[i];
        System.out.println(sum);

    }
     
    }
    
}
