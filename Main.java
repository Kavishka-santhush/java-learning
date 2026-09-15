// 1. SRP: Car class only holds car properties (Single Responsibility)
class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public int getYear() { return year; }
}

// Separate class responsible only for database operations (SRP)
class CarRepository {
    public void saveToDatabase(Car car) {
        System.out.println("Saving " + car.getBrand() + " to the database...");
    }
}

// 2. OCP: Printing interface/class which is open for extension
interface CarPrinter {
    void print(Car car);
}

class ConsolePrinter implements CarPrinter {
    @Override
    public void print(Car car) {
        System.out.println("Printing Car Details -> Brand: " + car.getBrand() + ", Year: " + car.getYear());
    }
}

// If we want a JSON printer tomorrow, we just implement CarPrinter without modifying existing code (OCP)
class JsonPrinter implements CarPrinter {
    @Override
    public void print(Car car) {
        System.out.println("{\"brand\": \"" + car.getBrand() + "\", \"year\": " + car.getYear() + "}");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 2026);

        // Saving using repository (SRP)
        CarRepository repo = new CarRepository();
        repo.saveToDatabase(myCar);

        // Printing using polymorphism and OCP
        CarPrinter printer1 = new ConsolePrinter();
        printer1.print(myCar);

        CarPrinter printer2 = new JsonPrinter();
        printer2.print(myCar);
    }
}