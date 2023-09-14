public class car{
    private String make;
    private String model;
    private int year;

    public car(String make,String model, int year)
    {
        this.make= make;
        this.model = model;
        this.year = year;
    }
    public void displayinfo()
    {
        System.out.println("Make :"+ make);
        System.out.println("Model  :"+ model);
        System.out.println("year :"+ year);
        
    }
    public class Main{
        public static void main(String[] args){
            car car1 = new car("Ferrari", "veron", 2020);
            car car2 = new car("Maruti Sizuki", " wagon",2018);


            car1.displayinfo();
            car2.displayinfo();
        }
    }
}