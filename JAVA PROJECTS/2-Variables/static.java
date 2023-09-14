import java.util.Scanner;

class dog {
    String name;
    String breed;
    int cost;

    public dog(String name, String breed, int cost) {
        this.name = name;
        this.breed = breed;
        this.cost = cost;
    }
}

class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dog's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter dog's breed: ");
        String breed = scanner.nextLine();

        System.out.print("Enter dog's cost: ");
        int cost = scanner.nextInt();

        dog d = new dog(name, breed, cost);

        System.out.println("Dog's name: " + d.name);
        System.out.println("Dog's breed: " + d.breed);
        System.out.println("Dog's cost: " + d.cost);

        // Close the scanner to release resources
        scanner.close();
    }
}
