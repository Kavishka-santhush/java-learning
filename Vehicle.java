abstract class Vehicle {
    protected String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Abstract method (Child classes must implement this)
    public abstract void drive();

    // Normal method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}