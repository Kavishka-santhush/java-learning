class Car {
    String brand;
    int year;

    // Parametrized Constructor
    public Car(String brand, int year) {
        this.brand = brand; // 'this' refers to the current object
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects and passing values directly via constructor
        Car car1 = new Car("Toyota", 2022);
        Car car2 = new Car("Honda", 2024);

        car1.displayInfo();
        car2.displayInfo();
    }
}