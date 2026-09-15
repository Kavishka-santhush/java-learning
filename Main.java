// Blueprint (Class)
class Car {
    // Attributes (State)
    String brand;
    int year;

    // Method (Behavior)
    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Object 1 (Stored in Heap, reference in Stack)
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2022;

        // Creating Object 2
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.year = 2024;

        // Calling methods
        car1.displayInfo();
        car2.displayInfo();
    }
}