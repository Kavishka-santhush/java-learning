// 1. Car Class: Responsible ONLY for holding car data
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

// 2. CarDatabaseManager: Responsible ONLY for database operations
class CarDatabaseManager {
    public void saveToDatabase(Car car) {
        System.out.println("[Database] Saving " + car.getBrand() + " (" + car.getYear() + ") to MySQL Database...");
    }
}

// 3. CarPrinter: Responsible ONLY for printing/displaying car details
class CarPrinter {
    public void printCarDetails(Car car) {
        System.out.println("[Printer] Car Info -> Brand: " + car.getBrand() + ", Year: " + car.getYear());
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating car object
        Car myCar = new Car("Tesla Model S", 2026);

        // Using specialized classes for specialized responsibilities
        CarPrinter printer = new CarPrinter();
        printer.printCarDetails(myCar);

        CarDatabaseManager dbManager = new CarDatabaseManager();
        dbManager.saveToDatabase(myCar);
    }
}