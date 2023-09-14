public class shape 
    {
        String color;
        shape(String color)
        {
            this.color = color;
        }
        void draw()
        {
            System.out.println("Drawing shape with colour"+ color);

        }
    }
    class circle extends shape{
        double radius;
        circle(String color, double radius){ 
            super(color);
            this.radius = radius;
        }
        @Override
        void draw()
        {
            System.out.println("Draw a circle with color"+color+"and radius"+radius);
        }
         double calculatearea(){
            return Math.PI *radius*radius;

         }


    }
    