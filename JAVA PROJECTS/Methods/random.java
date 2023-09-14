package Methods;

import java.util.Random;

public class random {

    public static void main(String[] args)
    {
        Random random = new Random();
        int a = random.nextInt(999999)+1;
        double b = random.nextDouble();
        float c = random.nextFloat();
        int d = random.hashCode();
        System.out.println(a+c+d+b);
    }
}
